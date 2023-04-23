package com.example.pamm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import java.util.Random;

public class ChallengeQ20 extends AppCompatActivity {
    Data data = new Data();
    SolveEquation solve = new SolveEquation();

    String answer = "";
    double solution = 0;
    String [] symbolArray = {"+","-","*","/"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge_q2);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        data.checkNextTier();
        setDataUI();
    }

    public void handleKeypadNum(View v){
        TextView t = (TextView) v;
        TextView clearResponse = findViewById(R.id.cresponse);
        clearResponse.setText("");
        String valueSelect = t.getText().toString();
        if(valueSelect.equals("DELETE")){
            valueSelect = "";
            if(answer.length()>=1) {
                answer = answer.substring(0, answer.length()-1);
            }
        }
        answer += valueSelect;
        TextView answerText = findViewById(R.id.answer);
        answerText.setText(answer);
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

    public void checkSolution(View v){
        data.totalAsked += 1;
        TextView response = findViewById(R.id.cresponse);
        if(answer.equals("")){
            response.setText("No answer");
            data.q20Asked +=1;
        } else if(solution == Double.valueOf(answer)){
            response.setText("Correct");
            data.totalCorrect += 1;
            data.q20Asked += 1;
            data.q20Solved +=1;
        } else {
            response.setText("Incorrect");
            data.q20Asked +=1;
        }
        setDataUI();
    }

    public void setDataUI(){
        TextView dataQ20Asked = findViewById(R.id.q20Questions);
        TextView dataQ20Correct = findViewById(R.id.q20QuestionsCorrect);
        TextView answerQ20String = findViewById(R.id.answer);
        dataQ20Asked.setText(data.q20Asked+" of 20");
        dataQ20Correct.setText("Correct :"+ data.q20Solved);
        answerQ20String.setText("");
        answer="";
        q20GameLogic();

    }
}