package com.company.esercizio2;

import java.util.Scanner;

public class Es2 {
    public static void main(String[] args){
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter one integer: ");
        number = input.nextInt(); //remember to handle the not valid input such as character.
        if(number % 2 == 0){
            System.out.println("The number is even...");
        }else{
            System.out.println("The number is odd...");
        }
        input.close();
    }
}
