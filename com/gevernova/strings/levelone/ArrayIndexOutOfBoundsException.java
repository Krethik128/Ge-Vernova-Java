package com.gevernova.strings.levelone;
import java.util.*;
public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size=scanner.nextInt();
        int[] arr =new int[size];
        try{
            int a=arr[arr.length];
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            System.out.println("Handling ArrayIndexOutOfBoundsException");
        }

    }
}
