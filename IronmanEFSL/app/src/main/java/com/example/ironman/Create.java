package com.example.ironman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

    public void onCreate(View v){
        EditText username = findViewById(R.id.createUser);
        EditText password = findViewById(R.id.createPass);
        EditText email = findViewById(R.id.createEmail);
        Intent intent = new Intent(this, Dashboard.class);
        startActivity(intent);
    }

    public void backToMain(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}