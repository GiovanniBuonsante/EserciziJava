/*3.16 (Calcolatore della frequenza cardiaca ideale) Quando fate attività fisica, potete utiliz-
        zare un cardiofrequenzimetro per verificare che la vostra frequenza cardiaca rimanga entro un

        intervallo sicuro suggerito dai vostri allenatori e medici. Secondo l’American Heart Association
        (AHA; http://bit.ly/TargetHeartRates), la formula per calcolare la frequenza cardiaca
        massima in battiti al minuto è 220 meno la vostra età in anni. La frequenza cardiaca ideale è un
        intervallo compreso tra il 50 e l’85% della vostra frequenza cardiaca massima. [Nota: queste
        formule sono stime fornite dall’AHA. La frequenza cardiaca massima e quella ideale possono

        variare in base alla salute, alla forma fisica e al sesso dell’individuo. Consultate sempre un me-
        dico o un operatore sanitario qualificato prima di iniziare o modificare un programma di

        allenamento.] Create una classe chiamata HeartRates. Gli attributi della classe dovrebbero in-
        cludere nome, cognome e data di nascita (composta da attributi separati per mese, giorno e anno

        di nascita) della persona. La vostra classe dovrebbe avere un costruttore che riceve questi dati
        come parametri. Per ogni attributo fornite metodi set e get. La classe dovrebbe inoltre includere

        un metodo che calcola e restituisce l’età della persona (in anni), un metodo che calcola e resti-
        tuisce la sua frequenza cardiaca massima e un metodo che calcola e restituisce la sua frequenza

        cardiaca ideale. Scrivete un’applicazione Java che richiede le informazioni sulla persona, istanzia
        un oggetto della classe HeartRates e stampa le informazioni di quell’oggetto (inclusi nome,
        cognome e data di nascita), quindi calcola e stampa l’età della persona (in anni), la frequenza
        cardiaca massima e l’intervallo relativo alla frequenza cardiaca ideale.

 */

package com.company.esercizio14;

public class HeartRates {
    private String name;
    private String surname;
    private Integer day;
    private Integer month;
    private Integer year;

    //costruttore
    public HeartRates(String name, String surname, Integer day, Integer month, Integer year){
        this.name = name;
        this.surname = surname;
        this.day = day;
        this.month = month;
        this.year = year;
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
    public Integer calculateAge(){
        return 2023 - year;
    }
    public Integer calculateMaxHeartsFrequency(Integer age){
        return 220-age;
    }
    public String calculateIdealHeartsFrequency(Double maxHeartsFrequency){
        return (maxHeartsFrequency*50/100) + "-" + (maxHeartsFrequency*85/100);
    }

}
