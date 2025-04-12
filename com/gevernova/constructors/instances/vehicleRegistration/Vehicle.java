package com.gevernova.constructors.instances.vehicleRegistration;

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
