package com.devstudios.redsocial.presentation.interceptors;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.devstudios.redsocial.domain.errors.CustomError;


@ControllerAdvice
public class HandleErrorsInterceptor {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> handleMethodNotValid( MethodArgumentNotValidException ex ){
        List<String> errors = ex.getFieldErrors().stream()
            .map( err ->  {
                String title = err.getField();
                String message = err.getDefaultMessage();
                return title + " " + message;
            }).toList();

        return getResponse(errors, 400);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<?> handleMessageNotReadable( HttpMessageNotReadableException ex ){
        return getResponse("Missing body", 400);
    }

    @ExceptionHandler(HttpMediaTypeNotSupportedException.class)
    public ResponseEntity<?> handleMediaTypeNotSupported( HttpMediaTypeNotSupportedException ex ){
        return getResponse("Media type is not valid", 416);
    }

    @ExceptionHandler(CustomError.class)
    public ResponseEntity<?> handleCustomError( CustomError ex ){
        return getResponse(ex.getError(), ex.getStatus());
    }



    private ResponseEntity<?> getResponse( Object err, int status ){
        Map<String, Object> errors = new HashMap<>();

        errors.put("err", err);
        errors.put("status", status);
        errors.put("date", LocalDateTime.now());

        return ResponseEntity.status(status).body(errors);
    }

}
