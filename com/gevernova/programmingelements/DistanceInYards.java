package com.gevernova.programmingelements;

import java.util.*;
public class DistanceInYards {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int distanceInFeet = scanner.nextInt();
        int distanceInYards = distanceInFeet / 3;
        double dInMiles = (double) distanceInYards / 1760;
        System.out.println("The distance of " + distanceInFeet + " feet is equal to " + distanceInYards +" yards and " + dInMiles + " miles.");
    }
}