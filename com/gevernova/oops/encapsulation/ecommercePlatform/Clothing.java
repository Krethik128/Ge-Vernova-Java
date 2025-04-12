package com.gevernova.oops.encapsulation.ecommercePlatform;

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
