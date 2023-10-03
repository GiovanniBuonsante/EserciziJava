package com.company.esercizio15_fineCapitolo3;

import java.util.Scanner;

public class HealthProfileTest {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);

        HealthProfile healthProfile = new HealthProfile("","", 0, 0, 0.0, 0.0, 0.0);

        healthProfile.inputHealthProfile (healthProfile, input);

        System.out.println(healthProfile);

        input.close();
    }
}
