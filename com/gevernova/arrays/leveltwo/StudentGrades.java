package com.gevernova.arrays.leveltwo;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        int[] physicsMarks = new int[numberOfStudents];
        int[] chemistryMarks = new int[numberOfStudents];
        int[] mathsMarks = new int[numberOfStudents];
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter marks for student " + (i + 1) + " in Physics: ");
            physicsMarks[i] = scanner.nextInt();
            if (physicsMarks[i] < 0) {
                System.out.println("Invalid input. Please enter positive values.");
                i--;
                continue;
            }

            System.out.print("Enter marks for student " + (i + 1) + " in Chemistry: ");
            chemistryMarks[i] = scanner.nextInt();
            if (chemistryMarks[i] < 0) {
                System.out.println("Invalid input. Please enter positive values.");
                i--;
                continue;
            }

            System.out.print("Enter marks for student " + (i + 1) + " in Maths: ");
            mathsMarks[i] = scanner.nextInt();
            if (mathsMarks[i] < 0) {
                System.out.println("Invalid input. Please enter positive values.");
                i--; //
                continue;
            }
        }
        for (int i = 0; i < numberOfStudents; i++) {
            percentages[i] = (physicsMarks[i] + chemistryMarks[i] + mathsMarks[i]) / 3.0;

            if (percentages[i] >= 90) {
                grades[i] = "A+";
            } else if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else {
                grades[i] = "F";
            }
        }

        System.out.println("\nStudent Details:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + (i + 1) + ": Physics = " + physicsMarks[i] + ", Chemistry = " + chemistryMarks[i] + ", Maths = " + mathsMarks[i] + ", Percentage = " + percentages[i] + ", Grade = " + grades[i]);
        }
    }
}

