package com.company.esercizio2;

import java.util.Scanner;

public class Es2 {

    public static void main(String[] args){

        int number = 0;

        boolean inputNotValid;

        Scanner input = new Scanner(System.in);

        do {
            inputNotValid = false;
            System.out.print("Enter one integer: ");
            try {
                number = input.nextInt();
            } catch (Exception e) {
                inputNotValid = true;
                input.next();
            }
        }while (inputNotValid);

        if(number % 2 == 0){
            System.out.println("The number is even...");
        }else{
            System.out.println("The number is odd...");
        }
        input.close();
    }
}
