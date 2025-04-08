package src.week1.strings.level3;

import java.util.Scanner;

class BMI {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double[] heights = {1.75, 1.80, 1.65, 1.70, 1.60, 1.85, 1.90, 1.55, 1.78, 1.68};
        double[] weights = {70, 80, 60, 75, 55, 90, 85, 50, 77, 65};

        for (int i = 0; i < heights.length; i++) {
            double bmi = weights[i] / (heights[i] * heights[i]);
            String status = getStatus(bmi);
            System.out.printf("Height: %.2f m, Weight: %.2f kg, BMI: %.2f, Status: %s%n", heights[i], weights[i], bmi, status);
        }
    }

    public static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal weight";
        else if (bmi < 29.9) return "Overweight";
        else return "Obesity";
    }
}
