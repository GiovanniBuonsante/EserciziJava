package com.company.esercizio13;

import com.company.esercizio13.Date;

import java.util.Scanner;

public class DateTest {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        Date date = new Date(26, 7,2023);
        Date date1 = new Date(10,2,2023);
        Date date2 = new Date(0,0,0);
        Date.displayDate(date.getDay(),date.getMonth(), date.getYear());
        Date.displayDate(date1.getDay(), date1.getMonth(), date1.getYear());
        System.out.println("Enter one date dd/MM/yyyy : ");
        int day = input.nextInt();
        date2.setDay(day);
        int month = input.nextInt();
        date2.setMonth(month);
        int year = input.nextInt();
        date2.setYear(year);
        Date.displayDate(date2.getDay(), date2.getMonth(), date2.getYear());

    }
}
