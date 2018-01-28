package com.us_man.airbenders;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.us_man.airbenders.model.Passenger;

import java.util.ArrayList;
import java.util.List;

public class MatchesActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PassengerAdapter passengerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matches);
        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Passenger> passengers = new ArrayList<>();
        passengers.add(new Passenger("Humza", "Jaffri", "Male", "humzajaffri@gmail.com"));
        passengers.add(new Passenger("Usman", "Williams", "Male", ""));
        passengers.add(new Passenger("Suvedh", "Johnson", "Male", ""));
        passengers.add(new Passenger("John", "Smith", "Male", ""));
        passengers.add(new Passenger("Jerry", "Wilson", "Male", ""));
        passengerAdapter = new PassengerAdapter(this, passengers);
        recyclerView.setAdapter(passengerAdapter);
        passengerAdapter.notifyDataSetChanged();
    }
}
