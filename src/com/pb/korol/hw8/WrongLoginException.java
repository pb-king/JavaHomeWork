package com.pb.korol.hw8;

public class WrongLoginException extends Exception {
    public WrongLoginException() {
        super("неверный логин");
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
