package com.pb.korol.hw11;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ContactBook {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Contact contact = new Contact("Dude", "01.01.2000", "some street");
        Contact contact2 = new Contact("Chick", "02.02.2002", "next street");

        ContactList contacts = new ContactList();
        contacts.add(contact);
        contacts.add(contact2);

        String result = objectMapper.writeValueAsString(contacts);
        System.out.println(result);

        ContactList contacts2 = objectMapper.readValue(result, ContactList.class);
        contacts2.print();
        System.out.println();

        ContactBook.showMenu();
    }

    public static void showMenu() {
        System.out.println("меню");
    }
}
