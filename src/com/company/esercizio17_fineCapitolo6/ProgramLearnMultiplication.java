package com.company.esercizio17_fineCapitolo6;

import java.security.SecureRandom;
import java.util.Scanner;

/*
(Istruzione assistita da computer) L’uso dei computer nell’ambito della formazione sco-
lastica è indicato come istruzione assistita da computer (CAI, Computer-Assisted Instruction).

Scrivete un programma che aiuterà uno studente della scuola elementare a imparare la moltipli-
cazione. Utilizzate un oggetto SecureRandom per produrre due numeri interi positivi a una cifra.

Il programma dovrebbe quindi porre all’utente una domanda, per esempio “Qual è il risultato di
6 per 7”?
Lo studente deve poi inserire la risposta. Successivamente, il programma controlla la risposta
dello studente. Se è corretta, deve apparire il messaggio “Molto buono!” e il programma deve

proporre un’altra moltiplicazione. Se la risposta è errata, deve apparire il messaggio “No. Ri-
prova.” e il programma deve lasciare che lo studente provi ripetutamente a rispondere alla stessa

domanda fino a quando non indovinerà la risposta. È necessario utilizzare un metodo separa-
to per generare ogni nuova domanda. Questo metodo deve essere invocato una volta all’avvio

dell’applicazione e ogni volta che l’utente risponde correttamente alla domanda.
 */
public class ProgramLearnMultiplication {
    private static final SecureRandom randomNumber = new SecureRandom();
    private int numberOne;
    private int numberTwo;
    private int numberTryCorrect;
    private int numberTryIncorrect;
    private final int numberQuestion = 10;
    private enum Status {CORRECT, INCORRECT}
    public enum CheckLevel {STAY, UP}


    //GETTER
    public int getNumberOne() {
        return numberOne;
    }
    public int getNumberTwo() {
        return numberTwo;
    }
    public int getNumberTryCorrect() {
        return numberTryCorrect;
    }
    public int getNumberTryIncorrect() {
        return numberTryIncorrect;
    }


