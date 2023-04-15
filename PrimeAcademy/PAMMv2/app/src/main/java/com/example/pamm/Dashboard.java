package com.example.pamm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
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
        //LinearLayout standard = findViewById(R.id.standardHeader);
        //LinearLayout q20 = findViewById(R.id.q20Header);
        //standard.setVisibility(View.VISIBLE);
        //q20.setVisibility(View.GONE);
        Intent intent = new Intent(this, Challenge.class);
        startActivity(intent);
    }

    public void clickToProfile(View v){
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }

    public void clickTo20Questions(View v){
        //LinearLayout standard = findViewById(R.id.standardHeader);
        //LinearLayout q20 = findViewById(R.id.q20Header);
        //standard.setVisibility(View.GONE);
        //q20.setVisibility(View.VISIBLE);
        data.specialTier = 500;
        Intent intent = new Intent(this, Challenge.class);
        startActivity(intent);
    }

    public void setDashDataUI(){
        TextView dashDataUsername = findViewById(R.id.username);
        TextView dashDataGrade = findViewById(R.id.dgrade);
        TextView dashDataTier = findViewById(R.id.dtier);
        dashDataUsername.setText(data.username);
        dashDataTier.setText("Tier: "+ data.tier);
        dashDataGrade.setText("Grade: "+ data.grade);
    }

    public void clickToExit(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}