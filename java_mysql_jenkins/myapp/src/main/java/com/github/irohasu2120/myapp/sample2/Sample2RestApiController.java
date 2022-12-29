package com.github.irohasu2120.myapp.sample2;

import com.github.irohasu2120.myapp.common.base.BaseRestApiController;
import com.github.irohasu2120.myapp.common.base.BaseRestResponse;
import com.github.irohasu2120.myapp.sample2.dto.Sample2RestApiInDto;
import com.github.irohasu2120.myapp.sample2.dto.Sample2RestApiOutDto;
import com.github.irohasu2120.myapp.sample2.service.Sample2RestApiService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequiredArgsConstructor
public class Sample2RestApiController extends BaseRestApiController {

    @Autowired
    private final Sample2RestApiService sample2RestApiService;

    @PostMapping("/sample2/get-sample")
    @ApiOperation(value = "APIの概要", notes = "詳細")
    @ResponseBody
    public BaseRestResponse doPost(@RequestBody Sample2RestApiRequest request) {
        log.debug(request);
        var mapper = new ModelMapper();
        var response = new Sample2RestApiResponse();
        var innerResponse = new Sample2RestApiInnerResponse();

        var inDto = new Sample2RestApiInDto();
        mapper.map(request.getReq(), inDto);
        Sample2RestApiOutDto outDto = sample2RestApiService.doProcess(inDto);

        mapper.map(outDto, innerResponse);
//
//        response.setRes(innerResponse);

        return response;
    }
}
