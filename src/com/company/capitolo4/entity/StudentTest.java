package com.company.capitolo4.entity;

import jdk.jshell.Snippet;

import java.util.Scanner;

/**
 *
 *
 */
public class StudentTest {
    public static void main(String[] args) {

        int inputUser;
        int numRitirati;
        Student student = new Student();
        Scanner input = new Scanner(System.in);

        System.out.print("Insert the number of the students: ");
        inputUser = input.nextInt();
        Student[] students = new Student[inputUser];

        student.getStudentProfile(students, input, inputUser);

        //for(int i = 0; i < inputUser; i++){
        //    System.out.println("\nName: " + students[i].getName() + "  Average: " + students[i].getAverage() + "  Letter: " + student.getLetterGrade(students, i));
        //}
        student.stampStudentProfile(students, inputUser);
        //student.getMaxStudentAverage(students, inputUser);
        //student.getOver80Average(students, inputUser);
        students[1].setStatus(Student.Status.RITIRATO);
        int choice;
        System.out.println("The 2 is ritired?");
        choice = input.nextInt();
        if(choice == 1) {
            students[2].setStatus(Student.Status.RITIRATO);
        }
        for(int i = 0; i < inputUser; i++) {
            System.out.println("Status: " + students[i].getStatus());
        }

        System.out.println("Num ritirati: " + Student.getNumRitirati());

        input.close();
    }
}
