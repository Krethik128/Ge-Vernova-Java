package com.gevernova.generics.smartWareHouse;

public class Main {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Smartphone"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair"));
        furnitureStorage.addItem(new Furniture("Table"));

        System.out.println("Electronics in Storage:");
        WarehouseUtils.displayItems(electronicsStorage.getAllItems());

        System.out.println("\nFurniture in Storage:");
        WarehouseUtils.displayItems(furnitureStorage.getAllItems());
    }
}
