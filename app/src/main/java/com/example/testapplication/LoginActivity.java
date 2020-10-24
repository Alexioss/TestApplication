package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Intent intent = getIntent();
        String firstName = intent.getStringExtra("first_name");
        String lastName = intent.getStringExtra("last_name");
        String email = intent.getStringExtra("email");

        TextView txtFirstName = findViewById(R.id.txtFirstName);
        TextView txtLastName = findViewById(R.id.txtLastName);
        TextView txtEmail = findViewById(R.id.txtEmail);


        txtFirstName.setText("Your first name: " + firstName);
        txtLastName.setText("Your first name: " + lastName);
        txtEmail.setText("Your first name: " + email);
    }
}