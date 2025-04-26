package com.gevernova.strings.levelone;

import java.util.Scanner;
import java.lang.StringBuilder;

public class ToUppercase {

        public static String toUppercase(String str){
            StringBuilder result=new StringBuilder();
            for(int i=0;i<str.length();i++){
                char ch = str.charAt(i);
                if (ch >= 'a' && ch <= 'z') {
                    ch = (char) (ch - 32);
                }
                result.append(ch);
            }
            return result.toString();
        }
        public static boolean compareStrings(String stringOne, String stringTwo) {
            if (stringOne.length() != stringTwo.length()) {
                return false;
            }
            for (int i = 0; i < stringOne.length(); i++) {
                if (stringOne.charAt(i) != stringTwo.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
        public static void main(String[] args){
            Scanner scanner=new Scanner(System.in);
            String str=scanner.nextLine();
            String ConvertedUpperCase=toUppercase(str);
            String UsingInbuiltFunc=str.toUpperCase();
            boolean isSame = compareStrings(ConvertedUpperCase, UsingInbuiltFunc);

            System.out.println("Built-in lowercase: " + UsingInbuiltFunc);
            System.out.println("Manual lowercase:   " + ConvertedUpperCase);
            System.out.println("Are both conversions same? " + isSame);

        }
    }
