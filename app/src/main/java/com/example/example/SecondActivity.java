package com.example.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    EditText firstName, lastName, email;
    Button register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
       firstName = findViewById(R.id.txFirstName);
       lastName = findViewById(R.id.txLastName);
       email = findViewById(R.id.txEmailAddress);
       register = findViewById(R.id.btnShowInput);

       Intent intent= getIntent();



    }
}
