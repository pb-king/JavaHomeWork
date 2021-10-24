package com.pb.korol.hw4;

import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String inputString, outputString;

        System.out.println("Введите строку для обработки:");
        inputString = console.nextLine();
        outputString = toProperCase(inputString);

        System.out.println("Строка после обработки:");
        System.out.println(outputString);
    }

    public static String toProperCase(String text) {
        char[] textArray = text.toCharArray();
        String prevType = "separator";

        for (int i = 0; i < textArray.length; i++) {
            char curChar = textArray[i];
            String curType = charType(curChar);

            if (curType.equals("lowercase") && prevType.equals("separator")) {
                textArray[i] = Character.toUpperCase(curChar);
            }
            prevType = curType;
        }

        return String.valueOf(textArray);
    }

    public static String charType(char symbol) {
        final String separators = " \t,.!?\"";

        if (separators.indexOf(symbol) != -1) {
            return "separator";
        }
        else if (Character.isLowerCase(symbol)) {
            return "lowercase";
        }
        else {
            return "other";
        }
    }
}
