package com.gevernova.objectinspector.shoppingCart;

public class ShoppingCart {
    public static void main(String[] args) {
        Product productOne = new Product("Laptop", 1000, 2);
        Product productTwo = new Product("Mouse", 25, 5);

        if (productOne instanceof Product) productOne.displayDetails();
        if (productTwo instanceof Product) productTwo.displayDetails();

        Product.updateDiscount(15.0);
        System.out.println("\nUpdated Discount:");
        productOne.displayDetails();
    }
}
