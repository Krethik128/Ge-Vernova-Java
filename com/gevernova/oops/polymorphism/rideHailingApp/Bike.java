package com.gevernova.oops.polymorphism.rideHailingApp;

// Bike class - cheapest fare option
class Bike extends Vehicle implements GPS {
    private String currentLocation;

    public Bike(int vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public void calculateFare(double distance) {
        double totalFare = ratePerKm * distance;
        System.out.println("Total Bike Fare: ₹" + totalFare);
    }

    @Override
    public void getCurrentLocation() {
        System.out.println("Bike current location: " + currentLocation);
    }

    @Override
    public void updateLocation(String location) {
        currentLocation = location;
        System.out.println("Bike location updated to: " + currentLocation);
    }
}
