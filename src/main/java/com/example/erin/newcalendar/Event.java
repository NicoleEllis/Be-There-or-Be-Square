package com.example.erin.newcalendar;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Event extends AppCompatActivity {
    EditText Name;
    EditText Location;
    EditText Description;
    Button returnButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        Name = (EditText) findViewById(R.id.Name);
        Location = (EditText) findViewById(R.id.Location);
        Description = (EditText) findViewById(R.id.Description);
        OnClickButtonListener();}
        public void OnClickButtonListener() {
            returnButton = (Button) findViewById(R.id.returnButton);
            returnButton.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent("com.example.erin.newcalendar.CalendarPage");
                            startActivity(intent);

                        }
                    }
            );
        }
    }



