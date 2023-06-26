package com.example.ironman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setUI();
    }

    public void nbaList(View v){
        Intent intent = new Intent(this, NBAList.class);
        startActivity(intent);
    }

    public void Logout(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void setUI(){
        TextView dashUserName = findViewById(R.id.dashUsername);
        TextView dashSilver = findViewById(R.id.silver);
        TextView dashGold = findViewById(R.id.gold);
        TextView dashPlat = findViewById(R.id.plat);
        SharedPreferences sp3 = getSharedPreferences("IRONMAN",MODE_PRIVATE);
        String savedUserName = sp3.getString("Username", "");
        int savedSilver = sp3.getInt("Silver", 0);
        int savedGold = sp3.getInt("Gold", 0);
        int savedPlat = sp3.getInt("Platnium", 0);
        dashUserName.setText(savedUserName);
        dashSilver.setText("Silver: " + savedSilver);
        dashGold.setText("Gold: " + savedGold);
        dashPlat.setText("Plat: " + savedPlat);
    }
}