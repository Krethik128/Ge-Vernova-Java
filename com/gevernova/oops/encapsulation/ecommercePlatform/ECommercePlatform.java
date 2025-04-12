package com.gevernova.oops.encapsulation.ecommercePlatform;

import java.util.ArrayList;

// Main class - demonstrates polymorphism, instanceof, and encapsulation
public class ECommercePlatform {
    public static void main(String[] args) {
        ArrayList<Product> cart = new ArrayList<>(); // Polymorphism: list of Product references

        Product laptop = new Electronics(101, "Laptop", 80000);
        Product shirt = new Clothing(102, "Shirt", 1500);
        Product rice = new Groceries(103, "Rice", 800);

        cart.add(laptop);
        cart.add(shirt);
        cart.add(rice);

        for (Product p : cart) {
            p.calculateDiscount(); // Polymorphic call to overridden method

            // instanceof checks if the object implements Taxable before casting
            if (p instanceof Taxable) {
                ((Taxable) p).calculateTax(); // Type casting to access Taxable methods
                ((Taxable) p).getTaxDetails();
            }

            // Output the product summary
            System.out.println("\nProduct: " + p.getName());
            System.out.println("Base Price: ₹" + p.getPrice());
            System.out.println("Discount: ₹" + p.getDiscount());
            System.out.println("Tax: ₹" + p.getTax());
            System.out.println("Final Price: ₹" + p.getFinalPrice());
        }
    }
}
