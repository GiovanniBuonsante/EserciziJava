package com.company.esercizio9;

import java.util.Scanner;

public class es9 {

    public static void main (String[] args) {
        //programma che calcolo il costo giornalieri per andare a lavoro in macchi na
        //e il risparmio usa la formula carpooling.
        Scanner input = new Scanner(System.in);

        int km, personShare;

        float fuelPrice, kmForLiter, costPark, costRoadTolls, totalCostDay;

        System.out.print("Enter kilometers to go to work in a day: ");
        km = input.nextInt();
        System.out.print("Enter the fuel price: ");
        fuelPrice = input.nextFloat();
        System.out.print("Enter the kilometers for a litre: ");
        kmForLiter = input.nextFloat();
        System.out.print("Enter the cost of the park: ");
        costPark = input.nextFloat();
        System.out.print("Enter the cost of the road tolls: ");
        costRoadTolls = input.nextFloat();

        System.out.println("-------------");

        totalCostDay = ((km/kmForLiter)*fuelPrice)+costPark+costRoadTolls;

        System.out.printf("Fuel price: %.3f€\nCost park: %.2f€\nCost road tolls: %.2f€\n----------\nTotal cost: %.2f/day\n",((km/kmForLiter)*fuelPrice),costPark,costRoadTolls, totalCostDay);

        System.out.println("-------------");

        System.out.print("Used carpooling you share your car with many person: ");
        personShare = input.nextInt();

        System.out.println("-------------");

        System.out.printf("Total cost with carpooling: %.2f€\nSaving: %.2f€",(totalCostDay/(personShare+1)), totalCostDay-(totalCostDay/personShare));

        input.close();

    }
}