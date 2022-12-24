package com.github.irohasu2120.myapp.sample2.service;

import com.github.irohasu2120.myapp.sample2.dto.Sample2RestApiInDto;
import com.github.irohasu2120.myapp.sample2.dto.Sample2RestApiOutDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class Sample2RestApiServiceImpl implements Sample2RestApiService {
    @Override
    public Sample2RestApiOutDto doProcess(Sample2RestApiInDto inDto) {
        var outDto = new Sample2RestApiOutDto();
        ModelMapper mapper = new ModelMapper();
        mapper.map(inDto, outDto);
        return outDto;
    }
}
