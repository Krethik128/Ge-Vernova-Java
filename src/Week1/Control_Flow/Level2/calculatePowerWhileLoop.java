import java.util.Scanner;

public class calculatePowerWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a base number: ");
        int number = sc.nextInt();

        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        int result = 1;
        int counter = 0;

        if (power >= 0) {
            while (counter < power) {
                result *= number;
                counter++;
            }
            System.out.println(result);
        } else {
            System.out.println("Please enter a non-negative power.");
        }

        sc.close();
    }
}