    //SETTER
    public void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }
    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }
    public void setNumberTryCorrect(int numberTryCorrect) {
        this.numberTryCorrect = numberTryCorrect;
    }
    public void setNumberTryIncorrect(int numberTryIncorrect) {
        this.numberTryIncorrect = numberTryIncorrect;
    }


    //CONSTRUCTOR
    public ProgramLearnMultiplication() {
    }


    //METHOD
    public void getAnswer(Scanner input, int inputType, int inputDifficult) {

        int result = 0;

        int rangeNumber = questionDifficult(inputDifficult);

        switch (inputType) {

            case 1 : {

                for(int i = 0; i < numberQuestion; i++) {

                    setNumberOne(randomNumber.nextInt(rangeNumber));
                    setNumberTwo(randomNumber.nextInt(rangeNumber));
                    result = getNumberOne() + getNumberTwo();
                    System.out.print("\nHow much is " + getNumberOne() + " + " + getNumberTwo() + "?" + "->");
                    inputInt(input, result);

                }
                break;
            }
            case 2 : {

                for(int i = 0; i < numberQuestion; i++) {

                    setNumberOne(randomNumber.nextInt(rangeNumber));
                    setNumberTwo(randomNumber.nextInt(rangeNumber));
                    result = getNumberOne() - getNumberTwo();
                    System.out.print("\nHow much is " + getNumberOne() + " - " + getNumberTwo() + "?" + "->");
                    inputInt(input, result);

                }
                break;
            }
            case 3 : {

                for(int i = 0; i < numberQuestion; i++) {

                    setNumberOne(randomNumber.nextInt(rangeNumber));
                    setNumberTwo(randomNumber.nextInt(rangeNumber));
                    result = getNumberOne() * getNumberTwo();
                    System.out.print("\nHow much is " + getNumberOne() + " x " + getNumberTwo() + "?" + "->");
                    inputInt(input, result);

                }
                break;
            }
            case 4 : {
                for(int i = 0; i < numberQuestion; i++) {

                    setNumberOne(randomNumber.nextInt(rangeNumber));
                    setNumberTwo(randomNumber.nextInt(rangeNumber));
                    result = getNumberOne() / getNumberTwo();
                    System.out.print("\nHow much is " + getNumberOne() + " : " + getNumberTwo() + "?" + "->");
                    inputInt(input, result);

                }
                break;
            }
            case 5 : {
                for(int i = 0; i < numberQuestion; i++) {

                    int randomQuestion;

                    randomQuestion = randomNumber.nextInt(4);
                    setNumberOne(randomNumber.nextInt(rangeNumber));
                    setNumberTwo(randomNumber.nextInt(rangeNumber));

                    switch (randomQuestion) {
                        case 0 : {

                            result = getNumberOne() + getNumberTwo();
                            System.out.print("\nHow much is " + getNumberOne() + " + " + getNumberTwo() + "?" + "->");
                            break;

                        }
                        case 1 : {

                            result = getNumberOne() - getNumberTwo();
                            System.out.print("\nHow much is " + getNumberOne() + " - " + getNumberTwo() + "?" + "->");
                            break;

                        }
                        case 2 : {

                            result = getNumberOne() * getNumberTwo();
                            System.out.print("\nHow much is " + getNumberOne() + " x " + getNumberTwo() + "?" + "->");
                            break;

                        }
                        case 3 : {

                            result = getNumberOne() / getNumberTwo();
                            System.out.print("\nHow much is " + getNumberOne() + " : " + getNumberTwo() + "?" + "->");
                            break;

                        }
                        default: {
                            break;
                        }
                    }
                    inputInt(input, result);
                }
                break;
            }
            default:{
                break;
            }
        }
    }

    private void inputInt(Scanner input, int result) {

        int answerUser;

        Status answerStatus;
        answerUser = input.nextInt();

        if (answerUser == result) {

            answerStatus = Status.CORRECT;
            message(answerStatus);
            numberTryCorrect++;

        } else {

            answerStatus = Status.INCORRECT;
            message(answerStatus);
            numberTryIncorrect++;

        }
    }

    private void message(Status answerStatus) {

        int randomMessage;

        if(answerStatus == Status.CORRECT) {

            randomMessage = 1 + randomNumber.nextInt(4);

            switch (randomMessage) {
                case 1: {

                    System.out.println("Molto bene!");
                    break;

                }
                case 2: {

                    System.out.println("Eccellente!");
                    break;

                }
                case 3: {

                    System.out.println("Ben fatto!");
                    break;

                }
                case 4: {

                    System.out.println("Continua così!");
                    break;

                }
                default: {
                    break;
                }
            }
        } else {

            randomMessage = 1 + randomNumber.nextInt(4);

            switch (randomMessage) {
                case 1 : {

                    System.out.println("No, riprova.");
                    break;

                }
                case 2 : {

                    System.out.println("Risposta sbagliata, prova ancora una volta.");
                    break;

                }
                case 3 : {

                    System.out.println("Non mollare!");
                    break;

                }
                case 4 : {

                    System.out.println("No, continua a provarci.");
                    break;

                }
                default:{
                    break;
                }
            }
        }
    }

    public int getPercentage() {
        return (((getNumberTryCorrect())*100)/numberQuestion);
    }

    public CheckLevel exerciseQuestion(Scanner input, int inputType, int inputDifficult) {

        CheckLevel checkLevel;

        getAnswer(input, inputType, inputDifficult);

        if(getPercentage() < 75) {

            System.out.println("Chiedi aiuto al tuo insegnante!");
            checkLevel = CheckLevel.STAY;

        } else {

            System.out.println("Congratulazioni, sei pronto per passare al livello successivo!");
            checkLevel = CheckLevel.UP;

        }

        return checkLevel;
    }

    public int questionDifficult(int inputDifficult) {

        int difficult = 1;

        for(int i = 0; i < inputDifficult; i++) {

            difficult *= 10;

        }

        System.out.println("difficult: " + difficult);

        return difficult;
    }

    public void programLearn(int inputUser, Scanner input) {

        CheckLevel check;
        int inputType;
        int difficult;

        switch (inputUser) {
            case 1: {

                System.out.println("-------MENU-------");
                System.out.println("1 = Addizione");
                System.out.println("2 = Sottrazione");
                System.out.println("3 = Moltiplicazione");
                System.out.println("4 = Divisione");
                System.out.println("5 = MIX");
                System.out.print("-> ");
                inputType = input.nextInt();
                System.out.println("-------MENU-------");
                System.out.println("Scelta difficoltà: ");
                System.out.println("1 = una cifra");
                System.out.println("2 = due cifre");
                System.out.println("3 = tre cifre");
                System.out.println("4 = quattro cifre");
                System.out.print("-> ");
                difficult = input.nextInt();
                check = exerciseQuestion(input, inputType, difficult);
                System.out.println("Correct answer: " + getPercentage() + "%");
                //System.out.println("Correct answer: " + getNumberTryCorrect() + "\n" + "Incorrect answer: " + getNumberTryIncorrect());

                if(check == ProgramLearnMultiplication.CheckLevel.UP) {
                    System.out.println("LEVEL UP");
                }
                setNumberTryCorrect(0);
                break;
            }
            case 0 : {

                System.out.println("---- EXIT PROGRAM ----");
                break;

            }
            default: {

                break;

            }
        }
    }
}
