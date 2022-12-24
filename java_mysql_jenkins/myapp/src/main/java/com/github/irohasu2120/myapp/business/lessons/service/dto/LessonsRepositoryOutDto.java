package com.github.irohasu2120.myapp.business.lessons.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LessonsRepositoryOutDto {
    /** 授業ID */
    private int lessonId;

    /** 授業名 */
    private String lessonName;
}
