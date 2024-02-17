package com.enigma.jpa_enigpus.entity;

public class Novel {
    private Integer id;
    private  String author;
    private String title;
    private Integer year;
    private String publisher;

    public Novel(Integer id, String author, String title, Integer year, String publisher) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.year = year;
        this.publisher = publisher;
    }

    public Novel() {
    }

    public Integer getId() {
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

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
