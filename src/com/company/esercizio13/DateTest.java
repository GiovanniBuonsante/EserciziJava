package com.company.esercizio13;

import com.company.esercizio13.Date;

import java.util.Scanner;

public class DateTest {
    public static void main (String[] args){

        //Scanner input = new Scanner(System.in);

        Date date = new Date(26, 7,2023);
        Date date1 = new Date(10,2,2023);
        Date date2 = new Date(0,0,0);

        Date.inputDataDate(date2);

        date.displayDate();
        date1.displayDate();
        date2.displayDate();

    }
}
