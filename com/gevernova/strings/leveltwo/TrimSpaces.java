package com.gevernova.strings.leveltwo;
import java.util.Scanner;
public class TrimSpaces {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String string=scanner.nextLine();
        string=string.trim();
        System.out.println(string);
    }

}
