package edu.misena.senaviewer.model;

import java.util.Date;

public class Book extends Publication{
    private String isbn;
    private boolean readed;
    private int timeReaded;

    // Constructor
    public Book(String title, Date edititionDate, String editorial, String isbn) {
        super(title, edititionDate, editorial);
        this.title = title;
        this.edititionDate = edititionDate;
        this.editorial = editorial;
        this.isbn = isbn;
    }

    // Getters y Setters para cada campo
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isReaded() {
        return readed;
    }
    public void setReaded(boolean readed) {
        this.readed = readed;
    }

    public int getTimeReaded() {
        return timeReaded;
    }
    public void setTimeReaded(int timeReaded) {
        this.timeReaded = timeReaded;
    }

    //toString
    public String toString(){
        return super.toString() + "\nIsbn" + isbn;
    }
}

