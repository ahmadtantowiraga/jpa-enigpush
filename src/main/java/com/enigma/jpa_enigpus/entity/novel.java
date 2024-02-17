package com.enigma.jpa_enigpus.entity;

public class novel {
    private int id;
    private  String author;
    private String title;
    private int year;
    private String publiser;

    public novel(int id, String author, String title, int year, String publiser) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.year = year;
        this.publiser = publiser;
    }

    public novel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPubliser() {
        return publiser;
    }

    public void setPubliser(String publiser) {
        this.publiser = publiser;
    }
}
