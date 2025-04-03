package src.Week1.Programming_Elements;

import java.util.Scanner;

public class Square {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int side=sc.nextInt();
        int perimeter=4*side;
        System.out.println("The length of the side is"+side+"and the perimeter of the square is "+perimeter);
    }
}
