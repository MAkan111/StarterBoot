package com.example.starter.exception;

public class LoggingStartupException extends RuntimeException {
    public LoggingStartupException(String message) {
        super(message);
    }
}