package com.gevernova.oops.polymorphism.bankingSystem;

public class BankingSystem {
    public static void main(String[] args) {
        // Polymorphism: treating different accounts as BankAccount type
        BankAccount acc1 = new SavingsAccount(1001, "Stuti", 50000);
        BankAccount acc2 = new CurrentAccount(1002, "Sam", 100000);

        // Perform operations
        acc1.deposit(10000);
        acc1.calculateInterest();

        acc2.withdraw(30000);
        acc2.calculateInterest();

        // instanceof check to access Loanable methods safely
        if (acc1 instanceof Loanable) {
            ((Loanable) acc1).applyForLoan();
            ((Loanable) acc1).calculateLoanEligibility();
        }

        if (acc2 instanceof Loanable) {
            ((Loanable) acc2).applyForLoan();
            ((Loanable) acc2).calculateLoanEligibility();
        }
    }
}

