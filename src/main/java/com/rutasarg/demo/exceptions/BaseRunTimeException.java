package com.rutasarg.demo.exceptions;

import com.rutasarg.demo.exceptions.errors.ApiError;
import lombok.Getter;

@Getter
public class BaseRunTimeException extends RuntimeException {

    private final ApiError apiError;

    public BaseRunTimeException(ApiError apiError) {
        this.apiError = apiError;
    }

}
