package com.us_man.airbenders;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.us_man.airbenders.model.Passenger;

import java.util.ArrayList;

public class profile extends AppCompatActivity {

    private ArrayList<Passenger> sort_list;
    private ArrayList<Integer> compared_values;

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
                        //EditText mEdit = (EditText)findViewById(R.id.textView);
                        //EditText mPassword = (EditText)findViewById(R.id.editText);
                        //String pass = mPassword.getText().toString();
                        //String thisEmail = mEdit.getText().toString();
                        RadioGroup radioGroup1 = (RadioGroup) findViewById(R.id.group1);
                        int selectedId1= radioGroup1.getCheckedRadioButtonId();
                        RadioButton rad1 = (RadioButton) findViewById(selectedId1);
                        String content1 = rad1.getText().toString();
                        if(content1.equals("First Class")) {
                            MainActivity.thisPassenger.setFlightClass("F");
                        }
                        else if(content1.equals("Economy")) {
                            MainActivity.thisPassenger.setFlightClass("E");
                        }
                        else {
                            MainActivity.thisPassenger.setFlightClass("B");
                        }

                        RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.group2);
                        int selectedId2= radioGroup1.getCheckedRadioButtonId();
                        RadioButton rad2= (RadioButton) findViewById(selectedId2);
                        String content2 = rad2.getText().toString();
                        if(content2.equals("Aisle")) {
                            MainActivity.thisPassenger.setSeatChoice("aisle");
                        }
                        else {
                            MainActivity.thisPassenger.setSeatChoice("window");
                        }

                        RadioGroup radioGroup3 = (RadioGroup) findViewById(R.id.group3);
                        int selectedId3= radioGroup1.getCheckedRadioButtonId();
                        RadioButton rad3 = (RadioButton) findViewById(selectedId3);
                        String content3 = rad3.getText().toString();
                        if(content3.equals("Talking")) {
                            MainActivity.thisPassenger.setTalk("yes");
                        }
                        else {
                            MainActivity.thisPassenger.setTalk("no");
                        }

                        MainActivity.bestFit();

                        sort_list = MainActivity.sorted_list;
                        compared_values = MainActivity.compared_values;
                        String s = "";
                        for(int i = 0; i < 9; i++) {
                            s+=compared_values.get(i)+" ";
                        }
                        Log.i("howdy","howdy " + s);
                        startActivity(new Intent(profile.this, Flights.class));

                    }
                });




    }
}
