package com.company.auto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Autoveicolo> autoveicoli = new ArrayList<>();
        Set<String> targheUniche = new HashSet<>();

        for (int i = 0; i < 2; i++) {
            System.out.println("Inserisci i dati per l'autoveicolo " + (i + 1));
            System.out.print("Targa: ");
            String targa = scanner.next();

            // Verifica se la targa è già stata inserita
            if (targheUniche.contains(targa)) {
                System.out.println("Targa già inserita. Inserisci un'altra targa.");
                i--;
                continue;
            }

            // Inserimento dati per il Motore, Telaio e Ruote
            // Nota: In questo esempio, per semplicità, assumiamo che ci siano 4 ruote con le stesse informazioni
            System.out.print("Dati del motore (produttore, modello, cilindrata, alimentazione): ");
            Motore motore = new Motore(scanner.next(), scanner.next(), scanner.nextDouble(), scanner.next());

            System.out.print("Dati del telaio (produttore, modello, numero): ");
            Telaio telaio = new Telaio(scanner.next(), scanner.next(), scanner.next());

            List<Ruote> ruote = new ArrayList<>();
            for (int j = 0; j < 1; j++) {
                System.out.print("Dati delle ruote (produttore, modello) per la ruota " + (j + 1) + ": ");
                Ruote ruota = new Ruote(scanner.next(), scanner.next());
                ruote.add(ruota);
            }

            // Creazione e inserimento dell'oggetto Autoveicolo
            Autoveicolo autoveicolo = new Autoveicolo(targa, motore, telaio, ruote);
            autoveicoli.add(autoveicolo);
            targheUniche.add(targa);
        }

        // Iterazione sul contenitore di Autoveicoli e stampa delle informazioni
        for (Autoveicolo autoveicolo : autoveicoli) {
            System.out.println("Informazioni sull'Autoveicolo:");
            System.out.println("Targa: " + autoveicolo.getTarga());
            System.out.println("Motore: " + autoveicolo.getMotore().getProduttore() + "--" +     autoveicolo.getMotore().getModello());
            System.out.println("Telaio: " + autoveicolo.getTelaio());
            System.out.println("Ruote: " + autoveicolo.getRuote());
        }
    }
}

