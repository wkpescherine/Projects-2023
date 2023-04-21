package com.example.pamm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

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

    }
}