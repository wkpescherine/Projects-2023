package com.example.ironman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        checkPref();
    }

    public void checkPref(){
        String filename = "IRONMAN";
        SharedPreferences sp = getSharedPreferences(filename,MODE_PRIVATE);
        if(filename.isEmpty()){
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("Account", "NONE");
            editor.putString("Username", "NONE");
            editor.putString("Password", "NONE");
            editor.putString("Email", "NONE");
            editor.putInt("Silver", 0);
            editor.putInt("Gold", 0);
            editor.putInt("Platnium", 1);
            editor.commit();
        }
    }

    public void Login(View v){
        EditText userEmail = findViewById(R.id.mainUserEmail);
        EditText password = findViewById(R.id.mainPass);
        SharedPreferences sp2 = getSharedPreferences("IRONMAN",MODE_PRIVATE);
        SharedPreferences.Editor editor2 = sp2.edit();
        String savedUser = sp2.getString("Username", "None");
        String savedEmail = sp2.getString("Email", "None");
        String savedPassword = sp2.getString("Password", "None");
        if((savedUser.equals(userEmail)|| savedEmail.equals(userEmail)) && savedPassword.equals(password)){
            Intent intent = new Intent(this, Dashboard.class);
            startActivity(intent);
        }
    }

    public void Create(View v){
        Intent intent = new Intent(this, Create.class);
        startActivity(intent);
    }

    public void Guest(View v){
        Intent intent = new Intent(this, Dashboard.class);
        startActivity(intent);
    }
}