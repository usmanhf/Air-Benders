package com.us_man.airbenders.model;

/**
 * Created by suved on 1/27/2018.
 */

public class Passenger {

    private final String[] SEAT_CHOICES = {"window", "aisle"};
    private final String[] FLIGHT_CLASSES = {"F","B","E"};
    private final String[] TALKING_PREFERENCES = {"yes", "no"};

    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private String seatChoice;
    private String flightClass;
    private String talk;

    public Passenger(String firstName, String lastName, String gender, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.seatChoice = SEAT_CHOICES[(int)(Math.random()*2)];
        this.flightClass = FLIGHT_CLASSES[(int)(Math.random()*3)];
        this.talk = TALKING_PREFERENCES[(int)(Math.random()*2)];
    }

    public Passenger() {

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getSeatChoice() {
        return seatChoice;
    }

    public String getFlightClass() {
        return flightClass;
    }

    public String getTalk() {
        return talk;
    }

    public String toString() {
        return "Passenger{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", seatChoice='" + seatChoice + '\'' +
                ", flightClass='" + flightClass + '\'' +
                ", getTalk='" + talk + '\'' +
                "}";
    }

}
