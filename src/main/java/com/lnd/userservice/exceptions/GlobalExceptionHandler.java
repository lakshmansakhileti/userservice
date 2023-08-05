package com.lnd.userservice.exceptions;

import com.lnd.userservice.payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse> handlerResourceNotFoundException(ResourceNotFoundException ex) {
        String message = ex.getMessage();
        ApiResponse response = new ApiResponse(message, false, HttpStatus.NOT_FOUND);
        return new ResponseEntity<ApiResponse>(response, HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(HttpMediaTypeNotAcceptableException.class)
    public ResponseEntity<ApiResponse> handlerHttpMediaTypeNotAcceptableException(HttpMediaTypeNotAcceptableException ex) {
        String message = ex.getMessage();
        ApiResponse response = new ApiResponse(message, false, HttpStatus.UNSUPPORTED_MEDIA_TYPE);
        return new ResponseEntity<ApiResponse>(response, HttpStatus.UNSUPPORTED_MEDIA_TYPE);
    }
 }
