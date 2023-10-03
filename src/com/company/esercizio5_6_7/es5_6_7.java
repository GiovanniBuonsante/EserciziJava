package com.company.esercizio5_6_7;

import java.util.Scanner;

public class es5_6_7 {

    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);

        //stampa valori da o a 10 e il loro rispettivo quadrato e cubo

        System.out.println("NUMBER SQUARE CUBE");

        for( int i = 0; i < 11; i++){
            System.out.printf("%d   %d   %d\n", i, i*i, i*i*i);
        }

        //inserimento 5 numeri e controllo zero, positivi e negativi

        int number, numPos = 0, numNeg = 0, numZero = 0;

        for(int i = 0; i < 5; i++){
            System.out.printf("Enter the %d°: ",i+1);
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

        //calcolatore indice massa corporea

        System.out.print("Enter your weight: ");
        int weight = input.nextInt();
        System.out.print("Enter your height: ");
        float height = input.nextFloat();
        float BMI = weight/(height*height);
        System.out.printf("\nYour BMI is: %f", BMI);
        System.out.println("\n");
        System.out.println("BMI Categories: \n" +
                "Underweight = <18.5\n" +
                "Normal weight = 18.5–24.9 \n" +
                "Overweight = 25–29.9 \n" +
                "Obesity = BMI of 30 or greater");
        input.close();
    }
}
