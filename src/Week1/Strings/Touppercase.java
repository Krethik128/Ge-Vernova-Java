package src.Week1.Strings;

import java.util.Scanner;

public class Touppercase {

        public static String toUppercase(String str){
            String result="";
            for(int i=0;i<str.length();i++){
                char ch = str.charAt(i);
                if (ch >= 'a' && ch <= 'z') {
                    ch = (char) (ch - 32);
                }
                result += ch;
            }
            return result;
        }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();
            String ConvertedUpperCase=toUppercase(str);
            String UsingInbuiltFunc=str.toUpperCase();
            if(ConvertedUpperCase.equals(UsingInbuiltFunc)){
                System.out.println(ConvertedUpperCase+" and "+UsingInbuiltFunc+" are Same");
            }
            else{
                System.out.println(ConvertedUpperCase+" and "+UsingInbuiltFunc+" are Not Same");
            }

        }
    }
