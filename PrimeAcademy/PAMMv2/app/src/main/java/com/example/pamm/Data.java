package com.example.pamm;

import android.content.SharedPreferences;

public class Data {
    //Player Data
    public static Integer tier = 0;
    public static String grade = "None";

    //Challenge Data
    public static int nextTier = 0;
    public static int solvedAnswers = 0;
    public static int addBoundValue = 0;
    public static int subBoundValue = 0;
    public static int multiBoundValue = 0;
    public static int divBoundValue = 0;

    public void checkGrade(){
        if(tier == 1){ grade = "K";}
        else if(tier == 2){ grade = "1st";}
        else if(tier == 3){ grade = "2nd";}
        else if(tier >= 40){ grade = "3rd";}
        else if(tier >= 50){ grade = "4th";}
        else{ grade = "";}
        checkNextTier();
    }

    public void checkNextTier(){
        if(tier == 1){ nextTier = 5; addBoundValue = 5;}
        if(tier == 2){ nextTier = 7; addBoundValue = 7;}
        if(tier == 3){ nextTier = 10; addBoundValue = 10;}
        if(tier == 4){ nextTier = 15; addBoundValue =20;}
        if(tier == 4){ nextTier = 15; addBoundValue =20; subBoundValue = 5;}
    }
}