# Library Management System

This is a simple **Library Management System** built using Java. The system allows users to:
- Add books to the library
- List available books
- Borrow books from the library
- List all users
- Track borrowed books

## Features

1. **Add Books**: Users can add books to the library by entering the book's title and author.
2. **List Books**: Displays all available books along with their index, title, author, and availability status.
3. **Borrow Books**: Users can borrow a book by selecting its index. If the book is available, it will be added to the user's borrowed books list.
4. **List Users**: Displays all users registered in the system.
5. **Track Borrowed Books**: Users can track the books they have borrowed.

## Technologies

- **Java**: The primary programming language used to implement the system.
- **ArrayList**: To store the list of books and users.
- **Scanner**: For reading user input from the console.

## Project Structure

```plaintext
src/
├── org.example/
│   ├── Book.java        // Represents a book with title, author, and availability
│   ├── Library.java     // Manages books and users, including adding and borrowing books
│   ├── User.java        // Represents a user who can borrow books
│   └── Main.java        // Main entry point for the program
└── README.md            // Project documentation
