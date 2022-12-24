package com.github.irohasu2120.myapp.business.lessons;

import com.github.irohasu2120.myapp.business.lessons.service.dto.LessonsRepositoryOutDto;
import lombok.Data;

import java.util.List;

@Data
public class LessonsInnerResponse {
    private List<LessonsRepositoryOutDto> lessons;
}
