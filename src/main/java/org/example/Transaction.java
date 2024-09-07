package org.example;

import java.time.LocalDate;
import java.util.List;

public class Transaction {
    private Book book;
    private User user;
    private LocalDate borrowDate;
    private LocalDate returnDate;

    public void borrowDate(Book book, User user) {
        this.book = book;
        this.user = user;
        this.borrowDate = LocalDate.now();
    }

    public void returnDate(Book book, User user) {
        this.book = book;
        this.user = user;
        this.returnDate = LocalDate.now();
    }
}
