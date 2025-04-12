package com.gevernova.objectinspector.shoppingCart;

public class ShoppingCart {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 1000, 2);
        Product p2 = new Product("Mouse", 25, 5);

        if (p1 instanceof Product) p1.displayDetails();
        if (p2 instanceof Product) p2.displayDetails();

        Product.updateDiscount(15.0);
        System.out.println("\nUpdated Discount:");
        p1.displayDetails();
    }
}
