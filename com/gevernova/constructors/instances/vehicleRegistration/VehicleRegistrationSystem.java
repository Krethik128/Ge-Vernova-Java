package com.gevernova.constructors.instances;

class Vehicle {
    private String ownerName;
    private String vehicleType;

    // Class variable: shared across all instances
    private static double registrationFee;

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: ₹" + registrationFee);
        System.out.println("---------------------------");
    }

    // Class method to update registration fee
    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }
}

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

