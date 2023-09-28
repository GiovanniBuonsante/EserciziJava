package com.company.esercizio4;

import java.util.Scanner;

public class es4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int radius;
        System.out.print("Enter the radius of the circle: ");
        radius = input.nextInt(); //remember to handle the not valid input such as character.
        System.out.printf("Diametro: %d\nArea: %f\nCirconferenza: %f",2*radius,Math.PI*(radius*radius),2*Math.PI*radius); //create separate method to perform calculation. Even creating a Circle class
        input.close();
    }
}
