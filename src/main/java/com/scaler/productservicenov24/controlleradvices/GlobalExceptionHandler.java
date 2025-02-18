package com.scaler.productservicenov24.controlleradvices;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.scaler.productservicenov24.exceptions.ProductNotFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(ProductNotFoundException.class)
    private ResponseEntity<String> handleProductNotFoundException(){

        return new ResponseEntity<>("Product Not Found", HttpStatus.NOT_FOUND);
    }
}
