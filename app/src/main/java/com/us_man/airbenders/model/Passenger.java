package com.us_man.airbenders.model;

/**
 * Created by suved on 1/27/2018.
 */

public class Passenger implements Comparable<Passenger> {

    private final String[] SEAT_CHOICES = {"window", "aisle"};
    private final String[] FLIGHT_CLASSES = {"F","B","B","B","E","E","E","E","E","E"};
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
        this.flightClass = FLIGHT_CLASSES[(int)(Math.random()*10)];
        this.talk = TALKING_PREFERENCES[(int)(Math.random()*2)];
    }

    public Passenger() {
        this.seatChoice = SEAT_CHOICES[(int)(Math.random()*2)];
        this.flightClass = FLIGHT_CLASSES[(int)(Math.random()*10)];
        this.talk = TALKING_PREFERENCES[(int)(Math.random()*2)];
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

    public void setSeatChoice(String s) {
        seatChoice = s;
    }

    public void setFlightClass(String s) {
        flightClass = s;
    }

    public void setTalk(String s) {
        talk = s;
    }

    public int compareTo(Passenger p){
        int comparison = 0;
        if (this.talk.equals(p.talk)){
            comparison += 100;
        } if (!this.seatChoice.equals(p.seatChoice)){
            comparison += 100;
        } if (this.flightClass.equals(p.flightClass)){
            comparison += 1000;
        }
        return comparison;
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
