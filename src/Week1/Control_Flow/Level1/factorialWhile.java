import java.util.Scanner;

public class factorialWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Not a natural number");
        } else {
            int sumByFormula = number * (number + 1) / 2;
            int sumByLoop = 0;

            int i = 1;
            while (i <= number) {
                sumByLoop += i;
                i++;
            }

            System.out.println("Sum using formula: " + sumByFormula);
            System.out.println("Sum using loop: " + sumByLoop);
            System.out.println("Both results are " + (sumByFormula == sumByLoop ? "correct" : "incorrect"));
        }
    }
}
