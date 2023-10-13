package com.company.esercizio16;

import java.security.SecureRandom;
import java.util.Scanner;

public class gameGuessNumber {
    private  static final SecureRandom randomNumber = new SecureRandom();
    private enum status {GUESS, GUESSNOT}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberTry = 0;
        status statusGame = status.GUESSNOT;
        int numberGuess = 1 + randomNumber.nextInt(1000);
        int numberUser;
        System.out.println("--GUESS THE NUMBER--");
        while (statusGame == status.GUESSNOT) {
            System.out.print("> ");
            numberUser = input.nextInt();
            if (numberUser == numberGuess) {
                statusGame = gameGuessNumber.status.GUESS;
                if(numberTry < 10) {
                    System.out.println("YOU KNOW THE SECRET - VERY LUCKY - YOU WON!!!");
                } else {
                    System.out.println("YOU WON BUT YOU CAN BETTER!!!");
                }
            } else {
                if(numberUser < numberGuess) {
                    System.out.println("Your number is minor!");
                    numberTry++;
                }
                if(numberUser > numberGuess) {
                    System.out.println("Your number is major!");
                    numberTry++;
                }
            }
        }
    }
}
