package com.fragmadata.mtm.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(MtmServiceException.class)
    public ResponseEntity<GenericErrorResponse> handleMtmServiceException(MtmServiceException exception) {
        log.info("handleMtmServiceException: {}", exception);
        String errorMessage = exception.getMessage().replace("MtmServiceException: ", "");
        GenericErrorResponse response = new GenericErrorResponse(errorMessage, exception.getHttpStatus(), exception.getHttpStatus().value());
        return new ResponseEntity<>(response, exception.getHttpStatus());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public GenericErrorResponse handleMethodArgumentNotValidException(MethodArgumentNotValidException exception) {
        log.info("handleMethodArgumentNotValidException: {}", exception);
        return new GenericErrorResponse(exception.getMessage(), HttpStatus.BAD_REQUEST, HttpStatus.BAD_REQUEST.value());
    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public GenericErrorResponse handleMissingServletRequestParameterException(MissingServletRequestParameterException exception) {
        log.info("handleMissingServletRequestParameterException: {}", exception);
        return new GenericErrorResponse(exception.getMessage(), HttpStatus.BAD_REQUEST, HttpStatus.BAD_REQUEST.value());
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public GenericErrorResponse handleResourceNotFoundException(ResourceNotFoundException exception) {
        return new GenericErrorResponse(exception.getMessage(), HttpStatus.NOT_FOUND, HttpStatus.NOT_FOUND.value());
    }

    //@ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public GenericErrorResponse handleException(Exception exception) {
        log.info("handleException: {}", exception);
        return new GenericErrorResponse(exception.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR, HttpStatus.INTERNAL_SERVER_ERROR.value());
    }
}
