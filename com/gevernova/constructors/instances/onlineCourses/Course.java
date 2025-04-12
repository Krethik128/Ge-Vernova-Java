package com.gevernova.constructors.instances.onlineCourses;

class Course {
    private String courseName;
    private double duration;
    private double fees;
    // Class variable to keep count of total products
    static String instituteName;

    Course(String courseName, double duration, double fees) {
        this.courseName = courseName;
        this.duration = duration;
        this.fees = fees;
    }

    // Instance method to display product details
    void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
        System.out.println("Fees: ₹" + fees);
        System.out.println("Institute Name: " + instituteName);
        System.out.println("----------------------");
    }

    // Class method to display total number of products
    static void updateInstituteName(String updatedName) {
        instituteName = updatedName;
    }

}
