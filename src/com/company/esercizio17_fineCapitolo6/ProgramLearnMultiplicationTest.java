package com.company.esercizio17_fineCapitolo6;
import com.company.esercizio17_fineCapitolo6.ProgramLearnMultiplication;

import java.util.Scanner;

public class ProgramLearnMultiplicationTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ProgramLearnMultiplication programLearnMultiplication = new ProgramLearnMultiplication();
        int inputUser;
        do {
            System.out.println("---------MENU---------");
            System.out.println("1 = Start the exercise");
            System.out.println("0 = Exit");
            System.out.print("-> ");
            inputUser = input.nextInt();
            System.out.println();
            programLearnMultiplication.programLearn(inputUser, input);
        } while (inputUser != 0);
        input.close();
    }
}