package com.company.esercizio13;

import com.company.esercizio13.Date;
public class DateTest {
    public static void main (String[] args){
        Date date = new Date(26, 7,2023);
        Date date1 = new Date(10,2,2023);
        Date.displayDate(date.getDay(),date.getMonth(), date.getYear());
        Date.displayDate(date1.getDay(), date1.getMonth(), date1.getYear());
    }
}
