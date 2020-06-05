package com.swissre.hackathon.app.service;

import com.swissre.hackathon.app.model.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MetroService {
    private static List<Metro> metro = new ArrayList<Metro>();
    private static List<Route> routes = new ArrayList<Route>();
    private static List<MetroCoach> coaches = new ArrayList<MetroCoach>();
    private static int storeCount = 3;

    static {

        List<String> r1_stations=new ArrayList<>();
        r1_stations.add("Baiyappanahalli");
        r1_stations.add("Swami Vivekananda Road");
        r1_stations.add("Indiranagar");
        r1_stations.add("Halasuru");
        r1_stations.add("Trinity Circle");
        r1_stations.add("MG Road");
        r1_stations.add("Cubbon Park");
        r1_stations.add("Majestic");
        r1_stations.add("Vijayanagar");
        r1_stations.add("Attiguppe");
        r1_stations.add("Mysore Road");

        routes.add(new Route("R1","Baiyappanahalli–Mysore Road","Baiyappanahalli","Mysore Road",r1_stations));

        metro.add(new Metro("M1","R1","3","Medium","Indiranagar","MG Road"));

        coaches.add(new MetroCoach("M1","C1","C-1",20,10));
        coaches.add(new MetroCoach("M1","C2","C-2",20,5));
        coaches.add(new MetroCoach("M1","C3","C-3",20,3));

          }


    public List<MetroCoachModel> retrieveTrains(String route,String station) {
        List<MetroCoachModel> filteredTrains = new ArrayList<MetroCoachModel>();
        String routeId=null;
        String source=null;
        String destination=null;

        for (Route routes : routes) {

            if(routes.getRouteName().equalsIgnoreCase(route)){
                routeId=routes.getRouteId();
                source=routes.getSource();
                destination=routes.getDestination();
            }

        }

        String metroId=null;
        for (Metro metro : metro) {

           if(metro.getNextStation().equalsIgnoreCase(station) && metro.getRouteId().equalsIgnoreCase(routeId)){
               metroId=metro.getMetroId();
           }

        }

        List<MetroCoach> filteredCoaches=new ArrayList<>();
        for (MetroCoach coach : coaches) {

            if(coach.getMetroId().equalsIgnoreCase(metroId)){
                filteredCoaches.add(coach);
            }

        }

        for (MetroCoach coach : filteredCoaches) {

            MetroCoachModel modelObj=new MetroCoachModel();
            modelObj.setRouteName(route);
            modelObj.setCapacity(coach.getCapacity());
            modelObj.setCoachNo(coach.getCoachNo());
            modelObj.setSource(source);
            modelObj.setDestination(destination);
            modelObj.setFreeSeats(coach.getFreeSeats());

            filteredTrains.add(modelObj);
        }

        return filteredTrains;
    }
}
