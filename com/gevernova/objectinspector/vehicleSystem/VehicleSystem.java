package com.gevernova.objectinspector.vehicleSystem;

public class VehicleSystem {
    public static void main(String[] args) {
        Vehicle vehicleOne = new Vehicle(1010, "Kiran", "Car");
        Vehicle vehicleTwo = new Vehicle(1020, "Manoj", "Bike");

        if (vehicleOne instanceof Vehicle) vehicleOne.displayDetails();
        if (vehicleTwo instanceof Vehicle) vehicleTwo.displayDetails(); //checking if the object is instance of the class

        Vehicle.updateRegistrationFee(600.0);
        System.out.println("\nUpdated Fee:");
        vehicleOne.displayDetails();
    }
}