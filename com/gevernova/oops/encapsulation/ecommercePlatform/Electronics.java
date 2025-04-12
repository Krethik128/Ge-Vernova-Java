package com.gevernova.oops.encapsulation.ecommercePlatform;

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
