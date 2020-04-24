package com.poc4.sample;

import com.poc1.sample.Employee;

public class Runner {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Sabari";
        employee.details = "none";
        System.out.println(employee.name + " : " + employee.details);
    }
}
