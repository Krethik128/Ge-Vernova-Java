package com.gevernova.objectinspector.bankAccount;

public class BankAccountSystem {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Alice", 1001);
        BankAccount acc2 = new BankAccount("Bob", 1002);

        // instanceof check before displaying details
        if (acc1 instanceof BankAccount) {
            acc1.displayAccountDetails();
        }

        if (acc2 instanceof BankAccount) {
            acc2.displayAccountDetails();
        }

        // Call static method
        BankAccount.getTotalAccounts();
    }
}
