package com.github.irohasu2120.myapp.sample.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 個人DTO
 */
@Data
@AllArgsConstructor
public class Person {

    @ApiModelProperty(value = "個人ID")
    private String id;

    @ApiModelProperty(value = "個人名")
    private String name;
}
