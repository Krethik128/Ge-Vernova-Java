package com.gevernova.oodp.libraryAggregationExample;

public class Main {
    public static void main(String[] args) {
        // Books created independently
        Book b1 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki");
        Book b2 = new Book("1984", "George Orwell");
        Book b3 = new Book("Clean Code", "Robert C. Martin");

        // Two libraries
        Library cityLibrary = new Library("City Central Library");
        Library collegeLibrary = new Library("Engineering College Library");

        // Same books added to different libraries (aggregation)
        cityLibrary.addBook(b1);
        cityLibrary.addBook(b2);

        collegeLibrary.addBook(b2);
        collegeLibrary.addBook(b3);

        // Display books in both libraries
        cityLibrary.showLibraryBooks();
        collegeLibrary.showLibraryBooks();
    }
}

