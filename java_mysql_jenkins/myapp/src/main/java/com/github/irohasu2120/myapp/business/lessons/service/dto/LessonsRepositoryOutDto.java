package com.github.irohasu2120.myapp.business.lessons.service.dto;

import lombok.Data;

@Data
public class LessonsRepositoryOutDto {
    /** 授業ID */
    private int lessonId;

    /** 授業名 */
    private String lessonName;
}
