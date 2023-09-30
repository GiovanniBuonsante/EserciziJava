package com.company.esercizio5;


import java.util.Scanner;

public class es5 {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        //stampa valori da o a 10 e i loro rispettivi quadrati e cubo
        System.out.println("NUMBER SQUARE CUBE");
        for( int i = 0; i < 11; i++){
            System.out.printf("%d   %d   %d\n", i, i*i, i*i*i);
        }
        //inserimento 5 numeri e controllo zero, positivi e negativi
        int number, numPos = 0, numNeg = 0, numZero = 0;
        for(int i = 0; i < 5; i++){
            System.out.printf("Enter the %d",i+1);
            number = input.nextInt();
            if(number == 0){
                numZero++;
            } else if (number < 0) {
                numNeg++;
            } else {
                numPos++;
            }
        }
        System.out.printf("Number zero: %d\nNumber positive: %d\nNumber negative: %d", numZero, numPos, numNeg);
    }
}
