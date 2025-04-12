package com.gevernova.oops.polymorphism.vehicleRentalSystem;

// Bike is a simple rentable vehicle
class Bike extends Vehicle {
    public Bike(String vehicleNumber, String type, int rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    @Override
    public void calculateRentalCost(int days) {
        int cost = getRentalRate() * days;
        System.out.println("Bike Rental Cost for " + days + " days: ₹" + cost);
    }
}
