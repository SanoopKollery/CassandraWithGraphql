package com.example.cassandra.springbootcassandrademo.exception;

import lombok.Data;

@Data
public class InputArgumentException extends RuntimeException {

    String message;

    public InputArgumentException(String message) {
       // super(message);
        this.message = message;
    }
}
