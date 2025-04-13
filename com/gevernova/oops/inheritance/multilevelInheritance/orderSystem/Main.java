package com.gevernova.oops.inheritance.multilevelInheritance.orderSystem;

public class Main {
    public static void main(String[] args){
        System.out.println("\n--- Order Management System ---");
        Order o1 = new Order("ORD101", "2024-05-01");
        Order o2 = new ShippedOrder("ORD102", "2024-05-02", "TRK999123");
        Order o3 = new DeliveredOrder("ORD103", "2024-05-03", "TRK123456", "2024-05-05");

        System.out.println("Status 1: " + o1.getOrderStatus());
        System.out.println("Status 2: " + o2.getOrderStatus());
        System.out.println("Status 3: " + o3.getOrderStatus());
    }
}
