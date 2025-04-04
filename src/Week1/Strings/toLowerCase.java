package src.Week1.Strings;

import java.util.Scanner;

public class toLowerCase {
        public static String toLowercase(String str) {
            String result = "";
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch >= 'A' && ch <= 'Z') {
                    ch = (char) (ch + 32);
                }
                result += ch;
            }
            return result;
        }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();
            String ConvertedUpperCase=toLowercase(str);
            String UsingInbuiltFunc=str.toLowerCase();
            if(ConvertedUpperCase.equals(UsingInbuiltFunc)){
                System.out.println(ConvertedUpperCase+" and "+UsingInbuiltFunc+" are Same");
            }
            else{
                System.out.println(ConvertedUpperCase+" and "+UsingInbuiltFunc+" are Not Same");
            }

        }
}

