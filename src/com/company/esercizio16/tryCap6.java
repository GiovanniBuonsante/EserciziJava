package com.company.esercizio16;

import java.security.SecureRandom;
import java.util.Scanner;

public class tryCap6 {
    private static final SecureRandom randomNumber = new SecureRandom();
    private static int bankBalance;

    public int getBankBalance() {
        return bankBalance;
    }

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
        //hiiii
        Scanner input = new Scanner(System.in);
        bankBalance = 1000;
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
        if (gameStatus == Status.CONTINUE) {
            int choiceUSer;
            int betUser;
            do {
                if (bankBalance != 0) {
                    System.out.println("-------MENU-------");
                    System.out.println("GAME = 1");
                    System.out.println("BANK BALANCE = 2");
                    System.out.println("BETTING LEGEND = 2");
                    System.out.println("EXIT = 0");
                    System.out.println("-------------------");
                    System.out.print("\n-> ");
                    choiceUSer = input.nextInt();
                    switch (choiceUSer) {
                        case 1: {
                            message();
                            //
                            System.out.println("how many money you want to bet?");
                            System.out.println("5x bet");
                            int checkBet;
                            do {
                                checkBet = 0;
                                betUser = input.nextInt();
                                if (betUser > bankBalance) {
                                    System.out.println("Your bet is major of your bank balance!");
                                    checkBet = 1;
                                }
                            } while (checkBet == 1);
                            //
                            sumDice = rollDice();
                            if (sumDice == myPoint) {
                                bankBalance = bankBalance + (betUser * 5);
                                gameStatus = Status.WON;
                                System.out.println("WIN!");
                            } else if (sumDice == SEVEN) {
                                bankBalance = bankBalance - (betUser * 3);
                                gameStatus = Status.LOST;
                                System.out.println("LOST!");
                            }
                            if (gameStatus != Status.WON && gameStatus != Status.LOST) {
                                bankBalance = bankBalance - betUser;
                                System.out.println("LOST!");
                            }
                            break;
                        }
                        case 2: {
                            System.out.println("Bank balance = " + bankBalance);
                            break;
                        }
                        case 3: {
                            System.out.println("-------------------");
                            System.out.println("WIN = + bet * 5");
                            System.out.println("LOST = - bet");
                            System.out.println("LOST with 7 = - bet * 3");
                            System.out.println("-------------------");
                        }
                    }
                } else {
                    System.out.println("Spiacente, siete al verde!");
                    System.out.println("-------MENU-------");
                    System.out.println("EXIT = 0");
                    System.out.println("-------------------");
                    do {
                        System.out.print("\n-> ");
                        choiceUSer = input.nextInt();
                    } while (choiceUSer != 0);
                }
            } while (choiceUSer != 0);
        } else {
            if (gameStatus == Status.WON) {
                System.out.println("WIN!");
            }
            else {
                System.out.println("LOST!");
            }
        }
        input.close();
    }
    public static int rollDice() {
        int diceOne = 1 + randomNumber.nextInt(6);
        int diceTwo = 1 + randomNumber.nextInt(6);
        System.out.printf("Player rolled %d + %d = %d%n", diceOne, diceTwo, diceOne + diceTwo);
        return diceOne + diceTwo;
    }
    public static void message() {
        int randomMessage = randomNumber.nextInt(3);
        switch (randomMessage) {
            case 0:{
                System.out.println("Ah, sei quasi in bancarotta eh?");
                break;
            }
            case 1: {
                System.out.println("Forza, rischia un po’!");
                break;
            }
            case 2: {
                System.out.println("Sei sopra di bestia, è ora di passare a incassare le fiches!");
                break;
            }
            default: {
                break;
            }
        }
    }
}
