package com.pb.korol.hw8;

public class Auth {
    private String login;
    private String password;

    public Auth() {
        this.login = "n/a";
        this.password = "n/a";
    }

    public void signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!checkLogin(login)) {
            throw new WrongLoginException("логин не соответствует требованиям.");
        }
        if (!checkPassword(password)) {
            throw new WrongPasswordException("пароль не соответствует требованиям.");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("пароли не совпадают.");
        }
        this.login = login;
        this.password = password;
        System.out.println("Пользователь успешно зарегистрирован.");
    }

    public void signIn(String login, String password) throws WrongLoginException {
        if (this.login.equals(login) && this.password.equals(password)) {
            System.out.println("Авторизация пройдена успешно. Добро пожаловать!");
        }
        else {
            throw new WrongLoginException("неверный логин или пароль.");
        }
    }

    private static boolean checkLogin(String login) {
        final String loginPattern = "[a-zA-Z0-9]{5,20}";
        return login.matches(loginPattern);
    }

    private static boolean checkPassword(String password) {
        final String passwordPattern = "[a-zA-Z0-9_]{6,}";
        return password.matches(passwordPattern);
    }
}
