package com.filipstarczewski;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final String description;
    private final int locationID;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description) {
        this.description = description;
        this.locationID = locationID;
        this.exits = new HashMap<String, Integer>();
        this.exits.put("Q", 0);
    }

    public String getDescription() {
        return description;
    }

    public void addExit(String direction, int location){
        exits.put(direction,location);
    }


    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }
}
