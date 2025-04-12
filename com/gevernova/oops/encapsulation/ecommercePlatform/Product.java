package com.gevernova.oops.encapsulation.ecommercePlatform;

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
