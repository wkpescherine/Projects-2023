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
        TextView proDataQ20HS = findViewById(R.id.q20High);
        TextView proDataHighestTier = findViewById(R.id.pHighestTier);
        proDataUsername.setText(pdata.username);
        double solvedPercent = 0;
        if( Data.totalAsked != 0) {
            solvedPercent = ((double)Data.totalCorrect / (double)Data.totalAsked)*100;
        }
        proDataSolved.setText("Total Correct Answers: "+ Data.totalCorrect);
        proDataAsked.setText("Total Questions Asked: "+ Data.totalAsked);
        //proDataPercent.setText("Percent Correct Answers : "+ String.format("%2.f",solvedPercent) + "%");
        proDataPercent.setText("Percent Correct Answers : "+ solvedPercent + "%");
        proDataQ20HS.setText("20 Questions High Score: " + Data.q20HighestScore);
        proDataHighestTier.setText("Highest Tier: " + Data.highestTier);
    }

    public void backToDashboard(View v){
        Intent intent = new Intent(this, Dashboard.class);
        startActivity(intent);
    }
}