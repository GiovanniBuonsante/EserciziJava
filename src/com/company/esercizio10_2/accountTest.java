package com.company.esercizio10_2;
import com.company.esercizio10.Account;
import java.util.Scanner;

public class accountTest {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        // crea un oggetto Account e lo assegna a myAccount
        Account myAccount = new Account();

        // Visualizza il valore iniziale di name
        System.out.printf("Initial name is: %s%n%n", myAccount.getName());

        // chiede e legge il nome
        System.out.println("Please enter the name:");
        String theName = input.nextLine(); // legge una riga di testo
        myAccount.setName(theName); // pone theName in myAccount

        // stampa una riga vuota
        System.out.println();

        // visualizza il nome memorizzato nell'oggetto myAccount
        System.out.printf("Name in object myAccount is:%n%s%n", myAccount.getName());
        theName = "Giovannnnnniiiii";
        myAccount.setName(theName);
        System.out.printf("name in object after modified: \n%s, %s" ,myAccount.getName(), theName);
    }
}
