package com.gevernova.oodp.bankCustomerAssociation;

public class Main {
    public static void main(String[] args){
        Bank hdfc=new Bank("HDFC Bank");
        // Create customers
        Customer Krethik = new Customer("Krethik", 25000);
        Customer stuti = new Customer("Stuti", 15000);

        // Associate customers with the bank
        Krethik.setBank(hdfc);
        stuti.setBank(hdfc);

        // Open accounts at the bank (association)
        hdfc.openAccount(Krethik);
        hdfc.openAccount(stuti);

        // Customer actions
        Krethik.viewBalance();
        stuti.viewBalance();

        // Bank displays all its customers
        hdfc.listCustomers();

    }
}
