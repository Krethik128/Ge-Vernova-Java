package src.Week1.Strings.Level2;

import java.util.*;
public class FindLargestWord {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] builtInWords=str.split(" ");
        int maxi=0;
        String temp="";
        for(String st:builtInWords){
            if(st.length()>maxi){
                maxi=st.length();
                temp=st;
            }
        }
        System.out.println("Maximum length is of word "+temp+" in "+ str +" is "+maxi);
    }
}
