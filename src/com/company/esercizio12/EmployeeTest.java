package com.company.esercizio12;
import com.company.esercizio12.Employee;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        String  name;
        String surname;
        double salary;
        Scanner input = new Scanner(System.in);
        Employee employee1 = new Employee("Giovanni", "Buonsante", 1800.00);
        Employee employee2 = new Employee("Rebecca","Denigris", 1500.00);
        Employee employee3 = new Employee("Vitangelo", "Buonsante",2300.00);
        Employee employee4 = new Employee("","",0.0);
        Employee employee5 = new Employee("","",0.0);


        System.out.printf("%s %s Salary: %.2f€\n", employee1.getName(), employee1.getSurname(), employee1.getSalary());
        System.out.printf("%s %s Salary: %.2f€\n", employee2.getName(), employee2.getSurname(), employee2.getSalary());
        System.out.printf("%s %s Salary: %.2f€\n", employee3.getName(), employee3.getSurname(), employee3.getSalary());
        System.out.printf("%s %s Salary: %.2f€\n", employee4.getName(), employee4.getSurname(), employee4.getSalary());
        System.out.printf("%s %s Salary: %.2f€\n", employee5.getName(), employee5.getSurname(), employee5.getSalary());

        //employee 4
        System.out.print("Enter name: ");
        name = input.next();
        employee4.setName(name);
        System.out.print("Enter surname: ");
        surname = input.next();
        employee4.setSurname(surname);
        System.out.print("Enter salary: ");
        salary = input.nextDouble();
        employee4.setSalary(salary);

        //employee 5
        System.out.print("\nEnter name: ");
        name = input.next();
        employee5.setName(name);
        System.out.print("Enter surname: ");
        surname = input.next();
        employee5.setSurname(surname);
        System.out.print("Enter salary: ");
        salary = input.nextDouble();
        employee5.setSalary(salary);

        System.out.printf("%s %s Salary: %.2f€\n", employee1.getName(), employee1.getSurname(), employee1.getSalary()*12);
        System.out.printf("%s %s Salary: %.2f€\n", employee2.getName(), employee2.getSurname(), employee2.getSalary()*12);
        System.out.printf("%s %s Salary: %.2f€\n", employee3.getName(), employee3.getSurname(), employee3.getSalary()*12);
        System.out.printf("%s %s Salary: %.2f€\n", employee4.getName(), employee4.getSurname(), employee4.getSalary()*12);
        System.out.printf("%s %s Salary: %.2f€\n", employee5.getName(), employee5.getSurname(), employee5.getSalary()*12);

        System.out.printf("%s %s Salary: %.2f€\n", employee1.getName(), employee1.getSurname(), (employee1.salaryIncrease(employee1.getSalary(), 10.0))*12);
        System.out.printf("%s %s Salary: %.2f€\n", employee2.getName(), employee2.getSurname(), (employee1.salaryIncrease(employee2.getSalary(), 10.0))*12);
        System.out.printf("%s %s Salary: %.2f€\n", employee3.getName(), employee3.getSurname(), (employee1.salaryIncrease(employee3.getSalary(), 10.0))*12);
        System.out.printf("%s %s Salary: %.2f€\n", employee4.getName(), employee4.getSurname(), (employee1.salaryIncrease(employee4.getSalary(), 10.0))*12);
        System.out.printf("%s %s Salary: %.2f€\n", employee5.getName(), employee5.getSurname(), (employee1.salaryIncrease(employee5.getSalary(), 10.0))*12);
    }
}
