package com.pb.korol.hw10;

public class NumBoxOutOfRangeException extends Exception {
    private int maxIndex;

    public NumBoxOutOfRangeException() {
        super("Индекс за пределами допустимых значений");
    }

    public NumBoxOutOfRangeException(int maxIndex) {
        this.maxIndex = maxIndex;
    }

    @Override
    public String getMessage() {
        return "Индекс за пределами допустимых значений: 0.." + maxIndex + ".";
    }
}
