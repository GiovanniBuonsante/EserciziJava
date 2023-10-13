package com.company.esercizio15_fineCapitolo3;

import java.util.Scanner;

public class HealthProfileTest {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);

        HealthProfile healthProfile = new HealthProfile();

        healthProfile.inputHealthProfile (healthProfile, input);


        System.out.println("Enter health Profile: (name, surname, day/month/year, height, weight");
        HealthProfile healthProfile1 = new HealthProfile(input.next(),input.next(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextDouble(),input.nextDouble());

        System.out.println(healthProfile);
        System.out.println(healthProfile1);

        input.close();
    }
}
