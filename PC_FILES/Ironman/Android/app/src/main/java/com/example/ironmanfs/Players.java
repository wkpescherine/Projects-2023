package com.example.ironmanfs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class Players extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //getSupportActionBar().hide();
        buildPlayerFeed();
    }

    public void buildPlayerFeed(){
        if(GameConfig.league.equals("nfl")){
            ImageView niv1 = findViewById(R.id.pfLogoHeader);
            niv1.setImageResource(R.drawable.nfllogo);
        }
        setPositionTitle();
    }

    public void toSelection(View v){
        if(GameConfig.league.equals("NFL")) {
            Intent intent = new Intent(this, NFLGameArea.class);
            startActivity(intent);
        }
    }

    public void setPositionTitle(){
        TextView tv = findViewById(R.id.position_title);
        if(GameConfig.positionSelected.equals("player_qb")){
            tv.setText("QB");
        }
        if(GameConfig.positionSelected.equals("player_rb1")){
            tv.setText("RB1");
        }
        if(GameConfig.positionSelected.equals("player_rb2")){
            tv.setText("RB2");
        }
        if(GameConfig.positionSelected.equals("player_wr1")){
            tv.setText("WR1");
        }
        if(GameConfig.positionSelected.equals("player_wr2")){
            tv.setText("WR2");
        }
        if(GameConfig.positionSelected.equals("player_qb")){
            tv.setText("TE");
        }
        if(GameConfig.positionSelected.equals("player_qb")){
            tv.setText("D/ST");
        }
    }
}