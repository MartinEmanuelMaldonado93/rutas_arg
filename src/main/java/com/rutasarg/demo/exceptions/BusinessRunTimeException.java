package com.rutasarg.demo.exceptions;

import com.rutasarg.demo.exceptions.errors.ApiError;

public class BusinessRunTimeException extends BaseRunTimeException {

    public BusinessRunTimeException(ApiError apiError) {
        super(apiError);
    }
}
