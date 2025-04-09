package com.gevernova.classesandobject.levetwo;

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

public class ShoppingCart {
    public static void main(String[] args){
        CartItem car=new CartItem("Mirror",50000,10);
        car.display();
    }
}
