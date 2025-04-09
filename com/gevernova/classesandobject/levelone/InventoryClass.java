package com.gevernova.classesandobject.levelone;

class Item {
    private int itemCode;
    private String itemName;
    private double price;

    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    double getTotalCost(int quantity) {
        return price * quantity;
    }

    void display(int quantity) {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Unit Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: $" + getTotalCost(quantity));
    }
}

public class InventoryClass {
    public static void main(String[] args) {
        Item item = new Item(101, "Laptop", 800.0);
        item.display(2);
    }
}
