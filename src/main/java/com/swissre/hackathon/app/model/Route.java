package com.swissre.hackathon.app.model;

import java.util.List;

public class Route {
    private String routeId;
    private String routeName;
    private String source;
    private String destination;
    private List<String> listOfStations;

    public Route(String routeId, String routeName, String source, String destination, List<String> listOfStations) {
        this.routeId = routeId;
        this.routeName = routeName;
        this.source = source;
        this.destination = destination;
        this.listOfStations = listOfStations;
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

    public List<String> getListOfStations() {
        return listOfStations;
    }

    public void setListOfStations(List<String> listOfStations) {
        this.listOfStations = listOfStations;
    }
}
