package com.DavidOrtega.Practica1C.domain.entity;

public class Book {

    private int id;
    private String tittle, author;

    public Book(int id, String tittle, String author) {
        this.id = id;
        this.tittle = tittle;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getTittle() {
        return tittle;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", tittle='" + tittle + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
