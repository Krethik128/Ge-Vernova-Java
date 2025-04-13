package com.gevernova.oops.inheritance.hierarchicalInheritance.bankAccount;

public class Main {
    public static void main(String[] args){
        System.out.println("\n--- Bank Account System ---");
        BankAccount acc1 = new SavingsAccount(2001, 50000, 4.5);
        BankAccount acc2 = new CheckingAccount(2002, 30000, 10000);
        BankAccount acc3 = new FixedDepositAccount(2003, 100000, 12);

        acc1.displayBalance();
        ((SavingsAccount) acc1).displayAccountType();
        System.out.println();
        acc2.displayBalance();
        ((CheckingAccount) acc2).displayAccountType();
        System.out.println();
        acc3.displayBalance();
        ((FixedDepositAccount) acc3).displayAccountType();

    }
}
