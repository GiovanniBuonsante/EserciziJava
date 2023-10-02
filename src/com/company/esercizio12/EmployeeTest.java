package com.company.esercizio12;
import com.company.esercizio12.Employee;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee employee1 = new Employee("Giovanni", "Buonsante", 1800.00);
        Employee employee2 = new Employee("Rebecca","Denigris", 1500.00);
        Employee employee3 = new Employee("Vitangelo", "Buonsante",2300.00);
        Employee employee4 = new Employee("","",0.0);
        Employee employee5 = new Employee("","",0.0);


        //employee 4 and employee 5
        Employee.inputNewEmployee(employee4, input);
        System.out.println("----------------");
        Employee.inputNewEmployee(employee5, input);

        //Employee.inputNewEmployee(employee5);

        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
        System.out.println(employee3.toString());
        System.out.println(employee4.toString());
        System.out.println(employee5.toString());

        System.out.println("----------------");

        employee1.salaryIncrease(10.0);
        employee2.salaryIncrease(10.0);
        employee3.salaryIncrease(10.0);
        employee4.salaryIncrease(10.0);
        employee5.salaryIncrease(10.0);

        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
        System.out.println(employee3.toString());
        System.out.println(employee4.toString());
        System.out.println(employee5.toString());
    }
}
