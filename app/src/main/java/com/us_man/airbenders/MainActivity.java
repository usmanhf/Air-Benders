package com.us_man.airbenders;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.us_man.airbenders.model.Flight;
import com.us_man.airbenders.network.AAService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private Retrofit retrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        retrofit = new Retrofit.Builder()
                .baseUrl("https://air-amigos.herokuapp.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        AAService aaService = retrofit.create(AAService.class);

        Call<List<Flight>> flights = aaService.getFlights("DFW", "LAX", "2018-03-01T08:45-06:00");
        flights.enqueue(new Callback<List<Flight>>() {
            @Override
            public void onResponse(Call<List<Flight>> call, Response<List<Flight>> response) {
                List<Flight> flights = response.body();
                for (Flight flight : flights) {
                    Log.d("FLIGHT", flight.toString());
                }
            }

            @Override
            public void onFailure(Call<List<Flight>> call, Throwable t) {

            }
        });
    }
}
