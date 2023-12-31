package com.ramij.hashing.exceptions;

public class HashingException extends RuntimeException {
    final String message;

    @Override
    public String getMessage() {
        return message;
    }

    public HashingException(String message) {
        super(message);
        this.message = message;

    }
}
