package com.rutasarg.demo.exceptions.errors;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Errors {

    public static final ApiError ERROR = new ApiError
            ("","");

    public static final ApiError ERROR_2 = new ApiError
            ("","");


}
