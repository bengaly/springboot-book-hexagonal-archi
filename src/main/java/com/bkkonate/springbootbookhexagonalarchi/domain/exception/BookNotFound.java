package com.bkkonate.springbootbookhexagonalarchi.domain.exception;

public class BookNotFound extends RuntimeException {

    public BookNotFound(String message) {
        super(message);
    }
}
