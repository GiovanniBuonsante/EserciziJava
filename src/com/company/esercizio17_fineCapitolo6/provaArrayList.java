package com.company.esercizio17_fineCapitolo6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class provaArrayList {
    public static void main(String[] args) {
        int inputNumber;
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> numbersNot = new ArrayList<>();
        System.out.println("Enter number: ");
        for(int i = 0; i < 5; i++) {
            inputNumber = input.nextInt();
            numbers.add(inputNumber);
        }
        System.out.println("Enter number you don't want: ");
        for(int i = 0; i < 5; i++) {
            inputNumber = input.nextInt();
            numbersNot.add(inputNumber);
        }
        for (int number : numbers) {
            System.out.println("number: " + number);
        }
        for (int number : numbersNot) {
            System.out.println("number not: " + number);
        }
        System.out.println("size: " + numbers.size());
        System.out.println("size: " + numbersNot.size());


        //elimina valore indice 3
        int remove = 3;
        //numbers.remove(remove);

        numbers.removeAll(numbersNot);

        //elimina numero 5 dalla lista
        //numbers.removeIf(number -> number == 5);

        //controlla se il numero 5 sta nella lista
        boolean check;
        check = numbers.contains(5);
        if(check) {
            System.out.println("the number 5 is in the list");
        }
        for (int number : numbers) {
            System.out.println("number: " + number);
        }
        System.out.println("size: " + numbers.size());
        System.out.println("size: " + numbersNot.size());
    }
}
