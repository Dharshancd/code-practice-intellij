package com.dharshan.exception;

import java.lang.RuntimeException;
public class InputTooLongException extends RuntimeException {

    public InputTooLongException(String message) {
        super(message);
    }

}
