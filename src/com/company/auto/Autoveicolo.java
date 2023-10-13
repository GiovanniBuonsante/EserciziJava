package com.company.auto;

import java.util.List;

public class Autoveicolo {
    private String targa;
    private Motore motore;
    private Telaio telaio;
    private List<Ruote> ruote;

    public Autoveicolo(String targa, Motore motore, Telaio telaio, List<Ruote> ruote) {
        this.targa = targa;
        this.motore = motore;
        this.telaio = telaio;
        this.ruote = ruote;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public Motore getMotore() {
        return motore;
    }

    public void setMotore(Motore motore) {
        this.motore = motore;
    }

    public Telaio getTelaio() {
        return telaio;
    }

    public void setTelaio(Telaio telaio) {
        this.telaio = telaio;
    }

    public List<Ruote> getRuote() {
        return ruote;
    }

    public void setRuote(List<Ruote> ruote) {
        this.ruote = ruote;
    }

    // Getter per ottenere informazioni sull'autoveicolo
}

