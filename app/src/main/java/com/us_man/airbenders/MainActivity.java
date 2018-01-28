package com.us_man.airbenders;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

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
    public ArrayList<Flight> flight_list;
    public ArrayList<Passenger> passenger_list;
    //public ArrayList<Passenger> sorted_list;
    //public ArrayList<Integer> compared_values;
    public Passenger thisPassenger;

    /*public void bestFit() {
        sorted_list = new ArrayList<Passenger>();
        for(int f = 0; f < passenger_list.size(); f++) {
            if(!passenger_list.get(f).getEmail().equals(thisPassenger.getEmail())) {
                sorted_list.add(passenger_list.get(f));
            }
        }
        compared_values = new ArrayList<Integer>();
        for(int i = 0; i < sorted_list.size(); i++) {
            compared_values.add(thisPassenger.compareTo(sorted_list.get(i)));
        }
        for(int k = 0; k < sorted_list.size(); k++) {
            int min = compared_values.get(k);
            int minIndex = k;
            for (int j = k+1; j < sorted_list.size(); j++) {

                if (compared_values.get(j) > min) {
                    min = compared_values.get(j);
                    minIndex = j;
                }
            }
            int temp = compared_values.get(k);
            compared_values.set(minIndex, temp);
            compared_values.set(k, min);
            Passenger tempPass = sorted_list.get(k);
            sorted_list.set(k, sorted_list.get(minIndex));
            sorted_list.set(minIndex, tempPass);
        }
    }*/

    public void login(View view) {
        EditText mEdit = (EditText)findViewById(R.id.editText);
        String thisEmail = mEdit.toString();
        boolean foundEntry = false;
        for(int i = 0; i < passenger_list.size(); ++i) {
            if(thisEmail.equals(passenger_list.get(i).getEmail())) {
                thisPassenger = passenger_list.get(i);
                foundEntry = true;
                Log.d("found it!","found it again");
            }
        }
        if(foundEntry) {
            startActivity(new Intent(MainActivity.this, profile.class));
        }
        else {
            Log.i("howdy", "didn't find it");
        }
    }
    @Override
    public void onBackPressed() {}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        retrofit = new Retrofit.Builder()
                .baseUrl("https://air-amigos.herokuapp.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        flight_list = new ArrayList<Flight>();
        passenger_list = new ArrayList<Passenger>();
        AAService aaService = retrofit.create(AAService.class);


        Call<Passenger> pass0 = aaService.getPassenger("suvedhs@gmail.com");
        pass0.enqueue(new Callback<Passenger>() {
            @Override
            public void onResponse(Call<Passenger> call, Response<Passenger> response) {
                Passenger passenger = response.body();
                passenger_list.add(passenger);
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
                passenger_list.add(passenger);
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
                passenger_list.add(passenger);
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
                passenger_list.add(passenger);
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
                passenger_list.add(passenger);
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
                passenger_list.add(passenger);
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
                passenger_list.add(passenger);
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
                passenger_list.add(passenger);
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
                passenger_list.add(passenger);
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
                passenger_list.add(passenger);
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
                    flight_list.add(flight);
                    for(Passenger pass: passenger_list) {
                        flight.addPassenger(pass);
                    }
                    Log.d("FLIGHT", flight.toString());
                }
            }

            @Override
            public void onFailure(Call<List<Flight>> call, Throwable t) {
            }
        });


        Button mButton = (Button)findViewById(R.id.button);
        mButton.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        EditText mEdit = (EditText)findViewById(R.id.textView);
                        EditText mPassword = (EditText)findViewById(R.id.editText);
                        String pass = mPassword.getText().toString();
                        String thisEmail = mEdit.getText().toString();
                        boolean foundEntry = false;
                        boolean correctPass = false;
                        if(pass.equals("password")) {
                            correctPass = true;
                        }
                        for (int i = 0; i < passenger_list.size(); ++i) {
                            if (thisEmail.equals(passenger_list.get(i).getEmail())) {
                                thisPassenger = passenger_list.get(i);
                                foundEntry = true;
                            }
                        }

                        if(foundEntry && correctPass) {
                            //bestFit();
                            //Log.i("potato", "howdy " + passenger_list.size());
                            startActivity(new Intent(MainActivity.this, profile.class));
                        }
                        else {
                            //warning message
                            if(!foundEntry) {
                                mEdit.setError("Incorrect Email");
                            }
                            else {
                                mPassword.setError("Incorrect Password");
                            }
                        }
                    }
                });

    }
}
