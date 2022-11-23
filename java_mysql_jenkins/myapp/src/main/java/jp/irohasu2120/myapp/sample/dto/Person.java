package jp.irohasu2120.myapp.sample.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 個人DTO
 */
@Data
@AllArgsConstructor
public class Person {
    /** 個人ID */
    private String id;
    /** 個人名 */
    private String name;
}
