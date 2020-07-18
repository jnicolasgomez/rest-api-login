package com.demo.tyba.login.models;

import java.util.Date;

public class Transaction {
    private Float amount;
    private String name;
    private Date date;

    public Date getDate() {
        return date;
    }

    public Transaction(Float amount, String name, Date date) {
        this.amount = amount;
        this.name = name;
        this.date = date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Transaction() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }
}
