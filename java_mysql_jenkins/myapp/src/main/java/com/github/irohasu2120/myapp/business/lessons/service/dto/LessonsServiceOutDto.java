package com.github.irohasu2120.myapp.business.lessons.service.dto;

import lombok.Data;

import java.util.List;

@Data
public class LessonsServiceOutDto {
    private List<LessonsRepositoryOutDto> lessons;
}
