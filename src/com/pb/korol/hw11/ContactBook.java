package com.pb.korol.hw11;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

// задача еще не готова полностью, извините

public class ContactBook {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Contact contact = new Contact("Dude", "01.01.2000", "some street");
        Contact contact2 = new Contact("Chick", "02.02.2002", "next street");
        ContactList contacts = new ContactList();
        String filePath = "contacts.json";
        String[] mainMenuText = {
                "1 - добавить контакт",
                "2 - найти контакт",
                "3 - вывести все контакты",
                "4 - сохранить контакты в файл",
                "5 - загрузить контакты из файла",
                "0 - завершить работу"
        };
        int usersChoice = 0;

        do {
            usersChoice = getMenuChoice(mainMenuText);

            switch (usersChoice) {
                case 1: addContact(contacts);
                    break;
                case 2: findContact(contacts);
                    break;
                case 3: showAllContacts(contacts);
                    break;
                case 4: saveContactsToFile(contacts, filePath);
                    break;
                case 5: loadContactsFromFile(contacts, filePath);
                    break;
                default:
                    System.out.println("Неизвестный код меню!");
            }
            System.out.println("Вы выбрали вариант: " + usersChoice);
        }
        while (usersChoice != 0);
    }

    public static int getMenuChoice(String[] menuText) {
        Scanner console = new Scanner(System.in);
        String choice;

        ArrayList<String> possibleChoices = new ArrayList<>();

        System.out.println("Выберите действие из списка (введите цифру):");
        for (String menuItem: menuText) {
            System.out.println(menuItem);
            possibleChoices.add(menuItem.substring(0, 1));
        }

        do {
            choice = console.nextLine();
        }
        while (!possibleChoices.contains(choice));

        return Integer.parseInt(choice);
    }

    public static void addContact(ContactList contacts) {
        Scanner console = new Scanner(System.in);
        System.out.println("ввод нового контакта");
    }

    public static void findContact(ContactList contacts) {
        Scanner console = new Scanner(System.in);
        System.out.println("поиск нового контакта");
    }

    public static void showAllContacts(ContactList contacts) {
        Scanner console = new Scanner(System.in);
        System.out.println("вывод всех контактов");
    }

    public static void saveContactsToFile(ContactList contacts, String filePath) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonAsString = objectMapper.writeValueAsString(contacts);
        Path path = Paths.get(filePath);

        System.out.println(jsonAsString);

        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            writer.write(jsonAsString);
        } catch (IOException exWrite) {
            System.out.println("Ошибка записи в файл " + filePath + ": " + exWrite);
        }
        System.out.println("Данные записаны в файл " + filePath + ".");
    }

    public static void loadContactsFromFile(ContactList contacts, String filePath) {
        ObjectMapper objectMapper = new ObjectMapper();
        ContactList contacts2 = objectMapper.readValue(result, ContactList.class);
        contacts2.print();
        System.out.println();
    }
}
