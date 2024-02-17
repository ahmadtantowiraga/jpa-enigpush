package com.enigma.jpa_enigpus.entity;

public class Magazine {
    private Integer id;
    private String title;
    private Integer year;
    private PeriodType period;

    public Magazine(Integer id, String title, Integer year, PeriodType period) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.period = period;
    }

    public Magazine() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public PeriodType getPeriod() {
        return period;
    }

    public void setPeriod(PeriodType period) {
        this.period = period;
    }
}
