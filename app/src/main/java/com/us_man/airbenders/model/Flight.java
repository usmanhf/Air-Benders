package com.us_man.airbenders.model;

import java.util.HashMap;

/**
 * Created by suved on 1/27/2018.
 */

public class Flight {

    private String flightNumber;
    private String origin;
    private String destination;
    private String arrivalTime;
    private String day;
    //private HashMap<Passenger, Boolean> passengers = new HashMap<Passenger, Boolean>();

    public Flight() {
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    /*public void addPassenger(Passenger temp) {
        passengers.put(temp, false);
    }*/

    private void setDay() {
        day = getArrivalTime().substring(0, 10);
    }

    @Override
    public String toString() {
        setDay();
        return "Flight{" +
                "flightNumber='" + flightNumber + '\''
                + ", origin='" + origin + '\''
                + ", destination='" + destination + '\''
                + ", day='" + day + '\''
                + '}';
    }
}
