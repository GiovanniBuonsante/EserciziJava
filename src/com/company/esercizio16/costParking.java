package com.company.esercizio16;

import java.util.Scanner;

public class costParking {
    public static void main(String[] args) {
        //HIiiiiii
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of the clients: ");
        int numberClient = input.nextInt();
        int sumClient = 0;
        int[] client = new int[numberClient];
        System.out.println("Enter " + numberClient + " clients parking hours: ");
        for(int i = 0; i < numberClient; i++) {
            client[i] = input.nextInt();
        }
        calculateCharges(client, numberClient);
        for(int i = 0; i < numberClient; i++) {
            sumClient += client[i];
        }
        System.out.println("Total: " + sumClient + "€");
    }
    public static void calculateCharges(int[] client, int numberClient) {
        for(int i = 0; i < numberClient; i++) {
            if(client[i] > 3) {
                if((2 + ((client[i] - 3)*0.5)) > 10) {
                    System.out.println("Client :" + (i + 1) + " ->" + "  Pay: " + 10 + "€");
                } else {
                    System.out.println("Client :" + (i + 1) + " ->" + "  pay: " + (2 + ((client[i] - 3)*0.5)) + "€");
                }

            }
            if(client[i] <= 3) {
                System.out.println("pay: " + 2 + "€");
            }
        }
    }
}
