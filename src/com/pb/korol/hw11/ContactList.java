package com.pb.korol.hw11;

import java.util.ArrayList;

public class ContactList {
    private ArrayList<Contact> list;

    ContactList() {
        this.list = new ArrayList<>();
    }

    public void add(Contact contact) {
        list.add(contact);
    }

    public void del(int index) {
        list.remove(index);
    }

    public boolean del(Contact contact) {
        int index = list.indexOf(contact);
        if (index != -1) {
            list.remove(index);
            return true;
        }
        return false;
    }

    public Contact get(int index) {
        return list.get(index);
    }

    public int length() {
        return list.size();
    }

    public ArrayList<Contact> getList() {
        return list;
    }

    public void print() {
        if (list.size() == 0) {
            System.out.println("Список контактов пуст");
        }
        else {
            for (Contact contact: list) {
                System.out.println();
                System.out.println("Контакт № " + (list.indexOf(contact) + 1));
                System.out.println(contact);
            }
        }
    }

    public Contact find(String key, String value) {
        switch (key) {
            case "number":
                int index = Integer.parseInt(value) - 1;
                if (index >= 0 && index < list.size()) {
                    return list.get(index);
                }
                else {
                    System.out.println("Введенное число за пределами списка!");
                }
            case "name":
                for(Contact contact: list) {
                    if (contact.getFullName().equals(value)) {
                        return contact;
                    }
                }
            case "birth":
                for(Contact contact: list) {
                    if (contact.getBirthDate().equals(value)) {
                        return contact;
                    }
                }
            case "address":
                for(Contact contact: list) {
                    if (contact.getAddress().equals(value)) {
                        return contact;
                    }
                }
            case "phone":
                for(Contact contact: list) {
                    if (contact.getPhoneNumbers().contains(value)) {
                        return contact;
                    }
                }
        }
        return null;
    }
}
