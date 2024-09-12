package edu.misena.senaviewer.model;

public class Film {
    protected int id;
    protected String title;
    protected String genre;
    protected String creator;
    protected int duration;
    protected int year;
    protected boolean viewed;

    //Constructor
    public Film (String title, String genre , String creator, int duration){
        this.title = title;
        this.genre = genre;
        this.creator = creator;
        this.duration = duration;
    }

    //Getters y Setters
    public int getId(int id){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getTitle(String title){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getGenre(String genre){
        return genre;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public String getCreator(String creator){
        return creator;
    }

    public void setCreator(String creator){
        this.creator = creator;
    }

    public int getDuration(int duration) {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getYear(int year) {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean getViewed(boolean viewed) {
        return viewed;
    }

    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }

    //toString
    @Override
    public String toString() {
        return "Title: " + title +
                "\nGenre: " + genre +
                "\nCreator: " + creator +
                "\nDuration: " + duration +
                " mins\nYear: " + year;
    }
}

