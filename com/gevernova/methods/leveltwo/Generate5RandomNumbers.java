package com.gevernova.methods.leveltwo;
import java.util.Random;
import java.util.Arrays;
public class Generate5RandomNumbers {
    public int[] generate4DigitRandomArray(int size){
        int []randomNumbers=new int[size];
        Random random=new Random();
        for (int i = 0; i < size; i++) {
            // Generate a random integer between 1000 (inclusive) and 10000 (exclusive)
            randomNumbers[i] = random.nextInt(9000) + 1000;
        }
        return randomNumbers;


    }
    public double[] findAverageMinMax(int[] numbers){
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int number : numbers) {
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }

        double average = sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String args[]){
        Generate5RandomNumbers analyzer = new Generate5RandomNumbers();
        int numberOfValues = 5;

        int[] randomValues = analyzer.generate4DigitRandomArray(numberOfValues);
        System.out.println("Generated 4-digit random values: " + Arrays.toString(randomValues));

        double[] results = analyzer.findAverageMinMax(randomValues);

        if (!Double.isNaN(results[0])) {
            System.out.println("Average value: " + results[0]);
            System.out.println("Minimum value: " + (int) results[1]); // Cast to int as the original numbers are integers
            System.out.println("Maximum value: " + (int) results[2]); // Cast to int as the original numbers are integers
        } else {
            System.out.println("No numbers to analyze.");
        }
    }
}
