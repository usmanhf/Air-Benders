package com.us_man.airbenders;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.us_man.airbenders.model.Flight;
import com.us_man.airbenders.model.Passenger;
import com.us_man.airbenders.network.AAService;

import java.util.ArrayList;
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

        Call<Passenger> pass0 = aaService.getPassenger("suvedhs@gmail.com");
        pass0.enqueue(new Callback<Passenger>() {
            @Override
            public void onResponse(Call<Passenger> call, Response<Passenger> response) {
                Passenger passenger = response.body();
                Log.d("PASSENGER", passenger.toString());
            }

            @Override
            public void onFailure(Call<Passenger> call, Throwable t) {
            }
        });
        Call<Passenger> pass1 = aaService.getPassenger("kgrinikhin0@example.com");
        pass1.enqueue(new Callback<Passenger>() {
            @Override
            public void onResponse(Call<Passenger> call, Response<Passenger> response) {
                Passenger passenger = response.body();
                Log.d("PASSENGER", passenger.toString());
            }

            @Override
            public void onFailure(Call<Passenger> call, Throwable t) {
            }
        });
        Call<Passenger> pass2 = aaService.getPassenger("kmengo1@example.com");
        pass2.enqueue(new Callback<Passenger>() {
            @Override
            public void onResponse(Call<Passenger> call, Response<Passenger> response) {
                Passenger passenger = response.body();
                Log.d("PASSENGER", passenger.toString());
            }

            @Override
            public void onFailure(Call<Passenger> call, Throwable t) {
            }
        });
        Call<Passenger> pass3 = aaService.getPassenger("leitter2@example.com");
        pass3.enqueue(new Callback<Passenger>() {
            @Override
            public void onResponse(Call<Passenger> call, Response<Passenger> response) {
                Passenger passenger = response.body();
                Log.d("PASSENGER", passenger.toString());
            }

            @Override
            public void onFailure(Call<Passenger> call, Throwable t) {
            }
        });
        Call<Passenger> pass4 = aaService.getPassenger("ashilstone3@example.com");
        pass4.enqueue(new Callback<Passenger>() {
            @Override
            public void onResponse(Call<Passenger> call, Response<Passenger> response) {
                Passenger passenger = response.body();
                Log.d("PASSENGER", passenger.toString());
            }

            @Override
            public void onFailure(Call<Passenger> call, Throwable t) {
            }
        });

        Call<Passenger> pass5 = aaService.getPassenger("vmedcalf4@example.com");
        pass5.enqueue(new Callback<Passenger>() {
            @Override
            public void onResponse(Call<Passenger> call, Response<Passenger> response) {
                Passenger passenger = response.body();
                Log.d("PASSENGER", passenger.toString());
            }

            @Override
            public void onFailure(Call<Passenger> call, Throwable t) {
            }
        });
        Call<Passenger> pass6 = aaService.getPassenger("srakestraw6@example.com");
        pass6.enqueue(new Callback<Passenger>() {
            @Override
            public void onResponse(Call<Passenger> call, Response<Passenger> response) {
                Passenger passenger = response.body();
                Log.d("PASSENGER", passenger.toString());
            }

            @Override
            public void onFailure(Call<Passenger> call, Throwable t) {
            }
        });
        Call<Passenger> pass7 = aaService.getPassenger("bcathrae7@example.com");
        pass7.enqueue(new Callback<Passenger>() {
            @Override
            public void onResponse(Call<Passenger> call, Response<Passenger> response) {
                Passenger passenger = response.body();
                Log.d("PASSENGER", passenger.toString());
            }

            @Override
            public void onFailure(Call<Passenger> call, Throwable t) {
            }
        });
        Call<Passenger> pass8 = aaService.getPassenger("ealoshechkin8@example.com");
        pass8.enqueue(new Callback<Passenger>() {
            @Override
            public void onResponse(Call<Passenger> call, Response<Passenger> response) {
                Passenger passenger = response.body();
                Log.d("PASSENGER", passenger.toString());
            }

            @Override
            public void onFailure(Call<Passenger> call, Throwable t) {
            }
        });
        Call<Passenger> pass9 = aaService.getPassenger("gferroni9@example.com");
        pass9.enqueue(new Callback<Passenger>() {
            @Override
            public void onResponse(Call<Passenger> call, Response<Passenger> response) {
                Passenger passenger = response.body();
                Log.d("PASSENGER", passenger.toString());
            }

            @Override
            public void onFailure(Call<Passenger> call, Throwable t) {
            }
        });

        //flights
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
