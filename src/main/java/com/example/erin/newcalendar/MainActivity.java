package com.example.erin.newcalendar;

import android.content.ContentValues;
import android.content.Intent;
import android.graphics.Color;
import java.util.TimeZone;
import android.net.Uri;
import android.os.Build;
import android.provider.CalendarContract;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.Toast;

import static android.provider.CalendarContract.ACCOUNT_TYPE_LOCAL;

public class MainActivity extends AppCompatActivity {

    private static Button calendarButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnClickButtonListener();
    }
        public void OnClickButtonListener() {
        calendarButton = (Button) findViewById(R.id.button);
        calendarButton.setOnClickListener(
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