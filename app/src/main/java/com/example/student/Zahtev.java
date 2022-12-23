package com.example.student;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Zahtev extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zahtev);
    }

    public void onSubmitClick(View view){
        Intent intent= new Intent(Zahtev.this,StudentActivity.class);
        startActivity(intent);
    }
}
