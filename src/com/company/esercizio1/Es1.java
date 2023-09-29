package com.company.esercizio1;

import java.util.Scanner;

public class Es1 {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int numberInput = 0, numberMin = 0, numberMax = 0, check = 0;
        for(int i = 0;i < 5; i++){
            do {
                System.out.printf("Enter the %d number: \n",i+1); //use new line to increase legibility. You can also use some spaces.
                try {
                    numberInput = input.nextInt();
                    check = 1;
                } catch (Exception e) {
                    input.next();
                }
            } while (check != 1);
            if(numberInput >= numberMax){
                numberMax = numberInput;
                if( i == 0 ){
                    numberMin = numberInput;
                }
            } else if (numberInput < numberMin){
                numberMin = numberInput;
            }
        }
        System.out.printf("The number min is %d\nThe number max is: %d",numberMin,numberMax);
        input.close();
    }
}
