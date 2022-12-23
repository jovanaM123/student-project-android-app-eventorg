package com.example.student;

import android.content.Intent;
import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.Locale;

public class Utakmice extends AppCompatActivity {
    private ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utakmice);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        EditText etSearch=(EditText) findViewById(R.id.e);
        final ListView list = (ListView) findViewById(R.id.theList);
        RadioButton vreme=(RadioButton)findViewById(R.id.radioButton);
        RadioButton datum=(RadioButton)findViewById(R.id.radioButton2);
        RadioButton hala=(RadioButton)findViewById(R.id.radioButton3);
        RadioGroup  searchViaRadioGroup = (RadioGroup)findViewById(R.id.filter_type_radio_group);


        Mecevi mec1 = new Mecevi("ETF vs FTN","08.06.2020.","Hala 1", "19:30");
        Mecevi mec2 = new Mecevi("ELFAK vs RAF","14.06.2020.","Hala 2","18:30");
        Mecevi mec3 = new Mecevi("RAF vs FTN","18.06.2020","Hala 1","09:00");


        ArrayList<Mecevi> mecevi = new ArrayList<>();
        mecevi.add(mec1);
        mecevi.add(mec2);
        mecevi.add(mec3);




        MeceviListAdapter adapter = new MeceviListAdapter(this,R.layout.list_item_layout, mecevi);
        list.setAdapter(adapter);

        etSearch.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // Call back the Adapter with current character to Filter
             //   Utakmice.this.adapter.getFilter().filter(s.toString());
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });


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
                Intent intent= new Intent(Utakmice.this,StudentActivity.class);
                startActivity(intent);
                return true;
            case R.id.kontakt:
                Intent intent1= new Intent(Utakmice.this,Kontakt.class);
                startActivity(intent1);
                return true;
            case R.id.nalog:
                Intent intent2= new Intent(Utakmice.this,Nalog.class);
                startActivity(intent2);
                return true;
            case R.id.odjava:
                Intent intent3= new Intent(Utakmice.this,MainActivity.class);
                startActivity(intent3);
                return true;
            case R.id.istrazi:
                Intent intent6= new Intent(Utakmice.this,Istrazi.class);
                startActivity(intent6);
                return true;
            case R.id.utakmice:
                Intent intent4= new Intent(Utakmice.this,Utakmice.class);
                startActivity(intent4);
                return true;
            case R.id.smestaj:
                Intent intent5= new Intent(Utakmice.this,Smestaj.class);
                startActivity(intent5);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}
