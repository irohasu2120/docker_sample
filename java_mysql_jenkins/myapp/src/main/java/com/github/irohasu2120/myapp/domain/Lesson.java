package com.github.irohasu2120.myapp.domain;

import lombok.Data;

import java.sql.Date;
import java.time.LocalDateTime;

@Data
public class Lesson {
    // 授業ID
    private int lesson_id;

    // 授業名
    private String lesson_name;

    // 公開開始日
    private Date open_date;

    // 公開終了日
    private LocalDateTime close_date;

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
