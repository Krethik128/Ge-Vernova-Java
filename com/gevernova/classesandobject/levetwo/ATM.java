package com.gevernova.classesandobject.levetwo;

class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient balance.");
    }

    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account No: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

public class ATM {
    public static void main(String[] args){
        BankAccount obj1=new BankAccount("Krethik","MKPK54321",50000);
        obj1.displayBalance();
    }
}
