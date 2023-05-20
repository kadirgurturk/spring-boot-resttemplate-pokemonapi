package com.kadirgurturk.PoekmonRestTemplate.advice.excepiton;

public class BadRequestExcepiton extends RuntimeException{

    public BadRequestExcepiton(String message) {
        super(message);
    }

}
