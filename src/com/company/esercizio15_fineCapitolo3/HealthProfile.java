package com.company.esercizio15_fineCapitolo3;

import java.util.Scanner;

public class HealthProfile {
    private String name;
    private String surname;
    private Integer day;
    private Integer month;
    private Double year;
    private Double height;
    private Double weight;

    //costruttore
    public HealthProfile(String name, String surname, Integer day, Integer month, Double year, Double height, Double weight){
        this.name = name;
        this.surname = surname;
        this.day = day;
        this.month = month;
        this.year = year;
        this.height = height;
        this.weight = weight;
    }
    //setter
    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setDay(Integer day){
        this.day = day;
    }
    public void setMonth(Integer month){
        this.month = month;
    }
    public void setYear(Double year){
        this.year = year;
    }
    public void setHeight(Double height){
        this.height = height;
    }
    public void setWeight(Double weight){
        this.weight = weight;
    }

    //GETTER
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public Integer getDay(){
        return day;
    }
    public Integer getMonth(){
        return month;
    }
    public Double getYear(){
        return year;
    }
    public Double getHeight(){
        return height;
    }
    public Double getWeight(){
        return weight;
    }
    public Double calculateAge(){
        return 2023 - year;
    }
    public Double calculateMaxHeartsFrequency(Double age){
        return 220-age;
    }
    public String calculateIdealHeartsFrequency(Double maxHeartsFrequency){
        return (maxHeartsFrequency*50/100) + "-" + (maxHeartsFrequency*85/100);
    }
    public Double calculateBmi(){
        return weight/(height*height);
    }
    @Override
    public String toString(){
        return "Name: " + name + "\nSurname: " + surname +"\n" + day + "/" + month +
                "/" + year + "\nAge: " + calculateAge() + "\nMax hearts frequency: " + calculateMaxHeartsFrequency(calculateAge()) + "\nIdeal hearts frequency: " + calculateIdealHeartsFrequency(calculateMaxHeartsFrequency(calculateAge()))
                + "\nBMI: " + calculateBmi();
    }
    public void inputHealthProfile(HealthProfile healthProfile, Scanner input){
        System.out.println("Enter name: ");
        name = input.next();
        healthProfile.setName(name);
        System.out.println("Enter surname: ");
        surname = input.next();
        healthProfile.setSurname(surname);
        System.out.println("Enter Day: ");
        day = input.nextInt();
        healthProfile.setDay(day);
        System.out.println("Enter month: ");
        month = input.nextInt();
        healthProfile.setMonth(month);
        System.out.println("Enter year: ");
        year = input.nextDouble();
        healthProfile.setYear(year);
        System.out.println("Enter height: ");
        height = input.nextDouble();
        healthProfile.setHeight(height);
        System.out.println("Enter weight: ");
        weight = input.nextDouble();
        healthProfile.setWeight(weight);
    }
}
