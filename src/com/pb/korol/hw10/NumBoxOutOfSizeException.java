package com.pb.korol.hw10;

public class NumBoxOutOfSizeException extends Exception {
    public NumBoxOutOfSizeException() {
        super("Массив переполнен! Достигнут максимальный размер");
    }
}
