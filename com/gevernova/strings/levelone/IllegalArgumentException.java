package com.gevernova.strings.levelone;

public class IllegalArgumentException {
    public static void main(String []args){
        String string="Krethik";
        try{
            string.substring(7);
        } catch (java.lang.IllegalArgumentException e) {
            System.out.println("We have handled Exception");
        }
        System.out.println("Handled Exception");
    }
}
