package src.Week1.Programming_Elements;

import java.util.*;
public class Distance_in_Yards {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int dInFeet = sc.nextInt();
        int dInYards = dInFeet / 3;
        double dInMiles = (double) dInYards / 1760;
        System.out.println("The distance of " + dInFeet + " feet is equal to " + dInYards +" yards and " + dInMiles + " miles.");
    }
}