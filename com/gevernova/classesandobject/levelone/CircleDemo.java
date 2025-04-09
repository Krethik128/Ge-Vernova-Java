package com.gevernova.classesandobject.levelone;

class Circle {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getCircumference() {
        return 2 * Math.PI * radius;
    }

    void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("Circumference: " + getCircumference());
    }
}

public class CircleDemo {
    public static void main(String[] args) {
        Circle c = new Circle(5.0);
        c.display();
    }
}
