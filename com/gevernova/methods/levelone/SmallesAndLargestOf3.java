package com.gevernova.methods.levelone;

import java.util.Scanner;

public class SmallesAndLargestOf3 {
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int temp[] = new int[2];

        // Finding the largest number
        if (number1 >= number2 && number1 >= number3) {
            temp[0] = number1;
        } else if (number2 >= number1 && number2 >= number3) {
            temp[0] = number2;
        } else {
            temp[0] = number3;
        }

        // Finding the smallest number
        if (number1 <= number2 && number1 <= number3) {
            temp[1] = number1;
        } else if (number2 <= number1 && number2 <= number3) {
            temp[1] = number2;
        } else {
            temp[1] = number3;
        }

        return temp;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2:");
        int num2 = sc.nextInt();
        System.out.println("Enter number 3:");
        int num3 = sc.nextInt();

        int[] result = findSmallestAndLargest(num1, num2, num3);

        System.out.println("The largest of the three numbers is: " + result[0]);
        System.out.println("The smallest of the three numbers is: " + result[1]);
    }

}
