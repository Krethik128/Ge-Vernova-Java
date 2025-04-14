package com.gevernova.oodp.bankCustomerAssociation;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String bankName;
    private List<Customer>customers;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }
    // Association method: allows customer to open an account in this bank
    public void openAccount(Customer customer) {
        customers.add(customer);
        System.out.println(customer.getName() + " opened an account at " + bankName);
    }

    public String getBankName() {
        return bankName;
    }
    public void listCustomers(){
        System.out.println("\nCustomers of " + bankName + ":");
        for(Customer c:customers){
            System.out.println("- " +c.getName());
        }
    }
}
