package com.example.pfs_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        checkPref();
        checkStatus();
    }

    public void checkPref(){
        String filename = "PAMM";
        SharedPreferences sp = getSharedPreferences(filename,MODE_PRIVATE);
        if(filename.isEmpty()){
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("status", "inactive");
            editor.putString("Username", "");
            editor.putString("password", "");
            editor.putString("Education", "");
            editor.putInt("Age", 0);
            editor.putInt("cashOnHand", 0);
            editor.putInt("timeSpeed", 24);
            editor.commit();
        }
    }

    public void checkStatus(){
        SharedPreferences sp = getSharedPreferences("PAMM", MODE_PRIVATE);
        String currentStatus = sp.getString("status", null);
        LinearLayout login = findViewById(R.id.loginInfo);
        Button create = findViewById(R.id.create);
        Button enter = findViewById(R.id.login);
        if( currentStatus.equals("active")){
            login.setVisibility(View.VISIBLE);
            create.setVisibility(View.GONE);
            enter.setVisibility(View.VISIBLE);
        }else {
            login.setVisibility(View.GONE);
            create.setVisibility(View.VISIBLE);
            enter.setVisibility(View.GONE);
        }
    }

    public void createAccount(View v){}

    public void login(View v){}
}