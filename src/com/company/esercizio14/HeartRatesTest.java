package com.company.esercizio14;

import com.company.esercizio12.Employee;

import java.util.Scanner;

public class HeartRatesTest {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);

        HeartRates heartRates = new HeartRates("", "", 0, 0, 0);

        System.out.println("Enter name: ");
        String name = input.next();
        heartRates.setName(name);
        System.out.println("Enter surname: ");
        String surname = input.next();
        heartRates.setSurname(surname);
        System.out.println("Enter Day: ");
        int day = input.nextInt();
        heartRates.setDay(day);
        System.out.println("Enter month: ");
        int month = input.nextInt();
        heartRates.setMonth(month);
        System.out.println("Enter year: ");
        int year = input.nextInt();
        heartRates.setYear(year);

        //HeartRates heartRates = new HeartRates(name,surname,day,month,year);

        //int age = heartRates.calculateAge();

        double maxHeartsFrequency = heartRates.calculateMaxHeartsFrequency(heartRates.calculateAge());

        //heartRates.calculateIdealHeartsFrequency(maxHeartsFrequency);

        System.out.println("Name: " + heartRates.getName() + "\nSurname: " + heartRates.getSurname() +"\n" + heartRates.getDay() + "/" + heartRates.getMonth() +
                "/" + heartRates.getYear() + "\nAge: " + heartRates.calculateAge() + "\nMax hearts frequency: " + maxHeartsFrequency + "\nIdeal hearts frequency: " + heartRates.calculateIdealHeartsFrequency(maxHeartsFrequency));

    }
}
