package com;

public class Book {

    private String authorName;

    private String authorDescription;

    private int yearOfPublication;

    private String title;

    private String description;

    Book() {
        super();
    }

    public Book(String title, String authorName, String authorDescription, int yearOfPublication, String description) {
        this.authorName = authorName;
        this.authorDescription = authorDescription;
        this.yearOfPublication = yearOfPublication;
        this.title = title;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Book [authorName=" + authorName + ", authorDescription=" + authorDescription + ", yearOfPublication="
                + yearOfPublication + ", title=" + title + ", description=" + description + "]";
    }

}
