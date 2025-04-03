package src.Week1.Arrays.Level2;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = 0;
        int temp = number;

        // Counting the number of digits
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        int[] digits = new int[count];
        int index = 0;

        // Storing digits in the array
        while (number != 0) {
            digits[index++] = number % 10;
            number /= 10;
        }

        System.out.println("Reversed number: ");
        for (int i = count - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
    }
}

