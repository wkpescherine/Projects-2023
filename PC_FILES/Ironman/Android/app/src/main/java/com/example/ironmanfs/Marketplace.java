package com.example.ironmanfs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class Marketplace extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marketplace);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //getSupportActionBar().hide();
        setMarketplaceImage();
    }

    public void setMarketplaceImage(){
        if(GameConfig.league.equals("nfl")){
            ImageView niv1 = findViewById(R.id.mpLogoHeader);
            niv1.setImageResource(R.drawable.nfllogo);
        }
        if(GameConfig.league.equals("nba")){
            ImageView niv2 = findViewById(R.id.mpLogoHeader);
            niv2.setImageResource(R.drawable.nbalogo);
        }
    }

    public void clickToSelection(View v){
        Intent intent = new Intent(this, Selection.class);
        startActivity(intent);
    }
}