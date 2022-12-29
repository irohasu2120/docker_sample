package com.github.irohasu2120.myapp.common.error;

import lombok.Getter;

public enum ErrorCodeConstants {
    COMMON_ERROR("9000");

    @Getter
    private final String code;

    ErrorCodeConstants(String code) {
        this.code = code;
    }
}
