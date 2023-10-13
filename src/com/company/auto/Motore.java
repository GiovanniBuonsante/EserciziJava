package com.company.auto;

// Classe Motore
public class Motore {
    private String produttore;
    private String modello;
    private double cilindrata;
    private String alimentazione;

    public Motore(String produttore, String modello, double cilindrata, String alimentazione) {
        this.produttore = produttore;
        this.modello = modello;
        this.cilindrata = cilindrata;
        this.alimentazione = alimentazione;
    }

    public String getProduttore() {
        return produttore;
    }

    public void setProduttore(String produttore) {
        this.produttore = produttore;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public double getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(double cilindrata) {
        this.cilindrata = cilindrata;
    }

    public String getAlimentazione() {
        return alimentazione;
    }

    public void setAlimentazione(String alimentazione) {
        this.alimentazione = alimentazione;
    }

    // Getter per ottenere informazioni sul motore
}

