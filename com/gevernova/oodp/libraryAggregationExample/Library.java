package com.gevernova.oodp.libraryAggregationExample;
import java.util.ArrayList;
import java.util.List;
// Library aggregates books, but does not own their lifecycle
class Library {
    String name;
    List<Book> books; // Aggregation

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void showLibraryBooks() {
        System.out.println("\nLibrary: " + name);
        for (Book b : books) {
            b.displayBookInfo();
        }
    }
}
