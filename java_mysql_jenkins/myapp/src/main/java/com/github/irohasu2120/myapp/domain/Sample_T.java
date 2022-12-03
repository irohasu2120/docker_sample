package com.github.irohasu2120.myapp.domain;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class Sample_T {
    // サンプルID
    private int sampleId;

    // サンプル名
    private String sampleName;

    // サンプル日
    private LocalDate sampleDate;

    // サンプル日時
    private LocalDateTime sampleDatetime;

    // 登録者
    private String create_name;

    // 登録日時
    private LocalDateTime create_datetime;

    // 更新者
    private String update_name;

    // 更新日時
    private LocalDateTime update_datetime;

    // 削除フラグ
    private String delete_flag;
}
