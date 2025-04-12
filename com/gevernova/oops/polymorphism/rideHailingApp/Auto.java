package com.gevernova.oops.polymorphism.rideHailingApp;

class Auto extends Vehicle implements GPS {
    private String currentLocation;

    public Auto(int vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public void calculateFare(double distance) {
        double nightSurcharge = 30;
        double totalFare = (ratePerKm * distance) + nightSurcharge;
        System.out.println("Total Auto Fare: ₹" + totalFare);
    }

    @Override
    public void getCurrentLocation() {
        System.out.println("Auto current location: " + currentLocation);
    }

    @Override
    public void updateLocation(String location) {
        currentLocation = location;
        System.out.println("Auto location updated to: " + currentLocation);
    }
}
