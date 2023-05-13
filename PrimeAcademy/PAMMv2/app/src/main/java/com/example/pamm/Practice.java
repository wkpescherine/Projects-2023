package com.example.pamm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class Practice extends AppCompatActivity {
    String answer = "";

    Data pracData = new Data();
    FormulaBuilder pracFormulaBuilder = new FormulaBuilder();

    int practiceTier = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        practiceGameLogic();
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

    public void practiceGameLogic(){
        pracData.checkNextTier();
        pracFormulaBuilder.builder();
    }
    public void checkPracSolution(){
        TextView response = findViewById(R.id.cresponse);
        if(answer.equals(Data.solution)){
            response.setText("Correct");
        } else {
            response.setText("Incorrect! The answer is " + Data.solution);
        }
    }

    public void decreaseTier(View v){
        if(practiceTier > 1){practiceTier -= 1;}
    }

    public void increaseTier(View v){
        if(practiceTier <= Data.highestTier){ practiceTier +=1;}
    }
}