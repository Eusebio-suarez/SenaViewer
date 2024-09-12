package edu.misena.senaviewer.model;

import java.util.Date;

public class Magazine  extends Publication{
    private int id;

    // Constructor
    public Magazine(String title, Date edititionDate, String editorial) {
        super(title,edititionDate,editorial);
        this.title = title;
        this.edititionDate = edititionDate;
        this.editorial = editorial;
    }

    // Getters y Setters para cada campo
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    //toString se hereda de la clase padre
}

