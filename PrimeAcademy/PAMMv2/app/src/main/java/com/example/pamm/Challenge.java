package com.example.pamm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import java.util.Random;

public class Challenge extends AppCompatActivity {
    Data data = new Data();
    String answer = "";
    String question = "";
    Integer solution = 0;
    Integer answerInt = 0;
    Double answerDecimal = 0.000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setDataUI();
    }

    public void handleKeypadNum(View v){
        TextView t = (TextView) v;
        String valueSelect = t.getText().toString();
        if(valueSelect.equals("DEL")){
            valueSelect = "";
            if(answer.length()>=1) {
                answer = answer.substring(0, answer.length()-1);
            }
        }
        answer += valueSelect;
        //data.currentNum += valueSelect;
        //renderSection();
        TextView answerText = findViewById(R.id.answer);
        answerText.setText(answer);
    }

    public void setDataUI(){
        TextView dataGrade = findViewById(R.id.cgrade);
        TextView dataTier = findViewById(R.id.ctier);
        dataTier.setText("Tier: "+ data.tier);
        dataGrade.setText("Grade: "+ data.grade);
        gameLogic();
    }

    public void checkSolution(View v){
        gameLogic();
        setDataUI();
    }

    public void gameLogic (){
        TextView num1 = findViewById(R.id.number1);
        TextView num2 = findViewById(R.id.number2);
        TextView sym = findViewById(R.id.symbol);
        String symbolUsed = "+";
        Random rnd = new Random();
        Integer rndNum1 = rnd.nextInt(10)+1;
        Integer rndNum2 = rnd.nextInt(10)+1;
        if (symbolUsed.equals("+")) {
            solution = rndNum1+rndNum2;
        }
        sym.setText(symbolUsed);
        num1.setText(rndNum1.toString());
        num2.setText(rndNum2.toString());
    }

    public void backToDashboard(View v){
        Intent intent = new Intent(this, Dashboard.class);
        startActivity(intent);
    }
}