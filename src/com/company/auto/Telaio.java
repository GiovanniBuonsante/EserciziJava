package com.company.auto;

// Classe Telaio
public class Telaio {
    private String produttore;
    private String modello;
    private String numero;

    public Telaio(String produttore, String modello, String numero) {
        this.produttore = produttore;
        this.modello = modello;
        this.numero = numero;
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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    // Getter per ottenere informazioni sul telaio
}
