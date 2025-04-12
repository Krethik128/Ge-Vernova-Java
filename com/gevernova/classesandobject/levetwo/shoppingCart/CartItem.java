package com.gevernova.classesandobject.levetwo.shoppingCart;

class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotalCost() {
        return price * quantity;
    }

    void display() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: $" + getTotalCost());
    }
}
