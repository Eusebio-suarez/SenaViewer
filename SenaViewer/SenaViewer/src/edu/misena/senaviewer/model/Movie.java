package edu.misena.senaviewer.model;

public class Movie extends Film{
    private int timeViewed;

    // Constructor
    public Movie(String title, String genre, String creator, int duration, int year) {
        super(title,genre,creator, duration);
        this.title = title;
        this.genre = genre;
        this.creator = creator;
        this.duration = duration;
        this.year = year;
    }

    //Getters y Setters
    public int getTimeViewed() {
        return timeViewed;
    }
    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    //toString
    public String toString(){
        return super.toString() + "\nTimeviewer" + timeViewed;
    }
}

