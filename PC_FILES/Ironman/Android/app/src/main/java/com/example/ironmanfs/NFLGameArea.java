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
}