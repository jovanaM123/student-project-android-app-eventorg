package com.example.student;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private Button login;
    private TextView tx1;


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            username = (EditText)findViewById(R.id.editText2);
            password = (EditText)findViewById(R.id.editText3);
            login = (Button)findViewById(R.id.button);
            tx1 = (TextView)findViewById(R.id.text1);

            login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    validate(username.getText().toString(), password.getText().toString());
                }
            });
    }

    private void validate(String userName, String userPassword){
        if((userName.equals("jovana")) && (userPassword.equals("jovana123"))){
            Intent intent = new Intent(MainActivity.this, StudentActivity.class);
            startActivity(intent);
        } else {
            tx1.setText("Uneli ste pogrešne podatke");
        }
    }
    public void onRegisterClick(View view){
        Intent intent= new Intent(MainActivity.this,RegisterActivity.class);
        startActivity(intent);
    }
}
