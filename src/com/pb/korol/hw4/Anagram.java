package com.pb.korol.hw4;

import java.util.ArrayList;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String inputString1, inputString2, result = "Строка 2 ";

        System.out.println("Введите строку 1:");
        inputString1 = console.nextLine();
        System.out.println("Введите строку 2:");
        inputString2 = console.nextLine();

        result += (isAnagram(inputString1, inputString2)) ? "- анаграмма" : "не является анаграммой";
        result += " строки 1";
        System.out.println(result);
    }

    public static boolean isAnagram(String string1, String string2) {
        // анаграммы нечувствительны к регистру, поэтому приведем строки в lowercase
        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();
        // сохраняем в ArrayList все буквы строки 1
        ArrayList<Character> letters1 = getLetters(string1);
        // перебираем все символы строки 2
        for (int i = 0; i < string2.length(); i++) {
            char symbol = string2.charAt(i);
            // если встречена буква, ищем ее в списке букв строки 1
            if (Character.isLetter(symbol)) {
                int index = letters1.indexOf(symbol);
                // если не нашли, сходу не анаграмма
                if (index == -1) {
                    return false;
                } // иначе удаляем найденную букву из списка букв строки 1
                else {
                    letters1.remove(index);
                }
            }
        }
        // если после перебора строки 2 остались еще буквы строки 1 - это не анаграмма
        return letters1.size() == 0;
    }

    public static ArrayList<Character> getLetters(String str) {
        ArrayList<Character> letters = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                letters.add(str.charAt(i));
            }
        }
        return letters;
    }
}
