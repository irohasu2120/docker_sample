package com.github.irohasu2120.myapp.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.sql.Date;
import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Lesson extends BaseSingleDomain {
    /** 授業ID */
    private int lessonId;

    /** 授業名 */
    private String lessonName;

    /** 公開開始日 */
    private Date openDate;

    /** 公開終了日 */
    private LocalDateTime closeDate;
}
