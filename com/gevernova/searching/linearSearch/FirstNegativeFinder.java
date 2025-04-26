package com.gevernova.searching.linearSearch;

import java.util.Scanner;

public class FirstNegativeFinder {
    public static int findFirstNegativeIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i;
            }
        }
        return -1; // No negative number found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int index = findFirstNegativeIndex(array);

        if (index != -1) {
            System.out.println("First negative number found at index: " + index + " (Value: " + array[index] + ")");
        } else {
            System.out.println("No negative number found in the array.");
        }

        scanner.close();
    }
}
