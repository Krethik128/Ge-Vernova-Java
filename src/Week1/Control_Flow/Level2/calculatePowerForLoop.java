import java.util.Scanner;

public class calculatePowerForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" base number: ");
        int number = sc.nextInt();

        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        int result = 1;

        if (power >= 0) {
            for (int i = 1; i <= power; i++) {
                result *= number;
            }
            System.out.println(result);
        } else {
            System.out.println("Please enter a non-negative power.");
        }

        sc.close();
    }
}
