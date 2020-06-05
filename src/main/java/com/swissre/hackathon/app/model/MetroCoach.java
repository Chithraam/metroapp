package com.swissre.hackathon.app.model;

public class MetroCoach {

    private String metroId;
    private String coachId;
    private String coachNo;
    private int capacity;
    private int freeSeats;

    public MetroCoach(String metroId, String coachId, String coachNo, int capacity, int freeSeats) {
        this.metroId = metroId;
        this.coachId = coachId;
        this.coachNo = coachNo;
        this.capacity = capacity;
        this.freeSeats = freeSeats;
    }

    public String getMetroId() {
        return metroId;
    }

    public void setMetroId(String metroId) {
        this.metroId = metroId;
    }

    public String getCoachId() {
        return coachId;
    }

    public void setCoachId(String coachId) {
        this.coachId = coachId;
    }

    public String getCoachNo() {
        return coachNo;
    }

    public void setCoachNo(String coachNo) {
        this.coachNo = coachNo;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getFreeSeats() {
        return freeSeats;
    }

    public void setFreeSeats(int freeSeats) {
        this.freeSeats = freeSeats;
    }
}
