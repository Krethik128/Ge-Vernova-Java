package com.gevernova.java8.streams.problems.employeesNamesUsingStreams;

class Employee {
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
