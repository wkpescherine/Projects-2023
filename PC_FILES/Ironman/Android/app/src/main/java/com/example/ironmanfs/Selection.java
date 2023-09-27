package com.example.ironmanfs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class Selection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //getSupportActionBar().hide();
        setImage();
    }

    public void setImage(){
        if(GameConfig.league.equals("nfl")){
            ImageView niv1 = findViewById(R.id.logoHeader);
            niv1.setImageResource(R.drawable.nfllogo);
        }
        if(GameConfig.league.equals("nba")){
            ImageView niv2 = findViewById(R.id.logoHeader);
            niv2.setImageResource(R.drawable.nbalogo);
        }
    }

    public void clickDashboard(View v){
        Intent intent = new Intent(this, Dashboard.class);
        startActivity(intent);
    }

    public void clickMarketplace(View v){
        Intent intent = new Intent(this, Marketplace.class);
        startActivity(intent);
    }
}