package com.gevernova.oops.polymorphism;

import java.util.ArrayList;

abstract class Vehicle{
    private final String vehicleNumber;
    private final String type;
    private int rentalRate;

    public Vehicle(String vehicleNumber, String type, int rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    abstract void  calculateRentalCost(int days);

    public int getRentalRate() {
        return rentalRate;
    }
    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate per day: ₹" + rentalRate);
    }
}
interface Insurable {
    void calculateInsurance();
    void getInsuranceDetails();
}
class Car extends Vehicle implements Insurable{
    private char model;
    private int yearsOld;
    public Car(String vehicleNumber, String type, int rentalRate,char model,int yearsOld){
        super(vehicleNumber,type,rentalRate);
        this.model=model;
        this.yearsOld=yearsOld;
    }

    public char getModel() {
        return model;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    @Override
    public void calculateInsurance(){
        System.out.println("");
    }
    @Override
    public void getInsuranceDetails(){

    }
    @Override
    public void calculateRentalCost(int days) {
        int cost = getRentalRate() * days;
        if (model == 'A') {
            cost *= 1.2;
        } else if (model == 'B') {
            cost *= 1.1;
        }
        System.out.println("Car Rental Cost for " + days + " days: ₹" + cost);
    }
}
class Bike extends Vehicle {
    public Bike(String vehicleNumber, String type, int rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    @Override
    public void calculateRentalCost(int days) {
        int cost = getRentalRate() * days;
        System.out.println("Bike Rental Cost for " + days + " days: ₹" + cost);
    }
}

class Truck extends Vehicle implements Insurable {
    public Truck(String vehicleNumber, String type, int rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    @Override
    public void calculateInsurance() {
        double insurance = getRentalRate() * 0.15;
        System.out.println("Truck Insurance Amount: ₹" + insurance);
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Truck is insured at a flat 15% rate of rental value.");
    }

    @Override
    public void calculateRentalCost(int days) {
        int cost = getRentalRate() * days + 1000; // Assume additional logistics cost
        System.out.println("Truck Rental Cost for " + days + " days: ₹" + cost);
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Bike("MH-01-BK-1234", "Bike", 200));
        vehicles.add(new Car("TS-08-HR-6693", "Car", 1500, 'A', 2));
        vehicles.add(new Truck("KA-05-MR-4455", "Truck", 3000));

        for (Vehicle v : vehicles) {
            System.out.println("\n--- Vehicle Info ---");
            v.displayDetails();
            v.calculateRentalCost(5); // assume 5 days rental

            if (v instanceof Insurable) {
                ((Insurable) v).calculateInsurance();
                ((Insurable) v).getInsuranceDetails();
            }
        }
    }
}
