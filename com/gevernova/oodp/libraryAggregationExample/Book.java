package com.gevernova.oodp.libraryAggregationExample;
// Book can exist independently of any library
public class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayBookInfo() {
        System.out.println("Book: " + title + " by " + author);
    }
}
