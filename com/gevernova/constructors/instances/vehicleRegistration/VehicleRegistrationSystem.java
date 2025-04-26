package com.gevernova.constructors.instances.vehicleRegistration;

public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        // Set the common registration fee
        Vehicle.updateRegistrationFee(1500.0);

        // Create some vehicles
        Vehicle vehicle = new Vehicle("Ravi Kumar", "Car");
        Vehicle vehicleOne = new Vehicle("Sneha Patil", "Scooter");

        // Display details
        vehicle.displayVehicleDetails();
        vehicleOne.displayVehicleDetails();

        // Update registration fee
        Vehicle.updateRegistrationFee(2000.0);

        // Display again after update
        vehicle.displayVehicleDetails();
        vehicleOne.displayVehicleDetails();
    }
}

