package com.gevernova.objectinspector.libraryManagementSystem;

public class LibraryManagementSystem {
    public static void main(String args[]){
            Book book=new Book("java 8","Raoul-Gabriel Urma",978161729);
            if(book instanceof Book){
                book.displayDetails();
            }
            if(book instanceof  Book){
                book.displayLibraryName();
            }
    }
}
