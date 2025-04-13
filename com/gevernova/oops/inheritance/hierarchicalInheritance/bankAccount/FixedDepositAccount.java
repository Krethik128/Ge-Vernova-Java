package com.gevernova.oops.inheritance.hierarchicalInheritance.bankAccount;

class FixedDepositAccount extends BankAccount {
    private int depositPeriod;

    public FixedDepositAccount(int accountNumber, double balance, int depositPeriod) {
        super(accountNumber, balance);
        this.depositPeriod = depositPeriod;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Deposit Period: " + depositPeriod + " months");
    }
}
