package com.gevernova.programmingelements;

import java.util.*;
class FindQuotientAndReminder {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The Quotient is "+a/b+" and Reminder of two number"+a+" and "+b +"is"+ a%b);
    }
}