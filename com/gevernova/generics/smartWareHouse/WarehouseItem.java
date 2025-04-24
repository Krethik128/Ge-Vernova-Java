package com.gevernova.generics.smartWareHouse;

abstract class WarehouseItem {
    String name;

    public WarehouseItem(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public abstract void displayInfo();
}
