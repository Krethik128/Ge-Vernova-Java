package com.gevernova.oops.polymorphism.rideHailingApp;

class Car extends Vehicle implements GPS {
    private String currentLocation;

    public Car(int vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public void calculateFare(double distance) {
        double serviceCharge = 50;
        double totalFare = (ratePerKm * distance) + serviceCharge;
        System.out.println("Total Car Fare: ₹" + totalFare);
    }

    @Override
    public void getCurrentLocation() {
        System.out.println("Car current location: " + currentLocation);
    }

    @Override
    public void updateLocation(String location) {
        currentLocation = location;
        System.out.println("Car location updated to: " + currentLocation);
    }
}
