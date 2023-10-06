package com.example.ironmanfs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class NFLGameArea extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nflgame_area);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //getSupportActionBar().hide();
        setPlayerNames();
    }

    public void pickPlayer(View v){
        TextView tv = (TextView) v;
        String posSelected = getResources().getResourceEntryName(tv.getId());
        GameConfig.positionSelected = posSelected;
    }

    public void clickSelection(View v){
        GameConfig.positionSelected = "none";
        Intent intent = new Intent(this, Selection.class);
        startActivity(intent);
    }

    public void setPlayerNames(){
        TextView tvqb = findViewById(R.id.player_qb);
        tvqb.setText(GameConfig.NFLqb);
        TextView tvrb1 = findViewById(R.id.player_rb1);
        tvrb1.setText(GameConfig.NFLrb1);
        TextView tvrb2 = findViewById(R.id.player_rb2);
        tvrb2.setText(GameConfig.NFLrb2);
        TextView tvwr1 = findViewById(R.id.player_wr1);
        tvwr1.setText(GameConfig.NFLwr1);
        TextView tvwr2 = findViewById(R.id.player_wr2);
        tvwr2.setText(GameConfig.NFLwr2);
        TextView tvte = findViewById(R.id.player_te);
        tvte.setText(GameConfig.NFLte);
        TextView tvdst = findViewById(R.id.player_dst);
        tvdst.setText(GameConfig.NFLdst);
    }
}