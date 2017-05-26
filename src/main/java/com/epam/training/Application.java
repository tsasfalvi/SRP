package com.epam.training;

public class Application {

    public void start() {
        Library library = new Library();
        BookService bookService = new BookService();

        Book book = bookService
                .createBook("Introduction to the Theory of Programming Languages and Touch of Class", "Bertrand Meyer",
                        "French academic, author, and consultant in the field of computer languages", 1990,
                        "This book is an excellent reference for understanding how to architect a language");
        library.add(book);

        System.out.println(library.getBooks());
    }

    public static void main(String[] args) {
        new Application().start();
    }
}
