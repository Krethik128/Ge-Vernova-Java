package com.gevernova.constructors.instances.onlineCourses;

public class OnlineCourseManagement {
    public static void main(String args[]){
        Course.updateInstituteName("Gevernova Academy");
        Course obj1 = new Course("DSA", 45, 2000);
        Course obj2 = new Course("DAA", 45, 2500);

        obj1.displayCourseDetails();
        obj2.displayCourseDetails();
        // Change institute name and display again
        Course.updateInstituteName("CodeMaster Academy");

        obj1.displayCourseDetails();
        obj2.displayCourseDetails();

    }
}
