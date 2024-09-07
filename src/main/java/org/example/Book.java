package org.example;

public class Book {
    String title;
    String author;
    public String id;
    public boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getTitle() {
        return title;
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
