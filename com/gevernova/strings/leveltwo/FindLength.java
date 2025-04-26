package com.gevernova.strings.leveltwo;
import java.util.*;
public class FindLength {
    public static void main(String[] args){
        System.out.println("Enter String");
        Scanner scanner=new Scanner(System.in);
        String string=scanner.nextLine();// string s; cin>>s;
        int count=0;
        while(true){
            try{
                string.charAt(count);//str[i];
                count++;
            }catch (StringIndexOutOfBoundsException e) {
                System.out.println("Length of String is " + count);
                break;
            }
        }
        System.out.println("The length of String using built-in length() method is "+string.length());
    }
}
