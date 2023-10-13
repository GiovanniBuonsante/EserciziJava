package com.company.auto;

// Classe Ruote
public class Ruote {
    private String produttore;
    private String modello;

    public Ruote(String produttore, String modello) {
        this.produttore = produttore;
        this.modello = modello;
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
    // Getter per ottenere informazioni sulle ruote
}
