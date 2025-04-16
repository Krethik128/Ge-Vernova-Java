package com.gevernova.searching.binarySearch;

public class FirstLastOccurrence {

    // Find the first occurrence of the target
    public static int findFirst(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int first = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                first = mid;      // Store result
                high = mid - 1;   // Keep searching on the left
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return first;
    }

    // Find the last occurrence of the target
    public static int findLast(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int last = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                last = mid;       // Store result
                low = mid + 1;    // Keep searching on the right
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return last;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 4, 5, 6};
        int target = 4;

        int first = findFirst(arr, target);
        int last = findLast(arr, target);

        if (first != -1 && last != -1) {
            System.out.println("First Occurrence of " + target + ": " + first);
            System.out.println("Last Occurrence of " + target + ": " + last);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}

