package com.pb.korol.hw10;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        NumBox<Integer> numbersInteger = new NumBox<>(3);
        NumBox<Float> numbersFloat = new NumBox<>(4);
        Random rand = new Random();

        try {
            numbersInteger.add(randomInteger(rand, 10));
            numbersInteger.add(randomInteger(rand, 10));
            numbersInteger.add(randomInteger(rand, 10));
            numbersInteger.add(randomInteger(rand, 10));
        }
        catch (NumBoxOutOfSizeException exOutOfSize) {
            System.out.println(exOutOfSize);
        }
        System.out.println("Массив чисел типа Integer:");
        for (int i=0; i < numbersInteger.length(); i++) {
            if (i > 0) System.out.print(", ");
            System.out.print(numbersInteger.get(i));
        }
        System.out.println();
        System.out.println("Максимальный элемент: " + numbersInteger.max());
        System.out.println("Сумма всех элементов: " + numbersInteger.sum());
        try {
            System.out.println("Среднее значение: " + numbersInteger.average());
        }
        catch (NumBoxIsEmptyException exBoxEmpty) {
            System.out.println(exBoxEmpty);
        }

        try {
            numbersFloat.add(randomFloat(rand, 10.0f));
            numbersFloat.add(randomFloat(rand, 10.0f));
            numbersFloat.add(randomFloat(rand, 10.0f));
            numbersFloat.add(randomFloat(rand, 10.0f));
            numbersFloat.add(randomFloat(rand, 10.0f));
        }
        catch (NumBoxOutOfSizeException exOutOfSize) {
            System.out.println(exOutOfSize);
        }
        System.out.println("Массив чисел типа Float:");
        for (int i=0; i < numbersFloat.length(); i++) {
            if (i > 0) System.out.print(", ");
            System.out.print(numbersFloat.get(i));
        }
        System.out.println();
        System.out.println("Максимальный элемент: " + numbersFloat.max());
        System.out.println("Сумма всех элементов: " + numbersFloat.sum());
        try {
            System.out.println("Среднее значение: " + numbersFloat.average());
        }
        catch (NumBoxIsEmptyException exBoxEmpty) {
            System.out.println(exBoxEmpty);
        }
    }

    public static Integer randomInteger(Random random, int maxValue) {
        return random.nextInt(maxValue + 1);
    }

    public static Float randomFloat(Random random, Float dispersion) {
        return random.nextFloat() * dispersion;
    }
}
