package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Library library = new Library();
       library.addBook(new Book("The Da Vinci Code", "Dan Brown" ));
       library.addBook(new Book("The Alchemist", "Paulo Coelho" ));

       Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the library!");
        System.out.println("Please login to continue.");
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter your password:");
        String password = scanner.nextLine();

        User currentUser = new User(name, password);
        library.addUser(currentUser);

       while (true) {
           System.out.println("Enter 1 to add a book.");
           System.out.println("Enter 2 to get all books.");
           System.out.println("Enter 3 to get all users.");
           System.out.println("Enter 4 to borrow a book.");
           System.out.println("Enter 5 to return a book.");
           System.out.println("Enter 0 to exit.");
           int choice = scanner.nextInt();
           scanner.nextLine();

           switch (choice) {
               case 1:
                   System.out.println("Enter the title of the book:");
                   String title = scanner.nextLine();
                   System.out.println("Enter the author of the book:");
                   String author = scanner.nextLine();
                   library.addBook(new Book(title, author));
                   break;
               case 2:
                   library.getBooks(false);
                   break;
               case 3:
                   library.getUsers();
                   break;

               case 4:
                   library.getBooks(true);
                   System.out.println("Enter the index of the book you want to borrow:");
                   int bookIndex = scanner.nextInt();
                   library.borrowBook(bookIndex, currentUser);
                     break;

               case 5:
                     library.getUserBooks(currentUser);
                     System.out.println("Enter the index of the book you want to return:");
                     int returnBookIndex = scanner.nextInt();
                     library.returnBook(returnBookIndex, currentUser);
                     break;
               case 0:
                   System.exit(0);
                   break;
               default:
                   System.out.println("Invalid choice.");
           }
       }

    }
}