package com.company.esercizio1;

import java.util.Scanner;

public class Es1 {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int numberInput = 0, numberMax, numberMin;

        //try to move all the input in the for starting from 0
        System.out.println("Enter the 1 number");
        try {
            numberInput = input.nextInt(); //remember to handle the not valid input such as character.
        } catch (Exception e) {
            //Excpetion handled - Do something
        }

        numberMax = numberInput;
        numberMin = numberInput;
        for(int i = 1;i < 5; i++){
            System.out.printf("Enter the %d number\n",i+1); //use new line to increase legibility. You can also use some spaces.
            numberInput = input.nextInt();
            if(numberInput > numberMax){
                numberMax = numberInput;
            }
            if(numberInput < numberMin){
                numberMin = numberInput;
            }
        }
        System.out.printf("The number min is %d\nThe number max is: %d",numberMin,numberMax);
        input.close();
    }
}
