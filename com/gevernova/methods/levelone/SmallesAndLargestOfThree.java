package com.gevernova.methods.levelone;

import java.util.Scanner;

public class SmallesAndLargestOfThree {
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int[] tempArr = new int[2];

        // Finding the largest number
        if (number1 >= number2 && number1 >= number3) {
            tempArr[0] = number1;
        } else if (number2 >= number1 && number2 >= number3) {
            tempArr[0] = number2;
        } else {
            tempArr[0] = number3;
        }

        // Finding the smallest number
        if (number1 <= number2 && number1 <= number3) {
            tempArr[1] = number1;
        } else if (number2 <= number1 && number2 <= number3) {
            tempArr[1] = number2;
        } else {
            tempArr[1] = number3;
        }

        return tempArr;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int numberOne = scanner.nextInt();
        System.out.println("Enter number 2:");
        int numberTwo = scanner.nextInt();
        System.out.println("Enter number 3:");
        int numberThree = scanner.nextInt();

        int[] result = findSmallestAndLargest(numberOne, numberTwo, numberThree);

        System.out.println("The largest of the three numbers is: " + result[0]);
        System.out.println("The smallest of the three numbers is: " + result[1]);
    }

}
