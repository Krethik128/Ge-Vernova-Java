package com.gevernova.oops.encapsulation.onlineFoodDeliverySystem;

abstract class FoodItem {
    private final String itemName;
    private final double price;
    private final int quantity;
    protected double totalPrice;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Abstract method to be implemented by Veg/Non-Veg items
    public abstract void calculateTotalPrice();

    // Concrete method to get item details (shared logic)
    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price per item: ₹" + price);
        System.out.println("Quantity: " + quantity);
    }

    // Getters (encapsulation)
    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
