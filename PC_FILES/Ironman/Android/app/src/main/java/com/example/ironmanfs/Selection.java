package com.example.ironmanfs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

public class Selection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
    }

    public void clickDashboard(){
        Intent intent = new Intent(this, Dashboard.class);
        startActivity(intent);
    }

    public void clickMarketplace(){
        Intent intent = new Intent(this, Marketplace.class);
        startActivity(intent);
    }
}