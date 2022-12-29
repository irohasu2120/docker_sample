package com.github.irohasu2120.myapp.common.error;

import com.github.irohasu2120.myapp.common.base.BaseRestResponse;
import lombok.Data;

import java.util.List;

@Data
public class ErrorRestResponse extends BaseRestResponse {
    List<ErrorResponse> errors;
}
