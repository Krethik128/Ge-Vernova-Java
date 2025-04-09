package com.gevernova.classesandobject.levelone;
class Employee{
    private String name;
    private int id;
    private double salary;
    Employee(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    void display(){
        System.out.println("Name: "+this.name);
        System.out.println("ID: " +this.id);
        System.out.println("Salary: " +this.salary);
    }

}
public class EmployeeClass {
    public static void main(String args[]){
        Employee obj1=new Employee("Krethik",185,120000.56);
        obj1.display();
    }
}
