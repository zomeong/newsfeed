package com.sparta.newsfeed.common;

import com.sparta.newsfeed.user.InvalidUserException;
import com.sparta.newsfeed.user.NotFoundUserException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionController {

    @ExceptionHandler(NotFoundUserException.class)
    public ResponseEntity<BaseResponse<Void>> notFoundUserException(NotFoundUserException e) {
        return ResponseEntity.badRequest().body(BaseResponse.of(e.getMessage(),
                HttpStatus.BAD_REQUEST.value(), null));
    }

    @ExceptionHandler(InvalidUserException.class)
    public ResponseEntity<BaseResponse<Void>> invalidUserException(InvalidUserException e) {
        return ResponseEntity.badRequest().body(BaseResponse.of(e.getMessage(),
                HttpStatus.BAD_REQUEST.value(), null));
    }
}