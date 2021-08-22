package com.example.recycler_cardviewexample.entities;

import java.util.Date;

public class CardClassForAdapter {

    private String name, endereco;
    private Date date;
    private int imageResource;


    public CardClassForAdapter(String name, String endereco, Date date, int imageResource) {
        this.name = name;
        this.endereco = endereco;
        this.date = date;
        this.imageResource = imageResource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }
}
