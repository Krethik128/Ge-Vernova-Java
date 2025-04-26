package com.gevernova.strings.levelone;
import java.util.Scanner;
public class Substr {
    public static boolean comparecharat(String stringOne,String stringTwo){
        if(stringOne.length()!=stringTwo.length()){
            return false;
        }
        for(int i=0;i<stringOne.length();i++){
            if(stringOne.charAt(i)!=stringTwo.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = scanner.next();

        System.out.print("Enter second string: ");
        String string = scanner.next();
        int length=s.length();
        int lengthTwo=string.length();
        boolean isSame = comparecharat(s, string);
        boolean equalsComparison = s.substring(0,length).equals(string.substring(0,lengthTwo));

        if (isSame == equalsComparison) {
            System.out.println("Both comparison methods give the same result");
        } else {
            System.out.println("The results of both comparison methods differ.");
        }
    }
}
