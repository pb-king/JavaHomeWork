package com.pb.korol.hw4;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String string1, string2, result = "Строка 2 ";

        System.out.println("Введите строку 1:");
        string1 = console.nextLine();
        System.out.println("Введите строку 2:");
        string2 = console.nextLine();

        result += (isAnagram(string1, string2)) ? "- анаграмма" : "не является анаграммой" + " строки 1";
        System.out.println(result);
    }

    public static boolean isAnagram(String str1, String str2) {
        // char[] letters1 = getLetters(str1), letters2 = getLetters(str2);

        return false;
    }

    public static char[] getLetters(String string) {
        char[] array = string.toLowerCase().toCharArray();
        return array;
    }
}
