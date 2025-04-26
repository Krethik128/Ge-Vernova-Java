package com.gevernova.constructors.accessmodifiers.bankAccountManagment;

public class BankAccountManagement {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1001, "Alice", 5000);
        savingsAccount.deposit(1500);
        savingsAccount.withdraw(1000);
        savingsAccount.displayAccountInfo();

        System.out.println();
    }
}
