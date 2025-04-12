package com.gevernova.constructors.accessmodifiers.bankAccountManagment;

class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Public method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }

    // Public method to get current balance
    public double getBalance() {
        return balance;
    }
}
