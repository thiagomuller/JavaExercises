package com.thiagomuller;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<>();
    }

    public void addExit(String direction, int location){
        exits.put(direction , location);
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        //This is a way to garantee that external classes can't modify exits map from
        //inside this one, because we're retuning a copy of the exits map, not the map
        //itself
        return new HashMap<String, Integer>(exits);
    }
}
