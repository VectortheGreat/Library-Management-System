package org.example;

import java.util.List;

public class User {
    String name;
    int userId;
    List<Book> borrowedBooks;

    public User(String name, int userId, List<Book> borrowedBooks) {
        this.name = name;
        this.userId = userId;
        this.borrowedBooks = borrowedBooks;
    }
}
