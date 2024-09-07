package org.example;

public class Book {
    String title;
    String author;
    private int id;
    boolean isAvailable;

    public Book(String title, String author, int id, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.id = id;
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", id=" + id +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
