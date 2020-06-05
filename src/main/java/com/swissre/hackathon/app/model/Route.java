package com.swissre.hackathon.app.model;

import java.util.List;

import javax.persistence.*;

import com.swissre.hackathon.app.util.StringListConverter;

@Table(name = "route")
@Entity
public class Route {
	@Id
	@Column(name="ROUTEID")
    private String routeId;
	
	@Column(name="ROUTENAME")
    private String routeName;
	
	@Column(name="SOURCE")
    private String source;
	
	@Column(name="DESTINATION")
    private String destination;
    
    @Convert(converter = StringListConverter.class)
    @Column(name="STATIONS")
    private List<String> stations;
    
    public Route() {};

    public Route(String routeId, String routeName, String source, String destination, List<String> stations) {
        this.routeId = routeId;
        this.routeName = routeName;
        this.source = source;
        this.destination = destination;
        this.stations = stations;
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public List<String> getStations() {
        return stations;
    }

    public void setStations(List<String> stations) {
        this.stations = stations;
    }
}
