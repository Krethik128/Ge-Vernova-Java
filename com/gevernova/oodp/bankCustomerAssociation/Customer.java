package com.gevernova.oodp.bankCustomerAssociation;

public class Customer {
    private String name;
    private double balance;
    private Bank bank;


    public Customer(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }
    public void setBank(Bank bank) {
        this.bank = bank;
    }
    public String getName() {
        return name;
    }

    public double getbalance() {
        return balance;
    }
    public void viewBalance() {
        System.out.println(name + " has ₹" + balance + " in " + bank.getBankName());
    }
}
