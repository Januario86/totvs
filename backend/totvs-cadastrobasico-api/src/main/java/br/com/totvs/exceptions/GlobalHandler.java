package br.com.totvs.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ControllerAdvice
public class GlobalHandler {

	@ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception e) {
       return new ResponseEntity<>("Ocorreu um erro: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
