package com.github.irohasu2120.myapp.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * サンプルTドメイン
 */
@Data
@ToString(callSuper = true)
@AllArgsConstructor
public class SampleT extends BaseSingleDomain {
    // サンプルID
    private int sampleId;

    // サンプル名
    private String sampleName;

    // サンプル日
    private LocalDate sampleDate;

    // サンプル日時
    private LocalDateTime sampleDatetime;
}
