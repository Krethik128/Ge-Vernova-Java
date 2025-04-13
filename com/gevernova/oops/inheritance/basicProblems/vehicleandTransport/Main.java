package com.gevernova.oops.inheritance.basicProblems.vehicleandTransport;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car(180, "Petrol", 5),
                new Truck(120, "Diesel", 10.5),
                new Motorcycle(100, "Electric", false)
        };

        for (Vehicle v : vehicles) {
            System.out.println();
            v.displayInfo(); // Polymorphism in action
        }
    }
}
