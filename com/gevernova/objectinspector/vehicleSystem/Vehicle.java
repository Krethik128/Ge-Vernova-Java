package com.gevernova.objectinspector.vehicleSystem;

class Vehicle {
    public static double registrationFee;
    public final int registrationNumber;
    public String ownerName;
    public String vehicleType;

    static {
        registrationFee = 500.0;
    }

    public Vehicle(int registrationNumber, String ownerName, String vehicleType) {//creating constructor
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    public void displayDetails() {
        System.out.println("Registration No: " + registrationNumber);
        System.out.println("Owner: " + ownerName);
        System.out.println("Type: " + vehicleType);
        System.out.println("Registration Fee: Rs." + registrationFee);
    }
}
