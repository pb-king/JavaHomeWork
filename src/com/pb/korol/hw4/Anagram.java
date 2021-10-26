package com.pb.korol.hw4;

// import java.util.ArrayList;
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
        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();
        char[] chars1 = string1.toCharArray();
        int lettersLeft = 0;

        for (int i = 0; i < string1.length(); i++) {
            if (Character.isLetter(string1.charAt(i))) {
                lettersLeft++;
            }
        }

        for (int i = 0; i < string2.length(); i++) {
            char symbol = string2.charAt(i);

            if (Character.isLetter(symbol)) {
                int index = findChar(chars1, symbol);
                // если буква строки 2 не найдена в строке 1 - это не анаграмма
                if (index == -1) {
                    return false;
                }
                else {
                    chars1[index] = ' ';
                    lettersLeft--;
                }
            }
        }
        // если после перебора строки 2 остались еще буквы строки 1 - это не анаграмма
        return lettersLeft == 0;
    }

    public static int findChar(char[] charArray, char symbol) {
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == symbol) {
                return i;
            }
        }
        return -1;
    }

    /*
    public static boolean isAnagram(String string1, String string2) {
        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();
        ArrayList<Character> letters1 = getLetters(string1);

        for (int i = 0; i < string2.length(); i++) {
            char symbol = string2.charAt(i);

            if (Character.isLetter(symbol)) {
                int index = letters1.indexOf(symbol);
                // если буква строки 2 не найдена в строке 1 - это не анаграмма
                if (index == -1) {
                    return false;
                }
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
    */
}
