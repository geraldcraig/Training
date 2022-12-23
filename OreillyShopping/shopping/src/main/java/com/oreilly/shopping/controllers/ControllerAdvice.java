package com.oreilly.shopping.controllers;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;

@RestControllerAdvice
public class ControllerAdvice {

//    @ExceptionHandler(EmptyResultDataAccessException.class)
//    @ResponseStatus(HttpStatus.NOT_FOUND)
//    public String handleEmptyResultDataAccessException(EmptyResultDataAccessException ex) {
//        return ex.getMessage();
//    }

    @ExceptionHandler(ProductNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String productNotFoundHandler(ProductNotFoundException ex) {
        return ex.getMessage();
    }

    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String constraintViolation(ConstraintViolationException ex) {
        return ex.getConstraintViolations().toString();
    }




}
