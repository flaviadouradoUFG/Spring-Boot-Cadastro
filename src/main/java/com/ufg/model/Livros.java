package com.ufg.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Livros implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long book_id;

    @Column
    private String title;

    @Column
    private String author;

    public Livros() {
    }

    //Constructors
    public Livros(long id, String title, String author) {
        this.book_id = id;
        this.title = title;
        this.author=author;
    }

    //Getters and Setters
    public long getId() {
        return book_id;
    }

    public void setId(long id) {
        this.book_id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    //ToString
    @Override
    public String toString() {
        return "Book{" +
                "book_id=" + book_id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
