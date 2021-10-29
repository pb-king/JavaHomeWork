package com.pb.korol.hw5;

public class Book {
    private String title;
    private String author;
    private int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return title + " (" + author + " " + publicationYear + " г.)";
    }
}
