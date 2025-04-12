package com.gevernova.constructors.accessmodifiers;
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

class SavingsAccount extends BankAccount {

    public SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);   //  public
        System.out.println("Account Holder: " + accountHolder);   //  protected
        // System.out.println("Balance: " + balance);  Not accessible directly
        System.out.println("Balance: " + getBalance());           //  use getter
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(1001, "Alice", 5000);
        sa.deposit(1500);
        sa.withdraw(1000);
        sa.displayAccountInfo();

        System.out.println();
    }
}
