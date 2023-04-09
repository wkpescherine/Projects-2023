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
    //String question = "";
    Integer solution = 0;
    Integer solved = 0;
    Integer addSubBoundValue = 5;
    Integer mulDivBoundValue = 5;
    Integer symbolBound = 0;
    String [] symbolArray = {"+","-","*","/"};

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
        TextView answersSolved = findViewById(R.id.csolve);
        TextView answerString = findViewById(R.id.answer);
        dataTier.setText("Tier: "+ data.tier);
        dataGrade.setText("Grade: "+ data.grade);
        answersSolved.setText("Solved: "+ solved);
        answerString.setText("");
        answer="";
        gameLogic();
    }

    public void checkSolution(View v){
        if(answer.equals("")){ solved -= 1;}
        else if(solution == Integer.valueOf(answer)){
            solved += 1;
        } else { solved -= 1;}
        checkTier();
        gameLogic();
        setDataUI();
    }

    public void gameLogic (){
        TextView num1 = findViewById(R.id.number1);
        TextView num2 = findViewById(R.id.number2);
        TextView sym = findViewById(R.id.symbol);
        //String symbolUsed = "+";
        if(data.tier >= 1){symbolBound = 1;}
        if(data.tier >= 5){symbolBound = 2;}
        if(data.tier >= 15){symbolBound = 3;}
        if(data.tier >= 30){symbolBound = 4;}
        Random rnd = new Random();
        Integer symbolValue = rnd.nextInt(symbolBound);
        String symbolUsed = symbolArray[symbolValue];
        Integer rndNum1 = rnd.nextInt(addSubBoundValue)+1;
        Integer rndNum2 = rnd.nextInt(addSubBoundValue)+1;
        if (symbolUsed.equals("+")) {
            solution = rndNum1+rndNum2;
        }else if( symbolUsed.equals("-")){
            solution = rndNum1 - rndNum2;
        }else if( symbolUsed.equals("*")){
            solution = rndNum1 * rndNum2;
        }
        sym.setText(symbolUsed);
        num1.setText(rndNum1.toString());
        num2.setText(rndNum2.toString());
    }

    public void checkTier(){
        if(solved == 10){
            data.tier += 1;
            solved = 0;
            addSubBoundValue += 5;
        }
        if(solved == -1 && data.tier > 1){
            data.tier -= 1;
            addSubBoundValue -= 5;
            solved = 0;
        }
        data.checkGrade();
    }

    public void backToDashboard(View v){
        Intent intent = new Intent(this, Dashboard.class);
        startActivity(intent);
    }
}