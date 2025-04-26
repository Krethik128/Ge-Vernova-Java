package com.gevernova.constructors.instances.onlineCourses;

public class OnlineCourseManagement {
    public static void main(String args[]){
        Course.updateInstituteName("Gevernova Academy");
        Course course = new Course("DSA", 45, 2000);
        Course courseOne = new Course("DAA", 45, 2500);

        course.displayCourseDetails();
        courseOne.displayCourseDetails();
        // Change institute name and display again
        Course.updateInstituteName("CodeMaster Academy");

        course.displayCourseDetails();
        courseOne.displayCourseDetails();

    }
}
