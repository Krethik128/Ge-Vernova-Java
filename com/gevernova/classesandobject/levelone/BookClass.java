package com.gevernova.classesandobject.levelone;

class Book {
    private String title;
    private String author;
    private double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}

public class BookClass {
    public static void main(String[] args) {
        Book book = new Book("1984", "George Orwell", 15.99);
        book.display();
    }
}
