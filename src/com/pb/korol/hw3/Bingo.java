package com.pb.korol.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        Scanner console = new Scanner(System.in);
        int upperBound = 100;
        int secretNumber = randomGenerator.nextInt(upperBound + 1);
        int guess, attempts = 1;

        System.out.println("Загадано число от 0 до " + upperBound);
        System.out.println();

        do {
            System.out.print("Введите вашу догадку, -1 чтобы закончить игру: ");
            guess = console.nextInt();

            if (guess == -1) {
                break;
            }
            else if (secretNumber < guess) {
                System.out.println("Загаданное число меньше");
            }
            else if (secretNumber > guess) {
                System.out.println("Загаданное число больше");
            }

            attempts++;
        }
        while (guess != secretNumber);

        System.out.println("Загаданное число: " + secretNumber);

        if (guess == secretNumber) {
            System.out.println("Поздравляю, вы угадали его с " + attempts + "-й попытки!");
        }
        else {
            System.out.println("Вы сдались на " + attempts + "-й попытке. Повезет в другой раз!");
        }
    }
}
