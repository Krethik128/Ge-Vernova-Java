package com.gevernova.annotations;

public class AnnotationDemo {
    public static void main(String[] args) {
        System.out.println("=== Problem 1: Legacy API ===");
        LegacyAPI api = new LegacyAPI();
        api.oldFeature(); // Should show warning in IDE
        api.newFeature();

        System.out.println("\n=== Problem 2: Raw List Demo ===");
        RawListDemo listDemo = new RawListDemo();
        listDemo.demoRawList();

    }
}
