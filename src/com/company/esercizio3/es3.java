package com.company.esercizio3;

import java.util.Scanner;

public class es3 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        boolean inputNotValid;

        int number0 = 0, number1 = 0;

        do {
            inputNotValid = false;
            System.out.print("Enter first number: ");
            try {
                number0 = input.nextInt();
            } catch (Exception e) {
                inputNotValid = true;
                input.next();
            }
        } while (inputNotValid);

        do {
            inputNotValid = false;
            System.out.print("Enter second number: ");
            try {
                number1 = input.nextInt();
            } catch (Exception e) {
                inputNotValid = true;
                input.next();
            }
        } while (inputNotValid);

        if(number0 % number1 == 0){
            System.out.println("The first number is divisible by the second number");
        }else{
            System.out.println("The first number isn't divisible by the second number");
        }
        input.close();
    }
}
