package com.gevernova.generics.smartWareHouse;

public class Groceries extends WarehouseItem {
    public Groceries(String name){
        super(name);
    }
    @Override
    public void displayInfo(){
        System.out.println("Groceries Item: " + getName());
    }
}
