package com.gevernova.constructors.accessmodifiers.bankAccountManagment;

public class BankAccountManagement {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(1001, "Alice", 5000);
        sa.deposit(1500);
        sa.withdraw(1000);
        sa.displayAccountInfo();

        System.out.println();
    }
}
