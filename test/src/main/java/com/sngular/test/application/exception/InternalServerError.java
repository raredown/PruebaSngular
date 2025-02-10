package com.sngular.test.application.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class InternalServerError extends RuntimeException {
	
	private static final long serialVersionUID = -1L;

    public InternalServerError(String message) {
        super(message);
    }
}