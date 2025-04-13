package com.gevernova.oops.inheritance.hierarchicalInheritance.bankAccount;

class CheckingAccount extends BankAccount {
    private int withdrawalLimit;

    public CheckingAccount(int accountNumber, double balance, int withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: ₹" + withdrawalLimit);
    }
}
