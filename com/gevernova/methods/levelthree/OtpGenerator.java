package com.gevernova.methods.levelthree;
import java.util.Scanner;
import java.util.Random;
public class OtpGenerator {
    public static void Generate6DigitOTP(int n){
        for(int i=0;i<n;i++){
            int otp=(int)(Math.random()*90000)+10000;
            System.out.println(otp);
        }
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Otps Required :");
        int n=scanner.nextInt(); //n is the size of otp
        Generate6DigitOTP(n);
    }
}
