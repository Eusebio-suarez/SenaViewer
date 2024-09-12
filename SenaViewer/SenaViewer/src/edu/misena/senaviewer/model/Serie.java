package edu.misena.senaviewer.model;

public class Serie extends Film{
    private int timeViewed;
    private int sessionQuantity;

    // Constructor
    public Serie(String title,String genre,String creator,int duration) {
        super(title,genre,creator,duration);
        this.title = title;
        this.genre = genre;
        this.creator = creator;
        this.duration = duration;
    }

    // Getters y Setters

    public int getTimeViewed() {
        return timeViewed;
    }
    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    public int getSessionQuantity() {
        return sessionQuantity;
    }
    public void setSessionQuantity(int sessionQuantity) {
        this.sessionQuantity = sessionQuantity;
    }

    //toString
    public String toString(){
        return super.toString() +
                "\nTimeviewer" + timeViewed +
                "\nSessionQuantity" + sessionQuantity;
    }
}

