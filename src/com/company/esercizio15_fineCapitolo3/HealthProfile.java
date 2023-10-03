/*Una questione relativa all’assisten-
        za sanitaria di cui si è parlato molto negli ultimi tempi è l’informatizzazione della documentazio-
        ne sanitaria. Questa possibilità viene affrontata con cautela anche a causa delle preoccupazioni

        relative a privacy e sicurezza. [Affronteremo queste problematiche in esercizi successivi.] L’in-
        formatizzazione della documentazione sanitaria potrebbe semplificare ai pazienti la condivisione

        con i vari professionisti sanitari delle informazioni relative al loro profilo sanitario e alla loro

        anamnesi. Ciò potrebbe migliorare la qualità dell’assistenza sanitaria, aiutare a evitare sia intera-
        zioni dannose tra medicinali diversi sia prescrizioni sbagliate, ridurre i costi e salvare vite nelle

        emergenze. In questo esercizio, progetterete una classe HealthProfile per una persona. Gli
        attributi della classe dovrebbero includere nome, cognome, data di nascita (composta da attributi
        separati per mese, giorno e anno di nascita), altezza in metri e peso in chilogrammi. La vostra
        classe dovrebbe avere un costruttore che riceve questi dati. Per ogni attributo, fornite metodi set
        e get. La classe dovrebbe inoltre includere metodi che calcolano e restituiscono l’età dell’utente
        in anni, la frequenza cardiaca massima e l’intervallo di frequenza cardiaca ideale (vedi Esercizio
        3.16) e l’indice di massa corporea (BMI; vedi Esercizio 2.33). Scrivete un’applicazione Java
        che richiede le informazioni sulla persona, istanzia un oggetto della classe HealthProfile per
        quella persona e stampa le informazioni di quell’oggetto (inclusi nome, cognome, sesso, data di
        nascita, altezza e peso), quindi calcola e stampa età in anni, BMI, frequenza cardiaca massima e

        intervallo di frequenza cardiaca ideale, visualizzando anche la tabella dei valori del BMI dell’E-
        sercizio 2.33.
 */
package com.company.esercizio15_fineCapitolo3;

import java.util.Scanner;

public class HealthProfile {
    private String name;
    private String surname;
    private Integer day;
    private Integer month;
    private Integer year;
    private Double height;
    private Double weight;

    //costruttore
    public HealthProfile(String name, String surname, Integer day, Integer month, Integer year, Double height, Double weight){
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
    public void setYear(Integer year){
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
    public Integer getYear(){
        return year;
    }
    public Double getHeight(){
        return height;
    }
    public Double getWeight(){
        return weight;
    }
    public Integer calculateAge(){
        return 2023 - year;
    }
    public Integer calculateMaxHeartsFrequency(Integer age){
        return 220-age;
    }
    public String calculateIdealHeartsFrequency(Integer maxHeartsFrequency){
        return (maxHeartsFrequency*50/100) + "-" + (maxHeartsFrequency*85/100);
    }
    public Integer calculateBmi(){
        return (int)(weight/(height*height));
    }
    @Override
    public String toString(){
        return "-------------------" + "\nName: " + name + "\nSurname: " + surname +"\n" + day + "/" + month +
                "/" + year + "\nAge: " + calculateAge() + "\nMax hearts frequency: " + calculateMaxHeartsFrequency(calculateAge()) + "\nIdeal hearts frequency: " + calculateIdealHeartsFrequency(calculateMaxHeartsFrequency(calculateAge()))
                + "\nBMI: " + calculateBmi() + "\n-------------------";
    }
    public void inputHealthProfile(HealthProfile healthProfile, Scanner input){
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
        System.out.println("Enter year: ");
        year = input.nextInt();
        healthProfile.setYear(year);
        System.out.println("Enter height: ");
        height = input.nextDouble();
        healthProfile.setHeight(height);
        System.out.println("Enter weight: ");
        weight = input.nextDouble();
        healthProfile.setWeight(weight);
    }
}
