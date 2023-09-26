package com.example.ironmanfs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
    }

    public void clickExit(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void clickSelection(){
        Intent intent = new Intent(this, Selection.class);
        startActivity(intent);
    }
}