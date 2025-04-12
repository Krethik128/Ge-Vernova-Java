package com.gevernova.classesandobject.levelone.mobileClass;

class MobilePhone {
    private String brand;
    private String model;
    private double price;

    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }


}
