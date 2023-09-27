package com.example.ironmanfs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //getSupportActionBar().hide();
    }

    public void clickExit(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void clickSelection(View v){
        ImageView iv = (ImageView) v;
        String chosenLeague = getResources().getResourceEntryName(iv.getId());
        GameConfig.league = chosenLeague;
        Intent intent = new Intent(this, Selection.class);
        startActivity(intent);
    }
}