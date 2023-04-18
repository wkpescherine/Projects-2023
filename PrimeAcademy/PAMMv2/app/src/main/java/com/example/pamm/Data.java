package com.example.pamm;

import android.content.SharedPreferences;

public class Data {
    //Player Data
    public static String username = "Guest";
    public static Integer tier = 0;
    public static String grade = "None";
    public static int totalCorrect = 0;
    public static int totalAsked = 0;
    public static int challengeTier = 1;
    public static int q20Asked = 0;
    public static int q20Solved = 0;
    public static int q20Points = 0;

    //Challenge Data
    public static int [] challengeValues = {0,0,0,0,0,0};
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
        //challengeValues [symbolBound,nextTier,addBoundValue, subBoundValue]
        //Kindergarten Tier
        if(tier == 1){ challengeValues = new int[]{1, 5, 5, 0, 0, 0};}
        if(tier == 2){ challengeValues = new int[]{1, 7, 7, 0, 0, 0};}
        if(tier == 3){ challengeValues = new int[]{1, 10, 10, 0, 0, 0};}
        if(tier == 4){ challengeValues = new int[]{1, 15, 15, 0, 0, 0};}
        if(tier == 5){ challengeValues = new int[]{2, 15, 15, 5, 0, 0};}
        if(tier == 6){ challengeValues = new int[]{2, 17, 15, 7, 0, 0};}
        if(tier == 7){ challengeValues = new int[]{2, 20, 15, 10, 0, 0};}
        if(tier == 8){ challengeValues = new int[]{2, 20, 15, 15, 0, 0};}
        if(tier == 9){ challengeValues = new int[]{2, 20, 20, 15, 0, 0};}
        if(tier == 10){ challengeValues = new int[]{2, 20, 20, 20, 0, 0};}
        //1st Grade Tier
        if(tier == 11){ nextTier = 5; addBoundValue = 10; symbolBound = 1;}
        if(tier == 12){ nextTier = 7; addBoundValue = 15;}
        if(tier == 13){ nextTier = 10; addBoundValue = 20;}
        if(tier == 14){ nextTier = 12; subBoundValue = 10; symbolBound = 2;}
        if(tier == 15){ nextTier = 15; subBoundValue = 15;}
        if(tier == 16){ nextTier = 17; subBoundValue = 20;}
        if(tier == 17){ nextTier = 20; addBoundValue = 25; subBoundValue = 25;}
        if(tier == 18){ nextTier = 22; addBoundValue = 30; subBoundValue = 30;}
        if(tier == 19){ nextTier = 25; addBoundValue = 35; subBoundValue = 35;}
        if(tier == 20){ nextTier = 25; addBoundValue = 40; subBoundValue = 40;}
        //2nd Grade Tier
        if(tier == 21){ nextTier = 5; addBoundValue = 10; subBoundValue = 10; symbolBound = 2;}
        if(tier == 22){ nextTier = 7; addBoundValue = 20; subBoundValue = 20; }
        if(tier == 23){ nextTier = 10; addBoundValue = 30; subBoundValue = 30; }
        if(tier == 24){ nextTier = 12; addBoundValue = 40; subBoundValue = 40; }
        if(tier == 25){ nextTier = 15; addBoundValue = 50; subBoundValue = 50; }
        if(tier == 26){ nextTier = 17; addBoundValue = 60; subBoundValue = 60; }
        if(tier == 27){ nextTier = 20; addBoundValue = 70; subBoundValue = 70; }
        if(tier == 28){ nextTier = 22; addBoundValue = 80; subBoundValue = 80; }
        if(tier == 29){ nextTier = 25; addBoundValue = 90; subBoundValue = 90; }
        if(tier == 30){ nextTier = 25; addBoundValue = 100; subBoundValue = 100; }
        if(challengeTier == 2){ challengeValues = new int[]{4,20,1000,1000,100,100};}
        //challengeValues [symbolBound,nextTier,addBoundValue, subBoundValue]
        symbolBound = challengeValues[0];
        nextTier = challengeValues[1];
        addBoundValue = challengeValues[2];
        subBoundValue = challengeValues[3];
        multiBoundValue = challengeValues[4];
        divBoundValue = challengeValues[5];
    }
}