package com.kadirgurturk.PoekmonRestTemplate.advice;

import com.kadirgurturk.PoekmonRestTemplate.advice.excepiton.BadRequestExcepiton;
import com.kadirgurturk.PoekmonRestTemplate.advice.excepiton.NotFoundExcepiton;
import com.kadirgurturk.PoekmonRestTemplate.advice.response.BadRequestResponse;
import com.kadirgurturk.PoekmonRestTemplate.advice.response.NotFoundResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class Advice {

    @ExceptionHandler(value = {NotFoundExcepiton.class})
    public ResponseEntity<?> notFoundHandler(NotFoundExcepiton exp)
    {
        var res = new NotFoundResponse(exp.getMessage(),HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(res,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = {BadRequestExcepiton.class})
    public ResponseEntity<?> badRequestHandler(BadRequestExcepiton exp)
    {
        var res = new BadRequestResponse(exp.getMessage(),HttpStatus.BAD_REQUEST);

        return new ResponseEntity<>(res,HttpStatus.BAD_REQUEST);
    }

}
