package com.github.irohasu2120.myapp.business.threadlab.service;

import com.github.irohasu2120.myapp.business.threadlab.service.dto.JsonPlaceHolderDto;
import com.github.irohasu2120.myapp.business.threadlab.service.dto.ThreadLabServiceInDto;
import com.github.irohasu2120.myapp.business.threadlab.service.dto.ThreadLabServiceOutDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@Log4j2
@Service
@RequiredArgsConstructor
public class ThreadLabServiceImpl implements ThreadLabService {

    @Autowired
    private final RestTemplate restTemplate;

    @Override
    public ThreadLabServiceOutDto tryThread(ThreadLabServiceInDto inDto) {
        var outDto = new ThreadLabServiceOutDto();

        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(3);
            log.debug("1");
            service.execute(() -> outDto.setDto1(sendRest("A")));
            log.debug("2");
            service.execute(() -> outDto.setDto2(sendRest("B")));
            log.debug("3");
            service.execute(() -> outDto.setDto3(sendRest("C")));
            log.debug("4");
        } finally {
            try {
                log.debug("5");
                service.shutdown();
                log.debug("6");
                // awaitTerminationが各スレッドが終了するまで指定秒まで待機するメソッド。超重要。
                if (!service.awaitTermination(10, TimeUnit.SECONDS)) {
                    service.shutdownNow();
                }
                log.debug("6.5");
            } catch (InterruptedException e) {
                service.shutdownNow();
                Thread.currentThread().interrupt();
            } catch (Exception e) {
                log.error(e);
            }
        }

        log.debug("7");

        return outDto;
    }

    private JsonPlaceHolderDto sendRest(String str) {
        log.debug(str + ":Start");
        try {
            return restTemplate.getForObject("http://jsonplaceholder.typicode.com/posts/1", JsonPlaceHolderDto.class);
        } finally {
            log.debug(str + ":End");
        }
    }
}
