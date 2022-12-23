package com.example.student;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

public class Restoran extends AppCompatActivity {

    private TextView tx1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restoran);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        RatingBar ratingRatingBar = (RatingBar) findViewById(R.id.rb1);
        tx1 = (TextView)findViewById(R.id.tekst);
        TabLayout tabs = (TabLayout) findViewById(R.id.tabs);



        ratingRatingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                float r = ratingBar.getRating();
                tx1.setText(String.valueOf(r)+"/5 Stars");

            }
        });



        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch(tab.getPosition()) {
                    case 0:
                        Intent intent = new Intent(Restoran.this, Smestaj.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(Restoran.this, Restoran.class);
                        startActivity(intent1);
                        break;


                }
    }      @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                switch(tab.getPosition()) {
                    case 0:
                        Intent intent = new Intent(Restoran.this, Smestaj.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(Restoran.this, Restoran.class);
                        startActivity(intent1);
                        break;
                }
            }
        });

}
    public void promena(View view){
        Intent intent= new Intent(Restoran.this,Zahtev.class);
        startActivity(intent);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_student,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.pocetna:
                Intent intent= new Intent(Restoran.this,StudentActivity.class);
                startActivity(intent);
                return true;
            case R.id.kontakt:
                Intent intent1= new Intent(Restoran.this,Kontakt.class);
                startActivity(intent1);
                return true;
            case R.id.nalog:
                Intent intent2= new Intent(Restoran.this,Nalog.class);
                startActivity(intent2);
                return true;
            case R.id.odjava:
                Intent intent3= new Intent(Restoran.this,MainActivity.class);
                startActivity(intent3);
                return true;
            case R.id.istrazi:
                Intent intent6= new Intent(Restoran.this,Istrazi.class);
                startActivity(intent6);
                return true;
            case R.id.utakmice:
                Intent intent5= new Intent(Restoran.this,Utakmice.class);
                startActivity(intent5);
                return true;
            case R.id.smestaj:
                Intent intent4= new Intent(Restoran.this,Smestaj.class);
                startActivity(intent4);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }}
