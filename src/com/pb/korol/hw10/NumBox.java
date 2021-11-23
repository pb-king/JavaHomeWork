package com.pb.korol.hw10;

public class NumBox<T extends Number> {
    private final T[] values;
    private final int size;
    private int length;
    private double sum;

    public NumBox(int size) {
        this.values = (T[]) new Number[size];
        this.size = size;
        this.length = 0;
        this.sum = 0;
    }

    public void add(T num) throws NumBoxOutOfSizeException {
        if (length >= size) {
            throw new NumBoxOutOfSizeException();
        }
        values[length] = num;
        sum += num.doubleValue();
        length++;
    }

    public T get(int index) {
        if (index < 0 || index >= this.length) {
            return null;
        }
        return values[index];
    }

    public int length() {
        return length;
    }

    public double average() throws NumBoxIsEmptyException {
        if (length == 0) {
            throw new NumBoxIsEmptyException();
        }
        return sum / length;
    }

    public double sum() {
        return sum;
    }

    public T max() {
        if (length == 0) {
            return null;
        }
        T maxValue = values[0];

        for (T number: values) {
            if (number.doubleValue() > maxValue.doubleValue()) {
                maxValue = number;
            }
        }
        return maxValue;
    }
}