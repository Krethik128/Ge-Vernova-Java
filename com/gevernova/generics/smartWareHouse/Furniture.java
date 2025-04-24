package com.gevernova.generics.smartWareHouse;

class Furniture extends WarehouseItem {
    public Furniture(String name) {
        super(name);
    }

    @Override
    public void displayInfo() {
        System.out.println("Furniture Item: " + getName());
    }
}
