package com.github.irohasu2120.myapp.business.threadlab;

import com.github.irohasu2120.myapp.business.threadlab.service.ThreadLabService;
import com.github.irohasu2120.myapp.business.threadlab.service.dto.ThreadLabServiceInDto;
import com.github.irohasu2120.myapp.business.threadlab.service.dto.ThreadLabServiceOutDto;
import com.github.irohasu2120.myapp.common.base.BaseRestApiController;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequiredArgsConstructor
public class ThreadLabController extends BaseRestApiController {

    @Autowired
    private final ThreadLabService threadLabService;

    @Autowired
    private final ModelMapper mapper;

    @GetMapping("/threadlab")
    @ApiOperation(value = "スレッドラボ", notes = "スレッドテスト")
    @ResponseBody
    public ThreadLabResponse doGet() {
        var inDto = new ThreadLabServiceInDto();
        var response = new ThreadLabResponse();
        inDto.setId("1");
//        return threadLabService.tryThread(inDto);
        ThreadLabServiceOutDto outDto = threadLabService.tryThread(inDto);
        mapper.map(outDto, response);
        return response;
    }
}
