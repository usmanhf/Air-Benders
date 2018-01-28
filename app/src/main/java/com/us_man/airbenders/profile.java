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

        Button mButton = (Button)findViewById(R.id.submit_profile);
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

        MainActivity.bestFit();
        thisPassenger = MainActivity.thisPassenger;
        sort_list = MainActivity.sorted_list;
        compared_values = MainActivity.compared_values;
    }
}
