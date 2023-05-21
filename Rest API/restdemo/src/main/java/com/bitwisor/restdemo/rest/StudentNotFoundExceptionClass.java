package com.bitwisor.restdemo.rest;

public class StudentNotFoundExceptionClass extends RuntimeException{

    public StudentNotFoundExceptionClass(String message) {
        super(message);
    }

    public StudentNotFoundExceptionClass(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentNotFoundExceptionClass(Throwable cause) {
        super(cause);
    }
}
