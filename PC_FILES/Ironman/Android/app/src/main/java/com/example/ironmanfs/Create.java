package com.example.ironmanfs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;

public class Create extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //getSupportActionBar().hide();
    }

    public void clickMain(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void clickCreate(View v){
        saveData();
        Intent intent = new Intent(this, Dashboard.class);
        startActivity(intent);
    }

    public void saveData(){
        EditText editUserName = findViewById(R.id.editUsername);
        String user = editUserName.getText().toString();
        EditText editPassWord = findViewById(R.id.editPassword);
        String pass = editPassWord.getText().toString();
        EditText editEmail = findViewById(R.id.editEmail);
        String email = editEmail.getText().toString();
        String filename = "PAMM";
        SharedPreferences sp = getSharedPreferences(filename,MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("Account", "Active");
        editor.putString("Username", user);
        editor.putString("Password", pass);
        editor.putString("Email", email);
        editor.commit();
    }
}