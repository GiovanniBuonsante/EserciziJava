package com.company.esercizio10;

import com.company.esercizio10.Account;
import java.util.Scanner;

public class accountTest {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        String theName;
        double theBalance;
        double depositAmount;
        // crea un oggetto Account e lo assegna a myAccount
        Account myAccount = new Account("Giovanni Buonsante",67673.00);
        Account mySecondAccount = new Account("Rebecca Denigris", 66637.00);

        // Visualizza il valore iniziale di name
        System.out.printf("Initial name is: %s%n%n", myAccount.getName());


        /*
        // chiede e legge il nome
        System.out.println("Please enter the name:");
        theName = input.nextLine(); // legge una riga di testo
        myAccount.setName(theName); // pone theName in myAccount

        // chiede e legge il nome
        System.out.println("Please enter the name:");
        theName = input.nextLine(); // legge una riga di testo
        mySecondAccount.setName(theName); // pone theName in myAccount
        myAccount.setBalance(theBalance = 4000);
        mySecondAccount.setBalance(theBalance = 40004);
*/
        // stampa una riga vuota
        System.out.println();

        // visualizza il nome memorizzato nell'oggetto myAccount
        System.out.printf("Name in object myAccount is:%n%s%n", myAccount.getName());
        System.out.printf("name: %s\nBalance: %.2f\n" ,mySecondAccount.getName(), mySecondAccount.getBalance());
        System.out.printf("name: %s\nBalance: %.2f\n" ,myAccount.getName(), myAccount.getBalance());
        theName = "ciaociao".replace("ciao","wow");
        myAccount.setName(theName);
        System.out.printf("name: %s\nBalance: %.2f\n" ,myAccount.getName(), myAccount.getBalance());
        System.out.println("fffffff " + myAccount);
        System.out.println("fffffff " + myAccount);
        System.out.println("Enter a deposit for the myaccount1: ");
        depositAmount = input.nextDouble();
        myAccount.deposit(depositAmount);
        System.out.println("Enter a deposit for the myaccount2: ");
        depositAmount = input.nextDouble();
        mySecondAccount.deposit(depositAmount);
        System.out.println("\n");
        System.out.printf("%s --- balance: %.2f€", myAccount.getName(), myAccount.getBalance());
        System.out.printf("%s --- balance: %.2f€", mySecondAccount.getName(), mySecondAccount.getBalance());
    }
}
