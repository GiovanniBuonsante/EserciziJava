package com.company.esercizio10;

public class Account {
    private String name;
    private Double balance;

    public Account (String name, Double balance){
        this.name = name;
        if(balance > 0){
            this.balance = balance;
        }
    }

    public Account() {

    }

    public void setName(String name){
        this.name = name;
    }
    public void setBalance(Double balance){
        this.balance = balance;
    }
    public String getName() {
        return name;
    }
    public Double getBalance(){
        return balance;
    }
    public void deposit(Double depositAmount){
        if(depositAmount > 0.0){
            balance = balance + depositAmount;
        }
    }
}
