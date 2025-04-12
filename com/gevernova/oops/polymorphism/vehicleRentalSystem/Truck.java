package com.gevernova.oops.polymorphism.vehicleRentalSystem;

// Truck is also insurable and has an extra logistics charge
class Truck extends Vehicle implements Insurable {
    public Truck(String vehicleNumber, String type, int rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    @Override
    public void calculateInsurance() {
        double insurance = getRentalRate() * 0.15;
        System.out.println("Truck Insurance Amount: ₹" + insurance);
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Truck is insured at a flat 15% rate of rental value.");
    }

    @Override
    public void calculateRentalCost(int days) {
        int cost = getRentalRate() * days + 1000; // fixed logistics cost
        System.out.println("Truck Rental Cost for " + days + " days: ₹" + cost);
    }
}
