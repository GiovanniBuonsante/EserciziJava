package com.company.esercizio1;

import java.util.Scanner;

public class Es1 {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int numberInput,numberMax, numberMin;
        System.out.println("Enter the 1 number");
        numberInput = input.nextInt();
        numberMax = numberInput;
        numberMin = numberInput;
        for(int i = 1;i < 5; i++){
            System.out.printf("Enter the %d number",i+1);
            numberInput = input.nextInt();
            if(numberInput > numberMax){
                numberMax = numberInput;
            }
            if(numberInput < numberMin){
                numberMin = numberInput;
            }
        }
        System.out.printf("The number min is %d\nThe number max is: %d",numberMin,numberMax);
    }
}
