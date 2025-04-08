package com.gevernova.strings.leveltwo;
import java.util.Scanner;
import java.util.Random;

public class VotingEligibility {

    // Method to generate random 2-digit ages for n students
    public static int[] generateRandomAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) + 10;
        }
        return ages;
    }

    // Method to determine voting eligibility and return a 2D String array
    public static String[][] getVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            result[i][0] = String.valueOf(age);
            if (age < 0) {
                result[i][1] = "false"; // Invalid age
            } else if (age >= 18) {
                result[i][1] = "true";  // Can vote
            } else {
                result[i][1] = "false"; // Cannot vote
            }
        }
        return result;
    }

    // Method to display the 2D array in a table format
    public static void displayTable(String[][] data) {
        System.out.println("\nStudent\tAge\tCan Vote?");
        System.out.println("---------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println((i + 1) + "\t" + data[i][0] + "\t" + data[i][1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ages = generateRandomAges(n);

        String[][] result = getVotingEligibility(ages);

        displayTable(result);
    }
}

