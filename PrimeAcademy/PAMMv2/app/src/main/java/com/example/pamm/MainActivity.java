package com.example.pamm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

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
        String filename = "PAMM";
        SharedPreferences sharedPreferences = getSharedPreferences(filename,MODE_PRIVATE);
        if(filename.isEmpty()){
            sharedPreferences.Editor 
        }else{

        }
    }

    public void clickToStart(View v){
        Intent intent = new Intent(this, Dashboard.class);
        startActivity(intent);
    }
}