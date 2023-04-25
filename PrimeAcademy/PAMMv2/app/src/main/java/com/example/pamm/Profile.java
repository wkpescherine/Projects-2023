package com.example.pamm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class Profile extends AppCompatActivity {
    Data pdata = new Data();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setProfileUI();
    }

    public void setProfileUI(){
        TextView proDataUsername = findViewById(R.id.pusername);
        TextView proDataSolved = findViewById(R.id.pSolved);
        TextView proDataAsked = findViewById(R.id.pAsked);
        TextView proDataPercent = findViewById(R.id.pPercent);
        proDataUsername.setText(pdata.username);
        double solvedPercent = 0;
        if( Data.totalAsked != 0) {
            solvedPercent = ((double)Data.totalCorrect / (double)Data.totalAsked)*100;
        }
        proDataSolved.setText("Total Correct Answers: "+ pdata.totalCorrect);
        proDataAsked.setText("Total Questions Asked: "+ pdata.totalAsked);
        proDataPercent.setText("Percent Correct Answers : "+ solvedPercent + "%");
    }

    public void backToDashboard(View v){
        Intent intent = new Intent(this, Dashboard.class);
        startActivity(intent);
    }
}