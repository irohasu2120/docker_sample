package com.github.irohasu2120.myapp.common.base;

import com.github.irohasu2120.myapp.common.base.error.ErrorResponse;
import lombok.Data;

import java.util.List;

@Data
public abstract class BaseRestResponse {
    private Object response;
    private List<ErrorResponse> errors;
}
