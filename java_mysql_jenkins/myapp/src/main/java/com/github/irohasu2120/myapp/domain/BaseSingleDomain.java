package com.github.irohasu2120.myapp.domain;

import lombok.*;

import java.time.LocalDateTime;

/**
 * 単体テーブル検索用基底ドメイン
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseSingleDomain {

    /** 登録者 */
    private String createName;

    /** 登録日時 */
    private LocalDateTime createDatetime;

    /** 更新者 */
    private String updateName;

    /** 更新日時 */
    private LocalDateTime updateDatetime;

    /** 削除フラグ */
    private String deleteFlag;
}
