package com.gevernova.generics.smartWareHouse;

public class Electronics extends WarehouseItem{
    public Electronics(String name) {
        super(name);
    }
    @Override
    public void displayInfo(){
        System.out.println("Electronics Item: " + getName());
    }
}
