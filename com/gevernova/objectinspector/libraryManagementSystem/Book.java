package com.gevernova.objectinspector.libraryManagementSystem;

class Book {
    public static String libraryName;
    public String title;
    public String author;
    public int isbn;

    static {
        libraryName = "SRM Central Library";
    }

    public Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void displayDetails() {
        System.out.println("The book title is :" + title);
        System.out.println("The book author is :" + author);
        System.out.println("The book isbn no is :" + isbn);
        System.out.println("The book is in :" + libraryName);
    }

    public void displayLibraryName() {
        System.out.println(libraryName);
    }
}
