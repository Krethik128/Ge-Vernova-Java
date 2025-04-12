package com.gevernova.constructors.instances.vehicleRegistration;

public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        // Set the common registration fee
        Vehicle.updateRegistrationFee(1500.0);

        // Create some vehicles
        Vehicle v1 = new Vehicle("Ravi Kumar", "Car");
        Vehicle v2 = new Vehicle("Sneha Patil", "Scooter");

        // Display details
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        // Update registration fee
        Vehicle.updateRegistrationFee(2000.0);

        // Display again after update
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}

