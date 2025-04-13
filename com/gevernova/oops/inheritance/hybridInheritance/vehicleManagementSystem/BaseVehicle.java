package com.gevernova.oops.inheritance.hybridInheritance.vehicleManagementSystem;

class BaseVehicle {
    protected String model;
    protected int maxSpeed;

    public BaseVehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void showSpecs() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}