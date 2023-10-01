package com.company.esercizio11;

public class invoiceTest {
    public static void main(String[] args){
        double invoiceAmount;
        Invoice invoice1 = new Invoice("FG089","computer",23,1230.00);
        Invoice invoice2 = new Invoice("GH789", "cuffie",23, 49.99);
        invoiceAmount = invoice1.getInvoiceAmount(invoice1.getQuantityBought(), invoice1.getPriceUnitary());
        System.out.println("Total invoice: " + invoiceAmount);
        invoiceAmount = invoice1.getInvoiceAmount(invoice2.getQuantityBought(), invoice2.getPriceUnitary());
        System.out.println("Total invoice: " + invoiceAmount);
    }
}
