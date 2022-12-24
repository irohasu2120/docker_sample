package com.github.irohasu2120.myapp.business.lessons.service;

import com.github.irohasu2120.myapp.business.lessons.service.dto.LessonsServiceInDto;
import com.github.irohasu2120.myapp.business.lessons.service.dto.LessonsServiceOutDto;

public interface LessonsService {
    LessonsServiceOutDto getLessons(LessonsServiceInDto inDto);
}
