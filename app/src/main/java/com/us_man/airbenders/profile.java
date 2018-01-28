package com.us_man.airbenders;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.us_man.airbenders.model.Passenger;

import java.util.ArrayList;

public class profile extends AppCompatActivity {

    private ArrayList<Passenger> sort_list;
    private ArrayList<Integer> compared_values;
    public Passenger thisPassenger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);



        MainActivity.bestFit();
        thisPassenger = MainActivity.thisPassenger;
        sort_list = MainActivity.sorted_list;
        compared_values = MainActivity.compared_values;

        Button btn = (Button)findViewById(R.id.submit_profile);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(profile.this, Flights.class));
            }
        });

    }
}
