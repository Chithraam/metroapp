package com.swissre.hackathon.app.model;

import javax.persistence.*;

@Table(name = "metro")
@Entity
public class Metro {

	@Id
	@Column(name="METROID")
    private String metroId;
	
	@Column(name="ROUTEID")
    private String routeId;
	
	@Column(name="NOOFCOACHES")
    private String noOfCoaches;
	
	@Column(name="CROWDEDSTATUS")
    private String crowdedStatus;
	
	@Column(name="CURRENTSTATION")
    private String currentStation;
	
	@Column(name="NEXTSTATION")
    private String nextStation;
	
	public Metro() {};

    public Metro(String metroId, String routeId, String noOfCoaches, String crowdedStatus, String currentStation, String nextStation) {
        this.metroId = metroId;
        this.routeId = routeId;
        this.noOfCoaches = noOfCoaches;
        this.crowdedStatus = crowdedStatus;
        this.currentStation = currentStation;
        this.nextStation = nextStation;
    }

    public String getMetroId() {
        return metroId;
    }

    public void setMetroId(String metroId) {
        this.metroId = metroId;
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getNoOfCoaches() {
        return noOfCoaches;
    }

    public void setNoOfCoaches(String noOfCoaches) {
        this.noOfCoaches = noOfCoaches;
    }

    public String getCrowdedStatus() {
        return crowdedStatus;
    }

    public void setCrowdedStatus(String crowdedStatus) {
        this.crowdedStatus = crowdedStatus;
    }

    public String getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(String currentStation) {
        this.currentStation = currentStation;
    }

    public String getNextStation() {
        return nextStation;
    }

    public void setNextStation(String nextStation) {
        this.nextStation = nextStation;
    }
}
