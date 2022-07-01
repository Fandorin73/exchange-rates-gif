package com.alfabank.exchangeratesgif.exception.handler;

import com.alfabank.exchangeratesgif.exception.BaseException;
import com.alfabank.exchangeratesgif.exception.response.Response;
import feign.FeignException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    public GlobalExceptionHandler() {
        super();
    }
    @ExceptionHandler(FeignException.class)
    public ResponseEntity<Response> FeignException(Exception e) {
        return new ResponseEntity<>(new Response(e.getMessage()), HttpStatus.METHOD_NOT_ALLOWED);
    }
    @ExceptionHandler(BaseException.class)
    public ResponseEntity<Response> BaseException(Exception e) {
        return new ResponseEntity<>(new Response(e.getMessage()), HttpStatus.FORBIDDEN);
    }
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Response> otherException(Exception e) {
        return new ResponseEntity<>(new Response(e.getMessage()), HttpStatus.BAD_REQUEST);
    }
}