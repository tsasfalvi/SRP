package com;
import java.util.ArrayList;
import java.util.List;
public class Library {
    private List<Book> books = new ArrayList<>();

    public void add(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }
}
