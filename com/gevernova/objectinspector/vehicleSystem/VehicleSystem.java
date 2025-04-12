package com.gevernova.objectinspector.vehicleSystem;

public class VehicleSystem {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(1010, "Kiran", "Car");
        Vehicle v2 = new Vehicle(1020, "Manoj", "Bike");

        if (v1 instanceof Vehicle) v1.displayDetails();
        if (v2 instanceof Vehicle) v2.displayDetails(); //checking if the object is instance of the class

        Vehicle.updateRegistrationFee(600.0);
        System.out.println("\nUpdated Fee:");
        v1.displayDetails();
    }
}