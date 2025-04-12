package com.gevernova.objectinspector.libraryManagementSystem;

public class LibraryManagementSystem {
    public static void main(String args[]){
            Book obj1=new Book("java 8","Raoul-Gabriel Urma",978161729);
            if(obj1 instanceof Book){
                obj1.displayDetails();
            }
            if(obj1 instanceof  Book){
                obj1.displayLibraryName();
            }
    }
}
