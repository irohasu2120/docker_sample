package com.github.irohasu2120.myapp.common.base.error;

import lombok.Value;

@Value
public class ErrorResponse {
    String errorCode;
    String message;
}
