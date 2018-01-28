package com.us_man.airbenders;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.us_man.airbenders.model.Passenger;

import java.util.List;

public class MatchesActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PassengerAdapter passengerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matches);
        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);

        passengerAdapter = new PassengerAdapter(this, List< Passenger>);
    }
}
