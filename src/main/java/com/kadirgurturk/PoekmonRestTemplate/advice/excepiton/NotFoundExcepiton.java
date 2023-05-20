package com.kadirgurturk.PoekmonRestTemplate.advice.excepiton;

public class NotFoundExcepiton extends RuntimeException{

    public NotFoundExcepiton(String message) {
        super(message);
    }
}
