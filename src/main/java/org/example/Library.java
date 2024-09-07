package org.example;

import java.util.*;

public class Library {
    private List<Book> books;
    private List<User> users;
    private Set<String> bookIds;

    public Library() {
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
        this.bookIds = new HashSet<>();
    }

    private String generateUniqueId() {
        String id;
        do {
            id = UUID.randomUUID().toString();
        } while (bookIds.contains(id));
        return id;
    }

    public void addBook(Book book) {
        if (books.contains(book)) {
            System.out.println("Book already exists.");
            return;
        }

        String uniqueId = generateUniqueId();
        book.setId(uniqueId);
        bookIds.add(uniqueId);
        books.add(book);
    }

    public void getBooks(boolean filterAvailable) {
        if (books == null || books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).isAvailable && filterAvailable) {
                System.out.println(i + ": " + books.get(i));

            } else if (!filterAvailable) {
                System.out.println(i + ": " + books.get(i));
            }
        }

    }

    public void getUserBooks(User user) {
        if (user.borrowedBooks == null || user.borrowedBooks.isEmpty()) {
            System.out.println("No books borrowed.");
            return;
        }
        for (int i = 0; i < user.borrowedBooks.size(); i++) {
            System.out.println(i + ": " + user.borrowedBooks.get(i));
        }
    }

    public void getUsers() {
        if (users == null || users.isEmpty()) {
            System.out.println("No users available.");
            return;
        }
        for (User user : users) {
            System.out.println(user);
        }
    }

    public void addUser(User user) {
      if (users.contains(user)) {
          System.out.println("User already exists.");
          return;
      }
      String uniqueId = generateUniqueId();
      user.setId(uniqueId);
      users.add(user);

    }

    public void borrowBook(int bookIndex, User user) {
        if (bookIndex < 0 || bookIndex >= books.size()) {
            System.out.println("Invalid book index.");
            return;
        }

        Book book = books.get(bookIndex);
        if (book.isAvailable) {
            user.borrowBook(book);
            book.setAvailable(false);
            System.out.println("You have successfully borrowed: " + book.getTitle());
        } else {
            System.out.println("Book is not available.");
        }
    }

    public void returnBook(int bookIndex,User user) {
        if (bookIndex < 0 || bookIndex >= books.size()) {
            System.out.println("Invalid book index.");
            return;
        }

        Book book = books.get(bookIndex);
      if (user.borrowedBooks.contains(book)) {
          user.borrowedBooks.remove(book);
          book.setAvailable(true);
          System.out.println("You have successfully returned: " + book.getTitle());
      } else {
          System.out.println("You have not borrowed this book.");
      }
    }

}
