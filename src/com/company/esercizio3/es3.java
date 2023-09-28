package com.company.esercizio3;

import java.util.Scanner;

public class es3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number0, number1;
        System.out.print("Enter first number: ");
        number0 = input.nextInt();
        System.out.print("Enter second number: ");
        number1 = input.nextInt();
        if(number0 % number1 == 0){
            System.out.println("The first number is divisible by the second number");
        }else{
            System.out.println("The first number isn't divisible by the second number");
        }

    }
}
