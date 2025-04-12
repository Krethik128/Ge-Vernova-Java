package com.gevernova.oops.polymorphism.bankingSystem;

// Abstract class representing a generic bank account
abstract class BankAccount {
    private final int accountNumber;
    private final String holderName;
    private double balance;

    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Concrete method for depositing money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount + ". New Balance: ₹" + balance);
    }

    // Concrete method for withdrawing money
    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Insufficient balance. Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + ". Remaining Balance: ₹" + balance);
        }
    }

    // Abstract method to be implemented by specific account types
    abstract void calculateInterest();

    // Getters (encapsulation)
    public Double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }
}
