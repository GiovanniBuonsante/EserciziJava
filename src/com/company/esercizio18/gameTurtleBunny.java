package com.company.esercizio18;

import java.security.SecureRandom;

public class gameTurtleBunny {
    public final int LENGTH_ROUTE = 70;

    public String[] rootTurtle = new String[LENGTH_ROUTE];
    public String[] rootBunny = new String[LENGTH_ROUTE];

    //public enum Animal {TURTLE, BUNNY}
    //public enum Status {WON_BUNNY, WON_TURTLE, CONTINUE}

    public int positionTurtle;

    public int positionBunny;

    Status gameStatus = Status.CONTINUE;


    public Status updatePosition(Animal animal) {
        SecureRandom randomNumber = new SecureRandom();
        int randomChangePosition = 1 + randomNumber.nextInt(10);
        switch (animal) {
            case TURTLE -> {
                if(randomChangePosition <= 5) {
                    positionTurtle += 3;
                    if(positionTurtle > LENGTH_ROUTE) {
                        gameStatus = Status.WON_TURTLE;
                        positionTurtle = LENGTH_ROUTE - 1;
                    }
                } else if (randomChangePosition == 6 || randomChangePosition == 7) {
                    positionTurtle -= 6;
                    if(positionTurtle < 0) {
                        positionTurtle= 0;
                    }
                } else {
                    positionTurtle += 1;
                    if(positionTurtle > LENGTH_ROUTE) {
                        positionTurtle = LENGTH_ROUTE - 1;
                        gameStatus = Status.WON_TURTLE;
                    }
                }
                break;
            }
            case BUNNY -> {
                switch (randomChangePosition) {
                    case 1:
                    case 2: {
                        break;
                    }
                    case 3:
                    case 4:{
                        positionBunny += 9;
                        if(positionBunny > LENGTH_ROUTE) {
                            gameStatus = Status.WON_BUNNY;
                            positionBunny = LENGTH_ROUTE - 1;
                        }
                        break;
                    }
                    case 5: {
                        positionBunny -= 12;
                        if (positionBunny < 0 ) {
                            positionBunny = 0;
                        }
                        break;
                    }
                    case 6:
                    case 7:
                    case 8: {
                        positionBunny += 1;
                        if(positionBunny > LENGTH_ROUTE) {
                            gameStatus = Status.WON_BUNNY;
                            positionBunny = LENGTH_ROUTE - 1;
                        }
                        break;
                    }
                    case 9:
                    case 10:{
                        positionBunny -= 2;
                        if (positionBunny < 0 ) {
                            positionBunny = 0;
                        }
                        break;
                    }
                }
            }
            default -> {
            }
        }
        return gameStatus;
    }

    public void game() {
        int round = 1;
        do {
            clearRoot();
            gameStatus = updatePosition(Animal.BUNNY);
            if (positionBunny < LENGTH_ROUTE) {
                rootBunny[positionBunny] = "B";
            } else {
                positionBunny = LENGTH_ROUTE - 1;
            }
            gameStatus = updatePosition(Animal.TURTLE);
            if (positionTurtle < LENGTH_ROUTE) {
                rootTurtle[positionTurtle] = "T";
            } else {
                positionTurtle = LENGTH_ROUTE - 1;
            }
            if(positionTurtle == positionBunny) {
                System.out.println("OUCH!");
            }
            System.out.print("\nROUND: " + round );
            stampRoot();
            round++;
            if(gameStatus == Status.WON_TURTLE) {
                System.out.println("\nLA TARTARUGA VINCE!!! EVVIVA!");
            }
            if(gameStatus == Status.WON_BUNNY) {
                System.out.println("\nVince il coniglio. Peccato!");
            }
        } while (gameStatus == Status.CONTINUE);
    }
    public void stampRoot() {
        System.out.println("\nBUNNY");
        for (int i = 0; i < LENGTH_ROUTE; i++) {
            if(rootBunny[i] == null) {
                System.out.print("| ");
            } else {
                System.out.print("|" + rootBunny[i]);
            }
        }
        System.out.println("\nTURTLE");
        for (int i = 0; i < LENGTH_ROUTE; i++) {
            if(rootTurtle[i] == null) {
                System.out.print("| ");
            } else {
                System.out.print("|" + rootTurtle[i]);
            }
        }
    }


    public void clearRoot() {
        for (int i = 0; i < LENGTH_ROUTE; i++) {
            rootTurtle[i] = null;
            rootBunny[i] = null;
        }
    }
}
