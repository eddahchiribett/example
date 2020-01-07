package com.example.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
     private EditText edFirstName, edLastName, edEmailAdress;
     private Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edFirstName = findViewById(R.id.edFirstName);
        edLastName = findViewById(R.id.edLastName);
        edEmailAdress = findViewById(R.id.edEmailAddress);
        register = findViewById(R.id.btnShowInput);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstName = edFirstName.getText().toString();
                String lastName = edLastName.getText().toString();
                String  emailAddress = edEmailAdress.getText().toString();

                User user = new User(firstName, lastName,emailAddress);
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("user",user);
                startActivity(intent);


            }
        });

    }
}
