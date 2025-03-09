package io.github.flss2502.travelflow.exceptions;

import io.github.flss2502.travelflow.shared.enums.ResponseEnum;

public class AppExceptions extends RuntimeException {

    public AppExceptions(ResponseEnum errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    private ResponseEnum errorCode;
}
