package com.gevernova.constructors.accessmodifiers.bookLibrarySystem;

import java.util.Scanner;

public class BookLibrarySystem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        EBook ebook = new EBook(123456, "Effective Java", "PDF");
        ebook.setAuthor("Joshua Bloch");
        ebook.displayDetails();
        System.out.println("Is the author name correct for the above book? (y)es/(n)o :");
        char ch=scanner.next().charAt(0);
        if(ch=='y'){
            System.out.println("Enter the Author name: ");
            String newAuthorname=scanner.next();
            ebook.setAuthor(newAuthorname);
        }
        ebook.displayDetails();
    }
}
