package com.haja.discuss;

public class DiscussRuntimeException extends RuntimeException {
    public DiscussRuntimeException(Exception e) {
        super(e);
    }
    public DiscussRuntimeException(String msg) {
        super(msg);
    }
}

