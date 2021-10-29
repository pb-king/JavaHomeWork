package com.pb.korol.hw5;

public class Library {
    public static void main(String[] args) {
        Book[] books = new Book[6];
        Reader[] readers = new Reader[3];

        books[0] = new Book("Java 8. Полное руководство", "Герберт Шилдт", 2015);
        books[1] = new Book("Задача трех тел", "Лю Цысинь", 2016);
        books[2] = new Book("Новый ум короля", "Роджер Пенроуз", 2008);
        books[3] = new Book("Сумма технологии", "Станислав Лем", 2016);
        books[4] = new Book("Восхождение денег", "Ниалл Фергюсон", 2009);
        books[5] = new Book("Самурай без меча", "Масао Китами", 2005);

        readers[0] = new Reader("Петренко И.А.", "М12345", "механико-математический", "2002.01.11", "0981234567");
        readers[1] = new Reader("Негода Г.В.", "Ф65465", "физический", "2003.10.05", "0503141592");
        readers[2] = new Reader("Шевченко О.В.", "Э75675", "экономический", "2001.08.24", "0935553535");

        System.out.println("Список всех книг в библиотеке:");
        for (Book book: books) {
            System.out.println(book);
        }
        System.out.println();

        System.out.println("Список всех читателей библиотеки:");
        for (Reader reader: readers) {
            System.out.println(reader);
        }
        System.out.println();

        System.out.println("Записи о посещении библиотеки:");
        readers[0].takeBook(2);
        readers[1].takeBook(books[1].getTitle(), books[2].getTitle(), books[3].getTitle());
        readers[2].takeBook(books[4], books[5]);
        readers[0].returnBook(1);
        readers[1].returnBook(books[1].getTitle(), books[2].getTitle());
        readers[2].returnBook(books[5]);
    }
}
