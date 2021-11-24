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
            throw new NumBoxOutOfSizeException(size);
        }
        values[length] = num;
        sum += num.doubleValue();
        length++;
    }

    public T get(int index) throws NumBoxOutOfBoundsException {
        if (index < 0 || index >= length) {
            throw new NumBoxOutOfBoundsException(length - 1);
        }
        return values[index];
    }

    public int length() {
        return length;
    }

    public double average() throws NumBoxIsEmptyException {
        if (length == 0) { throw new NumBoxIsEmptyException(); }
        return sum / length;
    }

    public double sum() {
        return sum;
    }

    public T max() throws NumBoxIsEmptyException {
        if (length == 0) { throw new NumBoxIsEmptyException(); }
        T maxValue = values[0];

        for (int i = 0; i < length; i++) {
            if (values[i].doubleValue() > maxValue.doubleValue()) {
                maxValue = values[i];
            }
        }
        return maxValue;
    }

    public void print() {
        System.out.println("Максимальный размер: " + size + ", текущий размер: " + length);
        try {
            for (int i=0; i < length; i++) {
                if (i > 0) System.out.print(", ");
                System.out.print(this.get(i));
            }
        }
        catch (NumBoxOutOfBoundsException exOutOfBounds) {
            System.out.println(exOutOfBounds.getMessage());
        }
        System.out.println();
        try {
            System.out.println("Максимальный элемент: " + max());
            System.out.println("Сумма всех элементов: " + sum());
        }
        catch (NumBoxIsEmptyException exBoxEmpty) {
            System.out.println(exBoxEmpty.getMessage());
        }
        try {
            System.out.println("Среднее значение: " + average());
        }
        catch (NumBoxIsEmptyException exBoxEmpty) {
            System.out.println(exBoxEmpty.getMessage());
        }
    }
}