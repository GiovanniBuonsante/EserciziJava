package com.company.esercizio2;

import java.util.Scanner;

public class es1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int chilometriPercorsi;
        int litriInseriti = 50;
        double costroLitroGasolio = 1.90;
        int inputKeyboard = 0;
        int capienzaSerbatoio = 50;

        do {

            System.out.println("\nMENU\nEnter full: 2\nExit: 1");
            inputKeyboard = input.nextInt();

            if (inputKeyboard == 2) {

                System.out.println("Enter the information about your fuel full:");
                System.out.print("Chilometri percorsi: ");
                chilometriPercorsi = input.nextInt();
                System.out.print("litri inseriti: ");

                do {
                    litriInseriti = input.nextInt();
                } while (litriInseriti < 0 || litriInseriti > 50);
                capienzaSerbatoio = capienzaSerbatoio - litriInseriti;
                double litriUsati = (double) chilometriPercorsi /litriInseriti;
                System.out.printf("chilometri percorsi dall'ultimo pieno: %d\nLitri inseriti dall'ultimo pieno: %d\nChilometri per litro: %.2f", chilometriPercorsi, litriInseriti, litriUsati);
            }
        } while (inputKeyboard != 1);
    }
}
