package com.company.esercizio8;

import java.util.Scanner;

public class es8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float worldPopulation;
        float populationGrowthRate;
        float populationIncrease;
        int year;
        System.out.print("Enter the world population: ");
        worldPopulation = input.nextFloat();
        System.out.print("Enter the population grown rate: ");
        populationGrowthRate = input.nextFloat();
        populationIncrease = (worldPopulation*populationGrowthRate)/100;
        System.out.printf("The population increase for one year is: %f\n",populationIncrease);
        System.out.println("how many years of projection?");
        year = input.nextInt();
        for(int i = 0; i < year; i++){
            System.out.printf("population: %f\n",worldPopulation+populationIncrease);
            worldPopulation = worldPopulation + populationIncrease;
        }

    }
}
