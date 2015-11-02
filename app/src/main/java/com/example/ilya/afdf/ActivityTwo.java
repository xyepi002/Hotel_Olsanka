package com.example.ilya.afdf;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class ActivityTwo extends AppCompatActivity implements View.OnClickListener {

    Button button;
    Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_two);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);

        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        
        switch (v.getId()) {
            case R.id.button:
                Intent intent = new Intent(this, Activity3.class);
                startActivity(intent);
                break;
            default:
                break;
        }



        switch (v.getId()) {
            case R.id.button6:
                Intent intent = new Intent(this, Activity4.class);
                startActivity(intent);
                break;
            default:
                break;
        }



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
