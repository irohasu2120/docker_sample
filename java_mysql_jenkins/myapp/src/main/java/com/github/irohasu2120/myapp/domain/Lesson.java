package com.github.irohasu2120.myapp.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@AllArgsConstructor
public class Lesson extends BaseSingleDomain {
    /** 授業ID */
    private int lessonId;

    /** 授業名 */
    private String lessonName;

    /** 公開開始日 */
    private LocalDateTime openDate;

    /** 公開終了日 */
    private LocalDateTime closeDate;
}
