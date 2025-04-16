package com.gevernova.searching.binarySearch;

import java.util.Scanner;

public class FindElementInSortedMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int midVal = matrix[mid / cols][mid % cols];

            if (midVal == target) return true;
            else if (midVal < target) left = mid + 1;
            else right = mid - 1;
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}
        };

        if (searchMatrix(matrix, target)) {
            System.out.println("Target " + target + " found in matrix.");
        } else {
            System.out.println("Target " + target + " not found in matrix.");
        }

        sc.close();
    }
}
