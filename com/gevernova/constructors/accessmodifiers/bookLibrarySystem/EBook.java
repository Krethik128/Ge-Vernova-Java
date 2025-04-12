package com.gevernova.constructors.accessmodifiers.bookLibrarySystem;

class EBook extends Book {
    private String format;

    public EBook(int ISBN, String title, String format) {
        super(ISBN, title);// Call parent constructor
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
