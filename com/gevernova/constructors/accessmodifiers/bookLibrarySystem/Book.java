package com.gevernova.constructors.accessmodifiers.bookLibrarySystem;

class Book {
    public int ISBN;
    protected String title;
    private String author;

    public Book(int ISBN, String title) {
        this.ISBN = ISBN;
        this.title = title;
    }

    public void setAuthor(String author_name) {
        this.author = author_name;
    }

    public String get() {
        return this.author;
    }
}
