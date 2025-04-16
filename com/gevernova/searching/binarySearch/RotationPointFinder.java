package com.gevernova.searching.binarySearch;

public class RotationPointFinder {
    public static int findRotationPoint(int[] arr) {
        int low = 0, high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > arr[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low; // Index of the smallest element (rotation point)
    }

    public static void main(String[] args) {
        int[] arr = {15, 18, 2, 3, 6, 12};
        int rotationPoint = findRotationPoint(arr);
        System.out.println("Rotation point is at index: " + rotationPoint + " (Value: " + arr[rotationPoint] + ")");
    }
}
