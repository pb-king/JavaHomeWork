package com.pb.korol.hw4;

import java.util.Scanner;
import java.util.Arrays;

public class AnagramBySorts {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String inputString1, inputString2;

        System.out.println("Введите строку 1:");
        inputString1 = console.nextLine();
        System.out.println("Введите строку 2:");
        inputString2 = console.nextLine();

        if (getSortedLetters(inputString1).equals(getSortedLetters(inputString2))) {
            System.out.println("Строки 1 и 2 - анаграммы");
        }
        else {
            System.out.println("Строки 1 и 2 - не анаграммы");
        }
    }

    public static String getSortedLetters(String str) {
        str = str.toLowerCase();
        char[] allChars = str.toCharArray();
        int lettersCount = 0;

        for (char symbol : allChars) {
            if (Character.isLetter(symbol)) {
                lettersCount++;
            }
        }
        char[] letters = new char[lettersCount];
        int index = 0;

        for (char symbol : allChars) {
            if (Character.isLetter(symbol)) {
                letters[index] = symbol;
                index++;
            }
        }
        Arrays.sort(letters);

        return String.valueOf(letters);
    }
}
