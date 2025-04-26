package com.gevernova.programmingelements;

import java.util.*;
class FindQuotientAndReminder {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int numberOne=sc.nextInt();
        int numberTwo=sc.nextInt();
        System.out.println("The Quotient is "+numberOne/numberTwo+" and Reminder of two number"+numberOne+" and "+numberTwo +"is"+ numberOne%numberTwo);
    }
}