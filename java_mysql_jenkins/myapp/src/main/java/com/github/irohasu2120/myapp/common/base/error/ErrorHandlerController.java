package com.github.irohasu2120.myapp.common.base.error;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.nio.file.AccessDeniedException;
import java.util.List;

@Log4j2
@RestControllerAdvice
public class ErrorHandlerController {

    @ExceptionHandler({AccessDeniedException.class})
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public ErrorRestResponse handleException(AccessDeniedException e) {
        log.error("Error:{}", e.getMessage());
        List<ErrorResponse> errors = List.of(new ErrorResponse(ErrorCodeConstants.COMMON_ERROR.getCode(), "The request was not authorized."));
        var errorRestResponse = new ErrorRestResponse();
        errorRestResponse.setErrors(errors);
        return errorRestResponse;
    }

    @ExceptionHandler({Exception.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorRestResponse handleException(Exception e) {
        log.error("Error:{}", e.getMessage());
        List<ErrorResponse> errors = List.of(new ErrorResponse(ErrorCodeConstants.COMMON_ERROR.getCode(), "SYSTEM ERROR!"));
        var errorRestResponse = new ErrorRestResponse();
        errorRestResponse.setErrors(errors);
        return errorRestResponse;
    }
}
