package com.company.esercizio16;

import java.security.SecureRandom;
import java.util.Scanner;

public class tryCap6 {
    private static final SecureRandom randomDice = new SecureRandom();
    private enum Status {WON, CONTINUE, LOST};
    private static final int TWO = 2;
    private static final int THREE = 3;
    private static final int SEVEN = 7;
    private static final int ELEVEN = 11;
    private static final int TWELVE = 12;

    public static void main(String[] args) {
        /*
        //
        //Lancio di dadi un certo numero di volte
        //
        int one = 0, two = 0, three = 0, four = 0, five = 0, six = 0;
        Scanner input = new Scanner(System.in);
        int[] face = new int[100_000_000];
        for (int i = 0; i < 100_000_000; i++) {
            face[i] = 1 + randomNumber.nextInt(6);
            switch (face[i]){
                case 1: {
                    one++;
                    break;
                }
                case 2: {
                    two++;
                    break;
                }
                case 3: {
                    three++;
                    break;
                }
                case 4: {
                    four++;
                    break;
                }
                case 5: {
                    five++;
                    break;
                }
                case 6: {
                    six++;
                    break;
                }
                default:
                    throw new IllegalStateException("Unexpected value: " + face[i]);
            }
        }
        input.close();
        System.out.println("-------------------");
        System.out.println("1: " + one + "\n2: " + two + "\n3: " + three + "\n4: " + four + "\n5: " + five + "\n6: " + six);

         */
        //Gioco del lancio del dado
        Status gameStatus;
        int sumDice = rollDice();
        int myPoint = 0;
        switch (sumDice) {
            case SEVEN:
            case ELEVEN:
                gameStatus = Status.WON;
                break;
            case TWO:
            case THREE:
            case TWELVE:
                gameStatus = Status.LOST;
                break;
            default:
                gameStatus = Status.CONTINUE;
                myPoint = sumDice;
                System.out.println("YOUR POINT: " + myPoint);
                break;
        }
        while (gameStatus == Status.CONTINUE) {
            sumDice = rollDice();
            if (sumDice == myPoint) {
                gameStatus = Status.WON;
            } else if (sumDice == SEVEN){
                gameStatus = Status.LOST;
            }
        }
        if (gameStatus == Status.WON) {
            System.out.println("WIN!");
        } else {
            System.out.println("LOST!");

        }
    }
    public static int rollDice() {
        int diceOne = 1 + randomDice.nextInt(6);
        int diceTwo = 1 + randomDice.nextInt(6);
        System.out.printf("Player rolled %d + %d = %d%n", diceOne, diceTwo, diceOne + diceTwo);
        return diceOne + diceTwo;
    }
}
