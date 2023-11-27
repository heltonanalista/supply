package com.supply.api.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;


@RestControllerAdvice
public class Exceptions {

@ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Errors> NotValid(MethodArgumentNotValidException e){

    return null;
     //   List<Errors> erro=e.getBindingResult().getFieldErrors().stream().map(x-> buildE);
    }

}
