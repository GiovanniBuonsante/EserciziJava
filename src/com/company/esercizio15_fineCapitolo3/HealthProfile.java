package com.company.esercizio15_fineCapitolo3;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class HealthProfile {

    private String name;
    private String surname;
    private Integer day;
    private Integer month;
    private Integer year;
    private Double height;
    private Double weight;

    public HealthProfile() {

    }
    //costruttore
    public HealthProfile(String name, String surname, Integer day, Integer month, Integer year, Double height, Double weight) {
        this.name = name;
        this.surname = surname;
        this.day = day;
        this.month = month;
        this.year = year;
        this.height = height;
        this.weight = weight;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    //GETTER
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getDay() {
        return day;
    }

    public Integer getMonth() {
        return month;
    }

    public Integer getYear() {
        return year;
    }

    public Double getHeight() {  //centimetri o metri?
        return height;
    }

    public Double getWeight() {
        return weight;
    }

    public Integer getAge() {  //Sarebbe applicabile solo nel 2023
        return Calendar.getInstance().get(Calendar.YEAR) - year;
    }

    public Integer getMaxHeartsFrequency() {
        return 220 - getAge();
    }

    public String getIdealHeartsFrequency() {
        return (getMaxHeartsFrequency()* 50 / 100) + "-" + (getMaxHeartsFrequency() * 85 / 100);
    }

    public Integer getBmi() {
        return (int) (weight / (height * height));  //valido solo per le misure di altezza in cm
    }

    @Override
    public String toString() {
        return "-------------------" + "\nName: " + name + "\nSurname: " + surname + "\n" + day + "/" + month +
                "/" + year + "\nAge: " + getAge() + "\nMax hearts frequency: " + getMaxHeartsFrequency() + "\nIdeal hearts frequency: " + getIdealHeartsFrequency()
                + "\nBMI: " + getBmi() + "\n-------------------";
    }


    //Ci sta come metodo, però estrarrei il metodo di input con controllo degli errori

    public void inputHealthProfile(HealthProfile healthProfile, Scanner input) {
        //System.out.println("Enter health Profile: (name, surname, day/month/year, height, weight");
        //HealthProfile healthProfile2 = new HealthProfile(input.next(),input.next(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextDouble(),input.nextDouble());
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
        System.out.println("Enter year: ");    //specificare se devo inserire l'anno per intero, altrimenti ripetere l'inserimento, magari controllando anche che non sia in data futura, magari anche facendo il check di tutta la data (Es. 10/12/2023 non sarebbe valore accettato)
        year = input.nextInt();
        healthProfile.setYear(year);
        System.out.println("Enter height: ");   //inserire il valore in cm o m?
        height = input.nextDouble();
        healthProfile.setHeight(height);
        System.out.println("Enter weight: ");
        weight = input.nextDouble();
        healthProfile.setWeight(weight);
    }

    //Stessa cosa per double

    private int getIntFromKeyboard(Scanner input){
        return input.nextInt(); //aggiungendo try/catch per gestione eccezzioni e retry
    }

    private String getStringFromKeyboard(Scanner input){
        return input.next(); //aggiungendo try/catch per gestione eccezzioni e retry, si potrebbe anche prevedere il controllo di valori non ammessi per nome o cognome
    }
}
