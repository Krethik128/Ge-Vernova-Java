package com.gevernova.strings.levelone;

import java.util.Scanner;

public class ToLowerCase {
        public static String toLowercase(String str) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch >= 'A' && ch <= 'Z') {
                    ch = (char) (ch + 32);
                }
                result.append(ch);
            }
            return result.toString();
        }
        public static boolean compareStrings(String string, String stringTwo) {
            if (string.length() != stringTwo.length()) {
                return false;
            }
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) != stringTwo.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
        public static void main(String[] args){
            Scanner scanner=new Scanner(System.in);
            String string=scanner.nextLine();

            String ConvertedLowerCase=toLowercase(string);
            String UsingInbuiltFunc=string.toLowerCase();
            boolean isSame = compareStrings(ConvertedLowerCase, UsingInbuiltFunc);

            System.out.println("Built-in lowercase: " + UsingInbuiltFunc);
            System.out.println("Manual lowercase:   " + ConvertedLowerCase);
            System.out.println("Are both conversions same? " + isSame);

        }
}

