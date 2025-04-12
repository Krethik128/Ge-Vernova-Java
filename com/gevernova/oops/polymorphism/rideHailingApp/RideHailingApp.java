package com.gevernova.oops.polymorphism.rideHailingApp;

public class RideHailingApp {
    // Common method using polymorphism to calculate fare for different vehicle types
    public static void processRide(Vehicle vehicle, double distance, String location) {
        vehicle.getVehicleDetails();
        vehicle.calculateFare(distance);

        // instanceof used to safely access GPS methods
        if (vehicle instanceof GPS) {
            ((GPS) vehicle).updateLocation(location);
            ((GPS) vehicle).getCurrentLocation();
        }

    }

    public static void main(String[] args) {
        Vehicle car = new Car(201, "Raj", 15);
        Vehicle bike = new Bike(202, "Sita", 8);
        Vehicle auto = new Auto(203, "Ram", 10);

        processRide(car, 10.5, "MG Road");
        processRide(bike, 5.0, "Kondapur");
        processRide(auto, 7.5, "Secunderabad");
    }
}
