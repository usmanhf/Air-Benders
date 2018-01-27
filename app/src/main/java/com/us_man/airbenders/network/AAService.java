package com.us_man.airbenders.network;

import com.us_man.airbenders.model.Flight;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by suvedh on 1/27/2018.
 */

public interface AAService {

    @GET("/flights")
    Call<List<Flight>> getFlights(@Query("origin") String origin, @Query("destination") String destination, @Query("date") String date);
}
