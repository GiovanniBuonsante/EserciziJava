package com.company.esercizio2;

import java.util.Scanner;

public class Es2 {
    public static void main(String[] args){
        int number = 0, check = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter one integer: ");
            try {
                number = input.nextInt();
                check = 1;
            } catch (Exception e) {
                input.next();
            }
        }while (check != 1);
        if(number % 2 == 0){
            System.out.println("The number is even...");
        }else{
            System.out.println("The number is odd...");
        }
        input.close();
    }
}
