package com.gevernova.programmingelements;

import java.util.*;
public class AreaOfTriangle {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();
        
        double areaCm = 0.5 * base * height;
        int areaIn =(int)(areaCm / (2.54 * 2.54));//Type casting
        System.out.println("The area of the triangle is " + areaCm + " square cm and " + areaIn + " square inches.");
    }
}
