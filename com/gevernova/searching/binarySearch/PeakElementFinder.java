package com.gevernova.searching.binarySearch;

public class PeakElementFinder {
    public static int findPeak(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean left = (i == 0 || arr[i] > arr[i - 1]);
            boolean right = (i == n - 1 || arr[i] > arr[i + 1]);

            if (left && right) {
                return i; // Peak found
            }
        }

        return -1; // No peak found (theoretically should never happen)
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 20, 4, 1, 0};
        int peakIndex = findPeak(array);
        System.out.println("Peak found at index: " + peakIndex + " (Value: " + array[peakIndex] + ")");
    }
}
