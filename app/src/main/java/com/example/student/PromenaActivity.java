package com.example.student;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PromenaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promena);
    }
    public void onSubmitClick(View view){
        Intent intent= new Intent(PromenaActivity.this,StudentActivity.class);
        startActivity(intent);
    }
}
