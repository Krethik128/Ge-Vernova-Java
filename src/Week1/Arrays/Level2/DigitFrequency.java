package src.Week1.Arrays.Level2;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = new int[10];
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10;
            digits[digit]++;
            temp /= 10;
        }

        System.out.println("Frequency of each digit in " + number + ":");
        for (int i = 0; i < 10; i++) {
            if (digits[i] > 0) {
                System.out.println("Digit " + i + ": " + digits[i]);
            }
        }
    }
}
