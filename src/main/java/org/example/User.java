package org.example;

import java.util.ArrayList;
import java.util.List;

public class User {
    String name;
    private String id;
    private String password;
    List<Book> borrowedBooks;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
        this.borrowedBooks = new ArrayList<>();
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }
}
