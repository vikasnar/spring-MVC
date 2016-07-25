package com.sumi.controller;

import java.util.Date;

/**
 * Created by VikasN on 7/20/16.
 */
public class Author {

    private String name;

    private String email;

    private final String date = new Date().toString();

    public String getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
