package com.example.ilya.afdf;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    Button btnActTwo;
    Button button3;
    Button button2;
    Button button4;
    Button button5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnActTwo = (Button) findViewById(R.id.btnActTwo);
        btnActTwo.setOnClickListener(this);

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);

        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(this);

    }



    @Override
            public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btnActTwo:
                Intent intent = new Intent(this, ActivityTwo.class);
                startActivity(intent);
                break;
            default:
                break;
        }

        switch (v.getId()) {

            case R.id.button3:
                Intent intent = new Intent(this, Rezervace.class);
                startActivity(intent);
                break;
            default:
                break;
        }


        switch (v.getId()) {

            case R.id.button2:
                Intent intent = new Intent(this, Hotel_sl.class);
                startActivity(intent);
                break;
            default:
                break;
        }


        switch (v.getId()) {

            case R.id.button4:
                Intent intent = new Intent(this, Hotel_Info.class);
                startActivity(intent);
                break;
            default:
                break;
        }


        switch (v.getId()) {

            case R.id.button5:
                Intent intent = new Intent(this, Kontakty.class);
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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        return super.onOptionsItemSelected(item);
    }
}
