package org.roon.dtos.web.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ControllerExceptionHandler {
    Logger logger = LoggerFactory.getLogger(ControllerExceptionHandler.class);

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> illegalArgException(IllegalArgumentException ie) {
        logger.error(ie.getMessage()+" "+ie.getLocalizedMessage());
        return ResponseEntity.badRequest().body(ie.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> exception(Exception e) {
        logger.error(e.getMessage()+" "+e.getLocalizedMessage());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
    }
}
