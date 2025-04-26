package com.gevernova.oodp.libraryAggregationExample;

public class Main {
    public static void main(String[] args) {
        // Books created independently
        Book bookOne = new Book("Rich Dad Poor Dad", "Robert Kiyosaki");
        Book bookTwo = new Book("1984", "George Orwell");
        Book bookThree = new Book("Clean Code", "Robert C. Martin");

        // Two libraries
        Library cityLibrary = new Library("City Central Library");
        Library collegeLibrary = new Library("Engineering College Library");

        // Same books added to different libraries (aggregation)
        cityLibrary.addBook(bookOne);
        cityLibrary.addBook(bookTwo);

        collegeLibrary.addBook(bookTwo);
        collegeLibrary.addBook(bookThree);

        // Display books in both libraries
        cityLibrary.showLibraryBooks();
        collegeLibrary.showLibraryBooks();
    }
}

