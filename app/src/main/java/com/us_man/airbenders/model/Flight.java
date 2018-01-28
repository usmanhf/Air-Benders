package com.us_man.airbenders.model;

import java.util.HashMap;


public class Flight {

    private String flightNumber;
    private String origin;
    private String destination;
    private String arrivalTime;
    private String day;
    private HashMap<Passenger, Boolean> passengers = new HashMap<Passenger, Boolean>();

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

    private String getArrivalTime() {
        return arrivalTime;
    }


    public void addPassenger(Passenger temp) {

        passengers.put(temp, false);
    }

    public void matchPassenger(Passenger temp) {
        passengers.remove(temp);
        passengers.put(temp, true);
    }


    private void setDay() {
        day = getArrivalTime().substring(0, 10);
    }

    public String getDay() {
        return day;
    }

    @Override
    public String toString() {
        setDay();
        String outp = "Flight{" +
                "flightNumber='" + flightNumber + '\''
                + ", origin='" + origin + '\''
                + ", destination='" + destination + '\''
                + ", day='" + day + '\'';
            if(passengers.isEmpty()) {
                outp+= '}';
            }
            else {
                String pass = "";
                int i = 1;
                for(Passenger temp: passengers.keySet()) {
                    pass+= i + ": " + temp.toString() + ",\n";
                    i++;
                }
                outp+= ", passengers='[\n" + pass + "]"
                        + '}';
            }
        return outp;
    }
}