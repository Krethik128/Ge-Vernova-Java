package com.gevernova.oops.encapsulation.onlineFoodDeliverySystem;

class VegItem extends FoodItem implements Discountable{
    private double discount = 0;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public void calculateTotalPrice() {
        totalPrice = getPrice() * getQuantity();
    }

    @Override
    public void applyDiscount() {
        discount = totalPrice * 0.05; // 5% discount
        totalPrice -= discount;
    }

    @Override
    public void getDiscountDetails() {
        System.out.println("Discount Applied (Veg): ₹" + discount);
    }
}
