package com.example.student;

import android.os.Bundle;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class Nalog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nalog2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }
    public void promena(View view){
        Intent intent= new Intent(Nalog.this,PromenaActivity.class);
        startActivity(intent);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_student,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.pocetna:
                Intent intent= new Intent(Nalog.this,StudentActivity.class);
                startActivity(intent);
                return true;
            case R.id.kontakt:
                Intent intent1= new Intent(Nalog.this,Kontakt.class);
                startActivity(intent1);
                return true;
            case R.id.nalog:
                Intent intent2= new Intent(Nalog.this,Nalog.class);
                startActivity(intent2);
                return true;
            case R.id.odjava:
                Intent intent3= new Intent(Nalog.this,MainActivity.class);
                startActivity(intent3);
                return true;
            case R.id.istrazi:
                Intent intent6= new Intent(Nalog.this,Istrazi.class);
                startActivity(intent6);
                return true;
            case R.id.utakmice:
                Intent intent5= new Intent(Nalog.this,Utakmice.class);
                startActivity(intent5);
                return true;
            case R.id.smestaj:
                Intent intent4= new Intent(Nalog.this,Smestaj.class);
                startActivity(intent4);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }



}
