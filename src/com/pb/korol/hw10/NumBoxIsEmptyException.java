package com.pb.korol.hw10;

public class NumBoxIsEmptyException extends Exception {
    public NumBoxIsEmptyException() {
        super();
    }

    @Override
    public String getMessage() {
        return "Массив чисел пуст!";
    }
}

