package edu.misena.senaviewer.model;

import java.util.Date;

public class Publication {
    protected String title;
    protected Date edititionDate;
    protected String editorial;
    protected String[] authors;

    public Publication(String title,Date edititionDate,String editorial){
        this.title = title;
        this.edititionDate = edititionDate;
        this.editorial = editorial;
    }

    //Getters y Setters
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public Date getEdititionDate() {
        return edititionDate;
    }
    public void setEdititionDate(Date edititionDate) {
        this.edititionDate = edititionDate;
    }

    public String getEditorial() {
        return editorial;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String[] getAuthors() {
        return authors;
    }
    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    //toString
    @Override
    public String toString() {
        return "Title: " + title +
                "\nEditionDate: " + edititionDate +
                "\nEditorial: " + editorial+
                "\nAuthors: " + authors;

    }
}
