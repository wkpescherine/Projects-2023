package com.example.pamm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class Dashboard extends AppCompatActivity {
    Data data = new Data();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        SharedPreferences sp = getSharedPreferences("PAMM", MODE_PRIVATE);
        data.grade = sp.getString("grade", null);
        data.tier = sp.getInt("tier", 0);
        setDashDataUI();

    }

    public void clickToChallenge(View v){
        Intent intent = new Intent(this, Challenge.class);
        startActivity(intent);
    }

    public void setDashDataUI(){
        TextView dashDataGrade = findViewById(R.id.dgrade);
        TextView dashDataTier = findViewById(R.id.dtier);
        dashDataTier.setText("Tier: "+ data.tier);
        dashDataGrade.setText("Grade: "+ data.grade);
    }

    public void clickToExit(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}