package src.Week1.Strings;

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
            String ConvertedUpperCase=toUppercase(str);
            String UsingInbuiltFunc=str.toUpperCase();
            boolean isSame = compareStrings(ConvertedUpperCase, UsingInbuiltFunc);

            System.out.println("Built-in lowercase: " + UsingInbuiltFunc);
            System.out.println("Manual lowercase:   " + ConvertedUpperCase);
            System.out.println("Are both conversions same? " + isSame);

        }
    }
