package com.swissre.hackathon.app.model;

import javax.persistence.*;

@Table(name = "metrocoach")
@Entity
public class MetroCoach {

	@Id
	@Column(name="COACHID")
    private String coachId;
	
	@Column(name="COACHNAME")
    private String coachName;
	
    @Column(name="METROID")
    private String metroId;
    
    @Column(name="CAPACITY")
    private int capacity;
    
    @Column(name="FREESEATS")
    private int freeSeats;
    
    public MetroCoach() {};

    public MetroCoach(String metroId, String coachId, String coachName, int capacity, int freeSeats) {
        this.metroId = metroId;
        this.coachId = coachId;
        this.coachName = coachName;
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

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
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
