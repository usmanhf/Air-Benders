<<<<<<< HEAD
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
=======
package com.us_man.airbenders.model;

/**
 * Created by suved on 1/27/2018.
 */

public class Flight {

    private String flightNumber;

    public Flight() {

    }

    public String getFlightNumber() {
        return flightNumber;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\''
                + ", originCity='" +
                '}';
    }
}
>>>>>>> 9d8e12d94f7cbbe8bf8516fbea77b92126ce5a2c
