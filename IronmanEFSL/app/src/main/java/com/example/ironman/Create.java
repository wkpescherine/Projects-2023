package com.example.ironman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;

public class Create extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
    }

    public void createAccount(View v){
        EditText username = findViewById(R.id.createUser);
        EditText confirmUser = findViewById(R.id.confirmUser);
        EditText password = findViewById(R.id.createPass);
        EditText confirmPass = findViewById(R.id.confirmPass);
        EditText email = findViewById(R.id.createEmail);

        String usernameStr = username.getText().toString();
        String confirmUserStr = confirmUser.getText().toString();
        String passwordStr = password.getText().toString();
        String confirmPassStr = confirmPass.getText().toString();
        String emailStr = email.getText().toString();
        if(usernameStr.equals(confirmUserStr) && passwordStr.equals(confirmPassStr) && emailStr.length()>0){
            updateData(usernameStr, passwordStr, emailStr);
            Intent intent = new Intent(this, Dashboard.class);
            startActivity(intent);
        }
    }

    public void backToMain(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void updateData(String usernameStr, String passwordStr, String emailStr){
        String filename = "IRONMAN";
        SharedPreferences sp3 = getSharedPreferences(filename,MODE_PRIVATE);
        SharedPreferences.Editor editor3 = sp3.edit();
        editor3.putString("Account", "ACTIVE");
        editor3.putString("Username", usernameStr);
        editor3.putString("Password", passwordStr);
        editor3.putString("Email", emailStr);
        editor3.putInt("Silver", 10);
        editor3.putInt("Gold", 0);
        editor3.putInt("Platnium", 0);
        editor3.commit();
    }
}