package za.co.fnb.cish.fid.zos.loader.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import za.co.fnb.cish.fid.common.api.common.ServiceError;
import za.co.fnb.cish.fid.common.api.exception.ZosErrorException;
import za.co.fnb.cish.fid.zos.loader.util.Constants;

import jakarta.validation.ConstraintViolationException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@ControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomizedResponseEntityExceptionHandler.class);


    @ExceptionHandler(ZosErrorException.class)
    public final ResponseEntity<ServiceError> handleInternalErrorException(ZosErrorException ex, WebRequest request) {
        LOGGER.error("CustomizedResponseEntityExceptionHandler : handleInternalErrorException() MessageId:{} Exception ", ex.getMessageId(), ex);
        List<String> messageList = new ArrayList<>();
        HttpStatus httpStatus = HttpStatus.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value());

        if (ex instanceof ZosErrorException) {
            httpStatus = HttpStatus.valueOf(HttpStatus.BAD_REQUEST.value());
            if (Objects.nonNull(ex.getMessage())) {
                messageList.add(ex.getMessage());
            }
        }
        ServiceError serviceError = new ServiceError(new Date(), httpStatus.value(), httpStatus.getReasonPhrase(), messageList, request.getDescription(false));
        return new ResponseEntity<>(serviceError, httpStatus);
    }


    //Request header validations
    @ExceptionHandler(ConstraintViolationException.class)
    public final ResponseEntity<ServiceError> handleHeaderValidationException(ConstraintViolationException ex, WebRequest request) {
        List<String> messageList = new ArrayList<>();
        String expMessage = ex.getMessage();
        if (Objects.nonNull(expMessage)) {
            String[] messageArr = expMessage.split(",");
            if (Objects.nonNull(messageArr)) {
                for (String message : messageArr) {
                    String[] megArr = message.split(Constants.COLON);
                    if (megArr.length >= 2) {
                        messageList.add(megArr[1].trim());
                    } else {
                        messageList.add(expMessage);
                    }
                }
            }
        }
        LOGGER.error("CustomizedResponseEntityExceptionHandler : handleHeaderValidationException Exception:{} ", ex.getMessage());
        ServiceError serviceError = new ServiceError(new Date(), HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), messageList, request.getDescription(false));

        return new ResponseEntity<>(serviceError, HttpStatus.BAD_REQUEST);
    }

    //Request field validation
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
        List<String> messageList = new ArrayList<>();
        for (FieldError fieldError : ex.getBindingResult().getFieldErrors()) {
            messageList.add(fieldError.getField() + Constants.SPACE + fieldError.getDefaultMessage());
        }
        if (messageList.isEmpty()) {
            messageList.add(ex.getMessage());
        }
        LOGGER.error("CustomizedResponseEntityExceptionHandler : handleMethodArgumentNotValid Exception:{}", ex.getMessage());
        ServiceError serviceError = new ServiceError(new Date(), HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), messageList, request.getDescription(false));

        return new ResponseEntity<>(serviceError, HttpStatus.BAD_REQUEST);
    }

    @Override
    protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
        List<String> messageList = new ArrayList<>();
        String message = ex.getMessage();
        if (Objects.nonNull(message)) {
            String[] megArr = message.split(";");
            if (Objects.nonNull(megArr) && megArr.length > 0) {
                messageList.add(megArr[0]);
            }
            if (messageList.isEmpty()) {
                messageList.add(message);
            }
        }
        LOGGER.error("CustomizedResponseEntityExceptionHandler : handleHttpMessageNotReadable Exception:{}", ex.getMessage());
        ServiceError serviceError = new ServiceError(new Date(), HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), messageList, request.getDescription(false));

        return new ResponseEntity<>(serviceError, HttpStatus.BAD_REQUEST);
    }

    @Override
    protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
        List<String> messageList = new ArrayList<>();
        String message = ex.getMessage();
        if (Objects.nonNull(message)) {
            String[] megArr = message.split(";");
            if (Objects.nonNull(megArr) && megArr.length > 0) {
                messageList.add(megArr[0]);
            }
            if (messageList.isEmpty()) {
                messageList.add(message);
            }
        }
        LOGGER.error("CustomizedResponseEntityExceptionHandler : handleHttpRequestMethodNotSupported Exception:{}", ex.getMessage());
        ServiceError serviceError = new ServiceError(new Date(), HttpStatus.METHOD_NOT_ALLOWED.value(), HttpStatus.METHOD_NOT_ALLOWED.getReasonPhrase(), messageList, request.getDescription(false));

        return new ResponseEntity<>(serviceError, HttpStatus.METHOD_NOT_ALLOWED);
    }


}