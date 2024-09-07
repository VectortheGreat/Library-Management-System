package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Library library = new Library();
       library.addBook(new Book("The Da Vinci Code", "Dan Brown", 2003,true));
       library.addBook(new Book("The Alchemist", "Paulo Coelho", 1988,true));
       library.getBooks();

    }
}