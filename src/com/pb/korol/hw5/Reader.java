package com.pb.korol.hw5;

public class Reader {
    private String fullName;
    private String ticketNumber;
    private String faculty;
    private String birthDate;
    private String phoneNumber;

    public Reader(String fullName, String ticketNumber, String faculty, String birthDate, String phoneNumber) {
        this.fullName = fullName;
        this.ticketNumber = ticketNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return fullName + ", читательский № " + ticketNumber + ", факультет: " + faculty +
                ", дата рождения: " + birthDate + ", телефон: " + phoneNumber;
    }

    private void booksAction(String action, int bookCount) {
        System.out.println(fullName + " " + action +" " + bookCount + " книг");
    }

    private void booksAction(String action, String[] bookNames) {
        System.out.println(fullName + " " + action + " книги: " + String.join(", ", bookNames));
    }

    private void booksAction(String action, Book[] books) {
        StringBuilder textList = new StringBuilder();

        for (int i = 0; i < books.length; i++) {
            if (i > 0) {
                textList.append(", ");
            }
            textList.append(books[i]);
        }
        System.out.println(fullName + " " + action + " книги: " + textList);
    }

    public void takeBook(int bookCount) {
        booksAction("взял", bookCount);
    }

    public void takeBook(String... bookNames) {
        booksAction("взял", bookNames);
    }

    public void takeBook(Book... books) {
        booksAction("взял", books);
    }

    public void returnBook(int bookCount) {
        booksAction("вернул", bookCount);
    }

    public void returnBook(String... bookNames) {
        booksAction("вернул", bookNames);
    }

    public void returnBook(Book... books) {
        booksAction("вернул", books);
    }
}
