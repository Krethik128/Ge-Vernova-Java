package com.gevernova.oops.polymorphism.vehicleRentalSystem;

// Abstract class: blueprint for all vehicles
abstract class Vehicle {
    private final String vehicleNumber;
    private final String type;
    private final int rentalRate;

    public Vehicle(String vehicleNumber, String type, int rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Abstract method to be customized by each vehicle type
    abstract void calculateRentalCost(int days);

    public int getRentalRate() {
        return rentalRate;
    }

    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate per day: ₹" + rentalRate);
    }
}
