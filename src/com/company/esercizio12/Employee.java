/*3.13 (Classe Employee) Scrivete una classe Employee che include tre informazioni sotto for-
        ma di variabili di istanza: un nome (tipo String), un cognome (tipo String) e uno stipendio
        mensile (tipo double) dell’impiegato. La vostra classe dovrà avere un costruttore che inizia-
        lizza le tre variabili di istanza. Fornite i metodi set e get per ogni variabile di istanza. Se lo
        stipendio mensile non è positivo, impostatelo a 0.0. Scrivete un’applicazione di prova chiamata
        EmployeeTest che verifica le caratteristiche della classe Employee. Create due oggetti Em-
        ployee e visualizzate lo stipendio annuale di ciascun oggetto, concedete poi un aumento del
        10% a entrambi e stampate nuovamente il loro stipendio annuale.
        */
package com.company.esercizio12;

import java.util.Scanner;

public class Employee {
    private String name;
    private String surname;
    private Double salary;

    //Truststore
    public Employee (String name, String surname, Double salary){
        this.name = name;
        this.surname = surname;
        if( salary < 0 ){
            this.salary = 0.0;
        } else {
            this.salary = salary;
        }
    }

    //Setter
    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setSalary(Double salary){
        this.salary = salary;
    }

    //Getter
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public Double getSalary(){
        return salary;
    }
    public void salaryIncrease(Double percentage){
        setSalary(salary*((percentage/100)+1));
    }

    //public static void stampInformation (Employee employeeToStamp){
    //    System.out.printf("%s %s Salary: %.2f€\n", employeeToStamp.getName(), employeeToStamp.getSurname(), employeeToStamp.getSalary());
    //}
    //public void stampInformation2 (){
    //    System.out.printf("%s %s Salary: %.2f€\n", name, surname, salary);
    //}
    @Override
    public String toString() {
        return "Employee{" + "Name= " + name + ", " + " Surname=" + surname + ", " + " Salary= " + salary*12 + "}";
    }
    public static void inputNewEmployee(Employee newEmployee, Scanner input){

        System.out.print("Enter name: ");
        String name = input.next();
        newEmployee.setName(name);
        System.out.print("Enter surname: ");
        String surname = input.next();
        newEmployee.setSurname(surname);
        System.out.print("Enter salary: ");
        double salary = input.nextDouble();
        newEmployee.setSalary(salary);
    }
}
