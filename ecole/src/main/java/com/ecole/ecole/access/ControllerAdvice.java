package com.ecole.ecole.access;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

@org.springframework.web.bind.annotation.ControllerAdvice
public class ControllerAdvice {


    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ErrorResponse> handleIllegalArgumentException(IllegalArgumentException exception) {

        return new ResponseEntity<>(new ErrorResponse("PARAM_ERROR", exception.getMessage()), HttpStatus.BAD_REQUEST);
    }
}
