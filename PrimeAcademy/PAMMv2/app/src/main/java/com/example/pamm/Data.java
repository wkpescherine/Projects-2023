package com.example.pamm;

import android.content.SharedPreferences;

public class Data {
    //Player Data
    public static String username = "Guest";
    public static Integer tier = 0;
    public static String grade = "None";
    public static int totalCorrect = 0;
    public static int TotalAsked = 0;
    public static int specialTier = 0;
    public static int q20Asked = 0;
    public static int q20Solved = 0;
    public static int q20Points = 0;

    //Challenge Data
    public static int symbolBound = 0;
    public static int nextTier = 0;
    public static int solvedAnswers = 0;
    public static int addBoundValue = 0;
    public static int subBoundValue = 0;
    public static int multiBoundValue = 0;
    public static int divBoundValue = 0;

    public void checkGrade(){
        if(tier >= 1){ grade = "K";}
        else if(tier >= 11){ grade = "1st";}
        else if(tier >= 21){ grade = "2nd";}
        else if(tier >= 31){ grade = "3rd";}
        else if(tier >= 41){ grade = "4th";}
        else{ grade = "";}
        checkNextTier();
    }

    public void checkNextTier(){
        if(tier == 1){ nextTier = 5; addBoundValue = 5; symbolBound = 1;}
        if(tier == 2){ nextTier = 7; addBoundValue = 7;}
        if(tier == 3){ nextTier = 10; addBoundValue = 10;}
        if(tier == 4){ nextTier = 12; addBoundValue = 15;}
        if(tier == 5){ nextTier = 15; subBoundValue = 5; symbolBound = 2;}
        if(tier == 6){ nextTier = 17; subBoundValue = 7; }
        if(tier == 7){ nextTier = 20; subBoundValue = 10;}
        if(tier == 8){ nextTier = 20; subBoundValue = 15;}
        if(tier == 9){ nextTier = 20; addBoundValue = 20;}
        if(tier == 10){ nextTier = 20; subBoundValue = 20;}
        if(specialTier == 500){
            addBoundValue = 1000;
            subBoundValue = 1000;
            multiBoundValue = 100;
            divBoundValue=100;
            symbolBound=4;
        }
    }
}