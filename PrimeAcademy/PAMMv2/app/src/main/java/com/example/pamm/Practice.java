package com.example.pamm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class Practice extends AppCompatActivity {
    String answer = "";

    int practiceTier = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
    }

    public void handleKeypadNum(View v){
        TextView t = (TextView) v;
        TextView clearResponse = findViewById(R.id.cresponse);
        clearResponse.setText("");
        String valueSelect = t.getText().toString();
        if(valueSelect.equals("DEL")){
            valueSelect = "";
            if(answer.length()>=1) {
                answer = answer.substring(0, answer.length()-1);
            }
        }
        answer += valueSelect;
        TextView answerText = findViewById(R.id.answer);
        answerText.setText(answer);
    }

    public void decreaseTier(){
        if(practiceTier >1){ practiceTier -= 1;}
    }

    public void increaseTier(){
        if(practiceTier < 70){ practiceTier +=1;}
    }
}