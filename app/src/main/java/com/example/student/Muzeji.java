package com.example.student;

import android.content.Intent;
import android.os.Bundle;


import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;

public class Muzeji extends AppCompatActivity {
    String c="da";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muzeji);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TabLayout tabs = (TabLayout) findViewById(R.id.tabs);
        ImageButton imageButton=(ImageButton)findViewById(R.id.imageButton2);


       imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(Muzeji.this,Omiljeni.class);
                intent1.putExtra("cekirano","da");
                startActivity(intent1);
            }
        });


        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch(tab.getPosition()) {
                    case 0:
                        Intent intent = new Intent(Muzeji.this, Muzeji.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(Muzeji.this, Omiljeni.class);
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
                        Intent intent = new Intent(Muzeji.this, Muzeji.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(Muzeji.this, Omiljeni.class);
                        startActivity(intent1);
                        break;
                }
            }
        });

    }


    public void galerija(View view){
        Intent intent= new Intent(Muzeji.this,Galerija.class);
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
                Intent intent= new Intent(Muzeji.this,StudentActivity.class);
                startActivity(intent);
                return true;
            case R.id.kontakt:
                Intent intent1= new Intent(Muzeji.this,Kontakt.class);
                startActivity(intent1);
                return true;
            case R.id.nalog:
                Intent intent2= new Intent(Muzeji.this,Nalog.class);
                startActivity(intent2);
                return true;
            case R.id.odjava:
                Intent intent3= new Intent(Muzeji.this,MainActivity.class);
                startActivity(intent3);
                return true;
            case R.id.istrazi:
                Intent intent6= new Intent(Muzeji.this,Istrazi.class);
                startActivity(intent6);
                return true;
            case R.id.utakmice:
                Intent intent5= new Intent(Muzeji.this,Utakmice.class);
                startActivity(intent5);
                return true;
            case R.id.smestaj:
                Intent intent4= new Intent(Muzeji.this,Smestaj.class);
                startActivity(intent4);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
