package com.company.capitolo4.entity;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class datetest {

    public static void main() throws ParseException {

        System.out.println("Scrivere data calendario in formato [dd/mm/yyyy]");

        Scanner tastiera = new Scanner(System.in);

        String testo;

        testo = tastiera.next();

        try {

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");;
            sdf.setLenient(false);
            Date miaData = sdf.parse(testo);

            Calendar calendario = Calendar.getInstance();

            calendario.setTime(miaData);

            int anno = calendario.get(Calendar.YEAR);
            int mese = calendario.get(Calendar.MONTH)+1;
            int giorno = calendario.get(Calendar.DAY_OF_MONTH);

            boolean bisestile = anno%400==0 || anno%4==0 && anno%100!=0;

            if(bisestile) {
                System.out.println(testo + " L'anno è bisestile");

            } else
                System.out.println(testo + " Data valida");

        } catch (Exception e) {

            System.out.println("Data inserita non valida");

        }

    }
}
