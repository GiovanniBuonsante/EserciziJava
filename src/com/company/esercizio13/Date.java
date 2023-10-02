package com.company.esercizio13;

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
    public static void displayDate (Integer day, Integer month, Integer year){
        System.out.printf("Date: %d/%d/%d\n", day, month, year);
    }
}
