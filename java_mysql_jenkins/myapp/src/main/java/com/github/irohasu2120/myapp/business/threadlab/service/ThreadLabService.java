package com.github.irohasu2120.myapp.business.threadlab.service;

import com.github.irohasu2120.myapp.business.threadlab.service.dto.ThreadLabServiceInDto;
import com.github.irohasu2120.myapp.business.threadlab.service.dto.ThreadLabServiceOutDto;

public interface ThreadLabService {
    ThreadLabServiceOutDto tryThread(ThreadLabServiceInDto inDto);
}
