package com.pb.korol.hw8;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        Auth user = new Auth();

        System.out.println("Сначала зарегистрируйтесь на сайте.");
        if (!safeSignUp(user)) return;

        System.out.println("Теперь авторизуйтесь, чтобы войти.");
        if (!safeSignIn(user)) return;

        System.out.println("Черная пятница! Спешите купить товары по акции!");
    }

    private static boolean safeSignUp(Auth user) {
        Scanner console = new Scanner(System.in);
        String login = readString(console, "Введите логин, от 5 до 20 символов, только латинские буквы и цифры:\n");
        String password = readString(console, "Введите пароль, более 5 символов, только латинские буквы, цифры или знак подчеркивания:\n");
        String confirmPassword = readString(console, "Повтор пароля:\n");

        try {
            user.signUp(login, password, confirmPassword);
        }
        catch (WrongLoginException | WrongPasswordException signUpException) {
            System.out.println("Ошибка: " + signUpException.getMessage());
            return false;
        }
        System.out.println();
        return true;
    }

    private static boolean safeSignIn(Auth user) {
        Scanner console = new Scanner(System.in);
        String login = readString(console, "Введите логин: ");
        String password = readString(console, "Введите пароль: ");

        try {
            user.signIn(login, password);
        }
        catch (WrongLoginException signInException) {
            System.out.println("Ошибка: " + signInException.getMessage());
            return false;
        }
        System.out.println();
        return true;
    }

    private static String readString(Scanner input, String title) {
        System.out.print(title);
        return input.nextLine();
    }
}
