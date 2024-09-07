package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<User> users;

    public Library() {
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void getBooks() {
        if (books == null || books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void borrowBook(User user, Book book) {
        if (book.isAvailable) {
            user.borrowedBooks.add(book);
            book.isAvailable = false;
        }
    }

    public void returnBook(User user, Book book) {
        if (user.borrowedBooks.contains(book)) {
            user.borrowedBooks.remove(book);
            book.isAvailable = true;
        }
    }

}
