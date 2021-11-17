package com.pb.korol.hw8;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super("неверный пароль");
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
