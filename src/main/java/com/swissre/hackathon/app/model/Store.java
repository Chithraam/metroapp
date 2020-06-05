package com.swissre.hackathon.app.model;

import java.util.Date;

import javax.validation.constraints.Size;

public class Store {
    private int storeId;
    private String storeName;
    private String storeStatus;
    private String storeTiming;
    private Location storeLocation;
    private String storeAddress;
    private int noOfPeople;
    private int peopleInQueue;
    private int storeCapacity;
    private String crowdedStatus;


    public Store(int storeId, String storeName, String storeStatus, String storeTiming, Location storeLocation, String storeAddress, int noOfPeople, int peopleInQueue, int storeCapacity, String crowdedStatus) {
        this.storeId = storeId;
        this.storeName = storeName;
        this.storeStatus = storeStatus;
        this.storeTiming = storeTiming;
        this.storeLocation = storeLocation;
        this.storeAddress = storeAddress;
        this.noOfPeople = noOfPeople;
        this.peopleInQueue = peopleInQueue;
        this.storeCapacity = storeCapacity;
        this.crowdedStatus = crowdedStatus;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreStatus() {
        return storeStatus;
    }

    public void setStoreStatus(String storeStatus) {
        this.storeStatus = storeStatus;
    }

    public String getStoreTiming() {
        return storeTiming;
    }

    public void setStoreTiming(String storeTiming) {
        this.storeTiming = storeTiming;
    }

    public Location getStoreLocation() {
        return storeLocation;
    }

    public void setStoreLocation(Location storeLocation) {
        this.storeLocation = storeLocation;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public int getNoOfPeople() {
        return noOfPeople;
    }

    public void setNoOfPeople(int noOfPeople) {
        this.noOfPeople = noOfPeople;
    }

    public int getPeopleInQueue() {
        return peopleInQueue;
    }

    public void setPeopleInQueue(int peopleInQueue) {
        this.peopleInQueue = peopleInQueue;
    }

    public int getStoreCapacity() {
        return storeCapacity;
    }

    public void setStoreCapacity(int storeCapacity) {
        this.storeCapacity = storeCapacity;
    }

    public String getCrowdedStatus() {
        return crowdedStatus;
    }

    public void setCrowdedStatus(String crowdedStatus) {
        this.crowdedStatus = crowdedStatus;
    }
}