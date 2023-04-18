package com.example.pamm;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

public class Challenge extends AppCompatActivity {
    Data data = new Data();
    SolveEquation solve = new SolveEquation();

    String answer = "";
    double solution = 0;
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

    public void setDataUI(){
        LinearLayout q20Head = findViewById(R.id.q20Header);
        LinearLayout standardHead = findViewById(R.id.standardHeader);
        TextView dataGrade = findViewById(R.id.cgrade);
        TextView dataTier = findViewById(R.id.ctier);
        TextView answersSolved = findViewById(R.id.csolve);
        TextView dataQ20Asked = findViewById(R.id.q20Questions);
        TextView dataq20Correct = findViewById(R.id.q20QuestionsCorrect);
        TextView answerString = findViewById(R.id.answer);
        data.checkNextTier();
        if(data.challengeTier == 1){
            dataTier.setText("Tier: "+ data.tier);
            dataGrade.setText("Grade: "+ data.grade);
            answersSolved.setText("Solved: "+ data.solvedAnswers + " of "+ data.nextTier);
            answerString.setText("");
        }
        if(data.challengeTier == 2){
            dataQ20Asked.setText(data.q20Asked+" of 20");
            dataq20Correct.setText("Correct :"+ data.q20Solved);
            answerString.setText("");
        }
        answer="";
        if(data.challengeTier == 1){
            standardHead.setVisibility(View.VISIBLE);
            q20Head.setVisibility(View.GONE);
            standardGameLogic();
        }
        if(data.challengeTier == 2){
            standardHead.setVisibility(View.GONE);
            q20Head.setVisibility(View.VISIBLE);
            q20GameLogic();
        }
    }

    public void checkSolution(View v){
        data.totalAsked += 1;
        TextView response = findViewById(R.id.cresponse);
        if(answer.equals("")){
            response.setText("No answer");
            if(data.challengeTier == 1){data.solvedAnswers -= 1;}
            if(data.challengeTier == 2){data.q20Solved +=1;}
        } else if(solution == Double.valueOf(answer)){
            response.setText("Correct");
            data.totalCorrect += 1;
            if(data.challengeTier == 1){ data.solvedAnswers += 1;}
            if(data.challengeTier == 2){ data.q20Asked += 1; data.q20Solved +=1;}
        } else {
            response.setText("Incorrect");
            if(data.challengeTier == 1){data.solvedAnswers -= 1;}
            if(data.challengeTier == 2){data.q20Asked +=1;}

        }
        checkTier();
        setDataUI();
    }

    public void standardGameLogic (){
        TextView num1 = findViewById(R.id.number1);
        TextView num2 = findViewById(R.id.number2);
        TextView sym = findViewById(R.id.symbol);
        Random rnd = new Random();
        Integer symbolValue = rnd.nextInt(data.symbolBound);
        String symbolUsed = symbolArray[symbolValue];
        int boundValue = 0;
        if(symbolValue == 0){ boundValue = data.addBoundValue;}
        if(symbolValue == 1){ boundValue = data.subBoundValue;}
        Integer rndNum1 = rnd.nextInt(boundValue)+1;
        Integer rndNum2 = rnd.nextInt(boundValue)+1;
        solution = solve.basicFormulas(symbolUsed, rndNum1, rndNum2);
        sym.setText(symbolUsed);
        num1.setText(rndNum1.toString());
        num2.setText(rndNum2.toString());
    }

    public void q20GameLogic (){
        TextView num1 = findViewById(R.id.number1);
        TextView num2 = findViewById(R.id.number2);
        TextView sym = findViewById(R.id.symbol);
        Random rnd = new Random();
        Integer symbolValue = rnd.nextInt(data.symbolBound);
        String symbolUsed = symbolArray[symbolValue];
        int boundValue = 0;
        if(symbolValue == 0){ boundValue = data.addBoundValue;}
        if(symbolValue == 1){ boundValue = data.subBoundValue;}
        if(symbolValue == 2){ boundValue = data.multiBoundValue;}
        if(symbolValue == 3){ boundValue = data.divBoundValue;}
        Integer rndNum1 = rnd.nextInt(boundValue)+1;
        Integer rndNum2 = rnd.nextInt(boundValue)+1;
        solution = solve.basicFormulas(symbolUsed, rndNum1, rndNum2);
        sym.setText(symbolUsed);
        num1.setText(rndNum1.toString());
        num2.setText(rndNum2.toString());
    }

    public void checkTier(){
        if(data.solvedAnswers == data.nextTier){
            data.tier += 1;
            data.solvedAnswers = 0;
        }
        if(data.solvedAnswers == -1 && data.tier > 1){
            data.tier -= 1;
            data.solvedAnswers = 0;
        }
        data.checkGrade();
        saveData();
    }

    public void saveData(){
        String filename = "PAMM";
        SharedPreferences sp = getSharedPreferences(filename,MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("grade", data.grade);
        editor.putInt("tier", data.tier);
        editor.putInt("totalSolved", data.totalCorrect);
        editor.putInt("totalAsked", data.totalAsked);
        editor.commit();
    }

    public void backToDashboard(View v){
        data.challengeTier = 1 ;
        Intent intent = new Intent(this, Dashboard.class);
        startActivity(intent);
    }
}