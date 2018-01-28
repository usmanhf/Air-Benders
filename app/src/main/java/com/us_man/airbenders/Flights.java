package com.us_man.airbenders;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Flights extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flights);

        LinearLayout myLinearLayout = (LinearLayout) findViewById(R.id.flightList);

        final int N = 13; // total number of textviews to add

        final Button[] myButtons = new Button[N]; // create an empty array;

        for (int i = 0; i < N; i++) {
            // create a new textview
            final Button rowButton = new Button(this);

            // set some properties of rowTextView or something
            rowButton.setText("Flight Option #" + i + " "+ );
            Button btn = (Button)findViewById(i);

            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                  //  startActivity(new Intent(Flights.this, matches.class));
                }
            });
            rowButton.setId(i);

            // add the textview to the linearlayout
            myLinearLayout.addView(rowButton);

            // save a reference to the textview for later
            myButtons[i] = rowButton;
        }
    }
}
