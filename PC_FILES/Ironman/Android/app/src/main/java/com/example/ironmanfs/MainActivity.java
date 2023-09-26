package com.example.ironmanfs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        checkPref();
    }

    private void checkPref() {
        String filename = "IRONMAN";
        SharedPreferences sp = getSharedPreferences(filename,MODE_PRIVATE);
        if(filename.isEmpty()){
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("Account", "NONE");
            editor.putString("Username", "NONE");
            editor.putString("Password", "NONE");
            editor.putString("Email", "NONE");
            editor.putInt("Silver", 0);
            editor.putInt("Gold", 0);
            editor.putInt("Platnium", 0);
            editor.commit();
        }
    }

    public void clickLogin(){
        Intent intent = new Intent(this, Dashboard.class);
        startActivity(intent);
    }
}