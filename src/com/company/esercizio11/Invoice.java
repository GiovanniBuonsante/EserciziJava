/*3.12 (Classe Invoice) Scrivete una classe Invoice che un negozio di componenti elettro-
        nici potrebbe usare per fatturare le merci vendute. Una fattura dovrebbe includere quattro tipi
        di informazioni sotto forma di variabili di istanza: il codice dell’articolo (tipo String), una
        descrizione (tipo String), la quantità acquistata (tipo int) e il prezzo unitario (tipo double).
        La classe dovrà avere un costruttore che inizializzi nel modo appropriato le quattro variabili di
        istanza. Fornite metodi get e set per ogni variabile di istanza. Fornite inoltre un metodo getIn-
        voiceAmount che calcola il totale fatturato (ovvero moltiplica il prezzo unitario per la quantità*/
package com.company.esercizio11;

public class Invoice {
    private String codProduct;
    private String description;
    private Integer quantityBought;
    private Double priceUnitary;


    //Costruttori di istanza
    public Invoice(String codProduct, String description, Integer quantityBought, Double priceUnitary){
        this.codProduct = codProduct;
        this.description = description;
        this.quantityBought = quantityBought;
        this.priceUnitary = priceUnitary;
    }
    //Setter
    public void setCodProduct(String codProduct){
        this.codProduct = codProduct;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setQuantityBought(Integer quantityBought){
        this.quantityBought = quantityBought;
    }
    public void setPriceUnitary(Double priceUnitary){
        this.priceUnitary = priceUnitary;
    }

    //Getter
    public String getCodProduct(){
        return codProduct;
    }
    public String getDescription(){
        return description;
    }
    public Integer getQuantityBought(){
        return quantityBought;
    }
    public Double getPriceUnitary(){
        return priceUnitary;
    }

    //creazione metodo per calcolare totale fattura
    public Double getInvoiceAmount(Integer quantityBought, Double priceUnitary){
        double totalInvoice;
        if(quantityBought < 0 ){
            return totalInvoice = 0;
        }
        if(priceUnitary < 0){
            priceUnitary = 0.0;
        }
        totalInvoice = quantityBought*priceUnitary;
        return totalInvoice;
    }
}
