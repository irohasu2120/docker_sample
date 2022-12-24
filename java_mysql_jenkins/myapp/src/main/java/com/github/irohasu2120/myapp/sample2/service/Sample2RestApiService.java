package com.github.irohasu2120.myapp.sample2.service;

import com.github.irohasu2120.myapp.sample2.dto.Sample2RestApiInDto;
import com.github.irohasu2120.myapp.sample2.dto.Sample2RestApiOutDto;

public interface Sample2RestApiService {
    Sample2RestApiOutDto doProcess(Sample2RestApiInDto inDto);
}
