package com.gevernova.java8.streams.advanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Date;


public class Problem {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee("Alice", 60000.0),
                new Employee("Bob", 45000d),
                new Employee("Charlie", 70000d),
                new Employee("David", 50000d),
                new Employee("Eve", 80000d)
        );

       List<Employee> newList= list.stream().filter(x->x.salary>50000).collect(Collectors.toCollection(ArrayList::new));
        newList.sort((s1,s2)->s2.name.length()-s1.name.length());
        System.out.println("guys above 50000 in sorted order");
       for(Employee object:newList){
           System.out.println(object.name+" "+object.salary);
       }

    }
}
class Employee{
    String name;
    Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}
