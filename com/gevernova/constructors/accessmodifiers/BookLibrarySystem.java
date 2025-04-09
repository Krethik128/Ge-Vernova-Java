package com.gevernova.constructors.accessmodifiers;

import java.util.Scanner;

class Book{
    public int ISBN;
    protected String title;
    private String author;

    public Book(int ISBN, String title) {
        this.ISBN = ISBN;
        this.title = title;
    }
    public void setAuthor(String author_name){
        this.author=author_name;
    }
    public String get(){
        return this.author;
    }
}
class EBook extends Book{
    private String format;
    public EBook(int ISBN, String title,String format){
        super(ISBN,title);// Call parent constructor
        this.format = format;
    }
    public void displayDetails() {
        System.out.println("EBook ISBN: " + ISBN);      // ✅ public - accessible
        System.out.println("EBook Title: " + title);    // ✅ protected - accessible
        // System.out.println("Author: " + author);     ❌ private - not accessible directly
        System.out.println("Format: " + format);
        System.out.println("Author: " + get());   // ✅ access via public method
    }

}
public class BookLibrarySystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        EBook ebook = new EBook(123456, "Effective Java", "PDF");
        ebook.setAuthor("Joshua Bloch");
        ebook.displayDetails();
        System.out.println("Is the author name correct for the above book? (y)es/(n)o :");
        char ch=sc.next().charAt(0);
        if(ch=='y'){
            System.out.println("Enter the Author name: ");
            String newAuthorname=sc.next();
            ebook.setAuthor(newAuthorname);
        }
        ebook.displayDetails();
    }
}
