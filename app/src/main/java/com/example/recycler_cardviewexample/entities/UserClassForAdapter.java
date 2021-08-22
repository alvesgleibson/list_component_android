package com.example.recycler_cardviewexample.entities;

import java.util.Date;

public class UserClassForAdapter {

    private String name, obs;
    private Date dateContact;


    public UserClassForAdapter() {
    }

    public UserClassForAdapter(String name, String obs, Date dateContact) {
        this.name = name;
        this.obs = obs;
        this.dateContact = dateContact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Date getDateContact() {
        return dateContact;
    }

    public void setDateContact(Date dateContact) {
        this.dateContact = dateContact;
    }
}
