package com.gevernova.sorting.quickSort;

class Sorting {
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low + 1;
        int j = high;
        while (i <= j) {

            while (i <= high && arr[i] <= pivot) {
                i++;
            }
            // Find the first element smaller than pivot from the right
            while (arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Finally, place the pivot in its correct sorted position
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j; // Return the partition index
    }

    static void qs(int[] arr, int low, int high) {
        if (low < high) {
            int pIndex = partition(arr, low, high);
            qs(arr, low, pIndex - 1);  // Sort left part
            qs(arr, pIndex + 1, high); // Sort right part
        }
    }

    public static int[] quickSort(int[] arr) {
        qs(arr, 0, arr.length - 1);
        return arr;
    }
}
