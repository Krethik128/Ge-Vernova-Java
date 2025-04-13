package com.gevernova.oops.inheritance.singleInheritance.smartHomeSystem;

public class Main {
    public static void main(String[] args){
        System.out.println("\n--- Smart Home System ---");
        Device thermostat = new Thermostat("THM-001", "ON", 22.5);
        thermostat.displayStatus();
    }
}
