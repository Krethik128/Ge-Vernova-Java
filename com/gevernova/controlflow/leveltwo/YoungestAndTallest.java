package com.gevernova.controlflow.leveltwo;

import java.util.Scanner;

public class YoungestAndTallest
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ageAmar = scanner.nextInt();
        int ageAnthony = scanner.nextInt();
        int ageAkbar = scanner.nextInt();
        double heightAmar = scanner.nextDouble();
        double heightAkbar = scanner.nextDouble();
        double heightAnthony = scanner.nextDouble();
        
        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        double tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));

        String youngest = (youngestAge == ageAmar) ? "Amar" : (youngestAge == ageAkbar) ? "Akbar" : "Anthony";
        String tallest = (tallestHeight == heightAmar) ? "Amar" : (tallestHeight == heightAkbar) ? "Akbar" : "Anthony";

        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);
    }
}
