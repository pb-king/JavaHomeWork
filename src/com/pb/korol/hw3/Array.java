package com.pb.korol.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int arrayLength = 10;
        int[] array = new int[arrayLength];
        int sumOfElements = 0, positiveCount = 0;
        Scanner console = new Scanner(System.in);

        for (int i = 0; i < arrayLength; i++) {
            System.out.printf("Введите %d-й элемент массива: ", (i + 1));
            array[i] = console.nextInt();

            if (array[i] > 0) {
                positiveCount++;
            }
            sumOfElements += array[i];
        }

        System.out.println();
        System.out.println("Введенный массив:");
        System.out.println(Arrays.toString(array));

        System.out.println();
        System.out.println("Сумма всех элементов массива: " + sumOfElements);
        System.out.println("Количество положительных элементов массива: " + positiveCount);

        for (int i = 0; i < arrayLength; i++) {
            for (int j = 1; j < (arrayLength - i); j++) {
                if (array[j - 1] > array[j]) {
                    int swap = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = swap;
                }
            }
        }

        System.out.println();
        System.out.println("Массив после сортировки:");
        System.out.println(Arrays.toString(array));
    }
}