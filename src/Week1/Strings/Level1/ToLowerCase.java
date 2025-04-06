package src.Week1.Strings;

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
        public static boolean compareStrings(String s1, String s2) {
            if (s1.length() != s2.length()) {
                return false;
            }
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();

            String ConvertedLowerCase=toLowercase(str);
            String UsingInbuiltFunc=str.toLowerCase();
            boolean isSame = compareStrings(ConvertedLowerCase, UsingInbuiltFunc);

            System.out.println("Built-in lowercase: " + UsingInbuiltFunc);
            System.out.println("Manual lowercase:   " + ConvertedLowerCase);
            System.out.println("Are both conversions same? " + isSame);

        }
}

