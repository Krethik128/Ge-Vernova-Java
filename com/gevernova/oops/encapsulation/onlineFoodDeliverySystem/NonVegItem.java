package com.gevernova.oops.encapsulation.onlineFoodDeliverySystem;

class NonVegItem extends FoodItem implements Discountable {
    private double nonVegCharge = 0;
    private double discount = 0;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public void calculateTotalPrice() {
        nonVegCharge = 20; // fixed additional charge per item
        totalPrice = (getPrice() + nonVegCharge) * getQuantity();
    }

    @Override
    public void applyDiscount() {
        discount = totalPrice * 0.03; // 3% discount
        totalPrice -= discount;
    }

    @Override
    public void getDiscountDetails() {
        System.out.println("Non-Veg Charge per item: ₹" + nonVegCharge);
        System.out.println("Discount Applied (Non-Veg): ₹" + discount);
    }
}
