package com.gevernova.oops.polymorphism.rideHailingApp;

// Abstract class for all vehicle types in ride-hailing
abstract class Vehicle {
    private final int vehicleId;
    private final String driverName;
    protected double ratePerKm;

    public Vehicle(int vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Abstract method to be overridden to calculate fare
    public abstract void calculateFare(double distance);

    // Concrete method to display basic vehicle info
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: ₹" + ratePerKm);
    }
}
