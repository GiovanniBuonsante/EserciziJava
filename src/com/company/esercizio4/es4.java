package com.company.esercizio4;

import java.util.Scanner;

public class es4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int radius = 0;
        boolean inputNotValid;
        do {
            System.out.print("Enter the radius of the circle: ");
            inputNotValid = false;
            try {
                radius = input.nextInt();
            } catch (Exception e) {
                inputNotValid = true;
                input.next();
            }
        } while (inputNotValid);
        System.out.printf("Diametro: %d\nArea: %f\nCirconferenza: %f",2*radius,Math.PI*(radius*radius),2*Math.PI*radius);
        input.close();
    }
}
