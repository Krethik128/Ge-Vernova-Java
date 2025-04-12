package com.gevernova.oops.encapsulation.ecommercePlatform;

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
