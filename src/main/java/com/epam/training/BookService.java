package com.epam.training;
public class BookService {

    public Book createBook(String title, String authorName, String authorDescription, int yesrOfPublication,
            String description) {
        return new Book(title, authorName, authorDescription, yesrOfPublication, description);
    }
}
