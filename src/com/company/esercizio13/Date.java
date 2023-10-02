package com.company.esercizio13;

import java.util.Scanner;

public class Date {
    private Integer day;
    private Integer month;
    private Integer year;

    public Date (Integer day, Integer month, Integer year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public void setDay(Integer day){
        this.day = day;
    }
    public void setMonth(Integer month){
        this.month = month;
    }
    public void setYear(Integer year){
        this.year = year;
    }
    public Integer getDay(){
        return day;
    }
    public Integer getMonth(){
        return month;
    }
    public Integer getYear(){
        return year;
    }
    public void displayDate (){
        System.out.printf("Date: %d/%d/%d\n", day, month, year);
    }
    public static void inputDataDate (Date dateInsert){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter one date dd/MM/yyyy : ");
        int day = input.nextInt();
        dateInsert.setDay(day);
        int month = input.nextInt();
        dateInsert.setMonth(month);
        int year = input.nextInt();
        dateInsert.setYear(year);
        input.close();
    }
}
