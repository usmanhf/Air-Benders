package com.us_man.airbenders;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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
                        RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.group2);
                        RadioGroup radioGroup3 = (RadioGroup) findViewById(R.id.group3);



                        MainActivity.bestFit();
                        sort_list = MainActivity.sorted_list;
                        compared_values = MainActivity.compared_values;
                    }
                });

        MainActivity.bestFit();
        sort_list = MainActivity.sorted_list;
        compared_values = MainActivity.compared_values;
    }
}
