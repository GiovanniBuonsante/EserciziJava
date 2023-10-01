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
