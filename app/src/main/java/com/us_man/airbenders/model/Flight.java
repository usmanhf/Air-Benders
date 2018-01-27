package com.us_man.airbenders.model;

/**
 * Created by suved on 1/27/2018.
 */

public class Flight {

    private String flightNumber;
    private String originCity;

    public Flight() {
        
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\''
                + ", originCity='" + originCity + '\'' +
                '}';
    }
}
