package com.gevernova.oops.inheritance.hybridInheritance.vehicleManagementSystem;

class ElectricVehicle extends BaseVehicle {
    public ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    public void charge() {
        System.out.println("Charging the electric vehicle...");
    }
}