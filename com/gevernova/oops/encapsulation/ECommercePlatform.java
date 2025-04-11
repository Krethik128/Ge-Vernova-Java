package com.gevernova.oops.encapsulation;

import java.util.ArrayList;

// Abstract class - cannot be instantiated directly, but can be subclassed
abstract class Product {
    private int productId; // encapsulated: accessible via getter/setter
    private String name;
    private double price;
    protected double discount; // accessible by subclasses
    protected double tax;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Abstract method to be implemented by each product type
    abstract void calculateDiscount();

    // Getter methods (Encapsulation - controlled access)
    public double getPrice() {
        return price;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public double getTax() {
        return tax;
    }

    public double getFinalPrice() {
        return price + tax - discount; // formula to calculate final price
    }
}

// Interface - enforces classes to implement tax-related behavior
interface Taxable {
    void calculateTax();
    void getTaxDetails();
}

// Concrete class for Electronics, implements Taxable interface
class Electronics extends Product implements Taxable {
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public void calculateDiscount() {
        discount = getPrice() * 0.10; // 10% discount on electronics
    }

    @Override
    public void calculateTax() {
        tax = getPrice() * 0.18; // 18% GST for electronics
    }

    @Override
    public void getTaxDetails() {
        System.out.println("18% GST applied on Electronics.");
    }
}

// Concrete class for Clothing, also implements Taxable
class Clothing extends Product implements Taxable {
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    void calculateDiscount() {
        discount = getPrice() * 0.20; // 20% discount on clothing
    }

    @Override
    public void calculateTax() {
        tax = getPrice() * 0.05; // 5% GST for clothing
    }

    @Override
    public void getTaxDetails() {
        System.out.println("5% GST applied on Clothing.");
    }
}

// Groceries do not implement Taxable (no tax logic)
class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public void calculateDiscount() {
        discount = getPrice() * 0.05; // 5% discount on groceries
    }
}

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
