package src.Week1.Programming_Elements;

import java.util.*;
public class AreaOfTriangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        
        double areaCm = 0.5 * base * height;
        double areaIn = areaCm / (2.54 * 2.54);
        
        System.out.println("The area of the triangle is " + areaCm + " square cm and " + areaIn + " square inches.");
    }
}
