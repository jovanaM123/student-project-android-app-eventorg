package com.example.student;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

public class Omiljeni extends AppCompatActivity {
    String vid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_omiljeni);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TabLayout tabs = (TabLayout) findViewById(R.id.tabs);
        Intent intent=getIntent();
        vid=intent.getStringExtra("cekirano");
        final CardView card=(CardView)findViewById(R.id.card1);
        ImageButton imageButton=(ImageButton)findViewById(R.id.imageButton4);
        card.setVisibility(View.GONE);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                card.setVisibility(View.INVISIBLE);

            }
        });


            if(vid!=null){
                card.setVisibility(View.VISIBLE);
            }





        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch(tab.getPosition()) {
                    case 0:
                        Intent intent = new Intent(Omiljeni.this, Muzeji.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(Omiljeni.this, Omiljeni.class);
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
                        Intent intent = new Intent(Omiljeni.this, Muzeji.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(Omiljeni.this, Omiljeni.class);
                        startActivity(intent1);
                        break;
                }
            }
        });

    }

    public void galerija(View view){
        Intent intent= new Intent(Omiljeni.this,Galerija.class);
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
                Intent intent= new Intent(Omiljeni.this,StudentActivity.class);
                startActivity(intent);
                return true;
            case R.id.kontakt:
                Intent intent1= new Intent(Omiljeni.this,Kontakt.class);
                startActivity(intent1);
                return true;
            case R.id.nalog:
                Intent intent2= new Intent(Omiljeni.this,Nalog.class);
                startActivity(intent2);
                return true;
            case R.id.odjava:
                Intent intent3= new Intent(Omiljeni.this,MainActivity.class);
                startActivity(intent3);
                return true;
            case R.id.istrazi:
                Intent intent6= new Intent(Omiljeni.this,Istrazi.class);
                startActivity(intent6);
                return true;
            case R.id.utakmice:
                Intent intent5= new Intent(Omiljeni.this,Utakmice.class);
                startActivity(intent5);
                return true;
            case R.id.smestaj:
                Intent intent4= new Intent(Omiljeni.this,Smestaj.class);
                startActivity(intent4);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
