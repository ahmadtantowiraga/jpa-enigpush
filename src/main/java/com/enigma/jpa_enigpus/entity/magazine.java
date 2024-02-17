package com.enigma.jpa_enigpus.entity;

public class magazine {
    private int id;
    private String title;
    private int year;
    private PeriodType period;

    public magazine(int id, String title, int year, PeriodType period) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.period = period;
    }

    public magazine() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public PeriodType getPeriod() {
        return period;
    }

    public void setPeriod(PeriodType period) {
        this.period = period;
    }
}
