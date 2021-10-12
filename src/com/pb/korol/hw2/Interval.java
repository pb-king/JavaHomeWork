package com.pb.korol.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int value;
        String interval = "находится в промежутке ";

        System.out.print("Введите целое число: ");
        value = console.nextInt();

        if (value < 0) {
            interval = "не попадает в известный промежуток";
        }
        else if (value < 15) {
            interval += "[0 - 14]";
        }
        else if (value < 36) {
            interval += "[15 - 35]";
        }
        else if (value < 51) {
            interval += "[36 - 50]";
        }
        else if (value < 101) {
            interval += "[51 - 100]";
        }
        else {
            interval = "не попадает в известный промежуток";
        }

        System.out.println("Введенное число " + interval);
    }
}
