package com.pb.korol.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int operand1, operand2, resultValue = 0;
        String sign, resultText = "";

        System.out.print("Введите операнд 1: ");
        operand1 = console.nextInt();

        System.out.print("Введите операнд 2: ");
        operand2 = console.nextInt();

        System.out.print("Введите знак арифметической операции (+, -, *, /): ");
        sign = console.next();

        switch (sign) {
            case "+":
                resultValue = operand1 + operand2;
                break;
            case "-":
                resultValue = operand1 - operand2;
                break;
            case "*":
                resultValue = operand1 * operand2;
                break;
            case "/":
                if (operand2 == 0) {
                    resultText = "ошибка, нельзя делить на 0";
                }
                else {
                    resultValue = operand1 / operand2;
                }
                break;
            default:
                resultText = "ошибка, неизвестный знак арифметической операции";
        }

        if (resultText.equals("")) {
            resultText = String.valueOf(resultValue);
        }

        System.out.println("Результат арифметической операции: " + resultText);
    }
}
