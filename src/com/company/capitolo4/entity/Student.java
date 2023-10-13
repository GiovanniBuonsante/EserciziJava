package com.company.capitolo4.entity;

import java.util.Date;
import java.util.Scanner;

public class Student {
    private String name;
    private double average;
    private Date date;
    public enum Status {SIGNED, DACONTROLLARE, RITIRATO}
    private Status status = Status.DACONTROLLARE;

    private static int numRitirati;
    public Student(){

    }

    public Student(String name, double average, Status status) {
        this.name = name;
        if (average < 60 || average > 100){
            this.average = 0;
        } else {
            this.average = average;
        }
        if(status.equals(Status.RITIRATO)){
            numRitirati++;
        }
        this.status = status;

    }
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        if(status.equals(Status.RITIRATO)){
            numRitirati++;
        }
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAverage(double average) {
        if (average < 60 || average > 100) {
            this.average = 0;
        } else {
            this.average = average;
        }
    }

    public String getName() {
        return name;
    }

    public double getAverage() {
        return average;
    }

    public String getLetterGrade(Student[] students, int i) {
        if(students[i].getAverage() > 0 && students[i].getAverage() < 59) {
            return "F";
        } else if (students[i].getAverage() >= 60 && students[i].getAverage() <= 69) {
            return "D";
        } else if (students[i].getAverage() >= 70 && students[i].getAverage() <= 79) {
            return "C";
        } else if (students[i].getAverage() >= 80 && students[i].getAverage() <= 89) {
            return "B";
        } else if (students[i].getAverage() >= 90 && students[i].getAverage() <= 100) {
            return "A";
        }
        return null;
    }

    public void getStudentProfile(Student[] students, Scanner input, int inputUser ) {
        System.out.println("-----------------------------");
        System.out.println("Enter " + inputUser + " student profile");
        System.out.println("-----------------------------");
        for(int i = 0; i < inputUser; i++) {
            System.out.printf("\n%d°)", i+1);
            System.out.print("\nName: ");
            name = input.next();
            System.out.print("\nAverage: ");
            average = input.nextDouble();
            status = Status.SIGNED;
            students[i] = new Student(name, average, status);
        }
        System.out.println("-----------------------------");
    }

    public void stampStudentProfile(Student[] students, int inputUser) {
        System.out.println("-----------------------------");
        System.out.println("  Name student Pass or not   ");
        System.out.println("-----------------------------");
        for(int i = 0; i < inputUser; i++) {
            System.out.println(students[i].getAverage() >= 60 && students[i].getAverage() <= 100 ? "Name: " + students[i].getName() + " = PASSATO" +  "  Status: " + status : "Name: " + students[i].getName() + " = BOCCIATO" + "  Status: " + status);
        }
    }

    public void getMaxStudentAverage(Student[] students, int inputUser) {
        System.out.println("-----------------------------");
        System.out.println("  Student with average 100   ");
        System.out.println("-----------------------------");
        for(int i = 0; i < inputUser; i++) {
            if (students[i].getAverage() == 100) {
                System.out.println("Name: " + students[i].getName());
                break;
            }
        }
    }

    public void getOver80Average(Student[] students, int inputUser) {
        System.out.println("-----------------------------");
        System.out.println("Students with average over 80");
        System.out.println("-----------------------------");
        for(int i = 0; i < inputUser; i++) {
            if (students[i].getAverage() >= 80) {
                System.out.println("Name: " + students[i].getName());
            }
        }
        System.out.println("-----------------------------");
    }

    public static int getNumRitirati() {
        return numRitirati;
    }
}
