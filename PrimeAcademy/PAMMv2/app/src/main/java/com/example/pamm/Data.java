package com.example.pamm;

import android.content.SharedPreferences;

public class Data {
    //Player Data
    public static String username = "Guest";
    public static Integer tier = 0;
    public static String grade = "None";
    public static int totalCorrect = 0;
    public static int totalAsked = 0;
    public static int q20HighestScore = 0;
    public static String challengeTier = "";
    public static int q20Asked = 0;
    public static int q20Solved = 0;
    public static int q20Points = 0;

    //Challenge Data
    public static int [] challengeValues = {0,0,0,0,0,0};
    public static int symbolBound = 0;
    public static int operationsBound = 0;
    public static int nextTier = 0;
    public static int solvedAnswers = 0;
    public static int addBoundValue = 0;
    public static int subBoundValue = 0;
    public static int multiBoundValue = 0;
    public static int divBoundValue = 0;

    //Formula Data
    //public static String [] symbolArray = {"+","-","*","/"};
    public static String symbolUsed = "";
    public static String formulaString = "";
    public static int solution = 0;

    public void checkGrade(){
        if(tier <= 10){ grade = "K";}
        else if(tier <= 20){ grade = "1st";}
        else if(tier <= 30){ grade = "2nd";}
        else if(tier <= 40){ grade = "3rd";}
        else if(tier <= 50){ grade = "4th";}
        else if(tier <= 60){ grade = "5th";}
        else if(tier <= 70){ grade = "6th";}
        checkNextTier();
    }

    public void checkNextTier(){
        //challengeValues [symbolBound,operationsBound,nextTier,addBoundValue, subBoundValue]
        //Kindergarten Tier
        if(tier == 1){ challengeValues = new int[]{1, 1, 5, 5, 0, 0, 0};}
        if(tier == 2){ challengeValues = new int[]{1, 1, 7, 5, 0, 0, 0};}
        if(tier == 3){ challengeValues = new int[]{1, 1, 10, 5, 0, 0, 0};}
        if(tier == 4){ challengeValues = new int[]{1, 1, 10, 7, 0, 0, 0};}
        if(tier == 5){ challengeValues = new int[]{2, 1, 12, 7, 3, 0, 0};}
        if(tier == 6){ challengeValues = new int[]{2, 1, 12, 7, 5, 0, 0};}
        if(tier == 7){ challengeValues = new int[]{2, 1, 15, 7, 5, 0, 0};}
        if(tier == 8){ challengeValues = new int[]{2, 1, 15, 7, 7, 0, 0};}
        if(tier == 9){ challengeValues = new int[]{2, 1, 15, 10, 7, 0, 0};}
        if(tier == 10){ challengeValues = new int[]{2, 1,15, 10, 10, 0, 0};}
        //1st Grade Tier
        if(tier == 11){ challengeValues = new int[]{1, 1, 5, 7, 0, 0, 0};}
        if(tier == 12){ challengeValues = new int[]{1, 1, 7, 7, 0, 0, 0};}
        if(tier == 13){ challengeValues = new int[]{1, 1, 10, 7, 0, 0, 0};}
        if(tier == 14){ challengeValues = new int[]{1, 1, 10, 10, 0, 0, 0};}
        if(tier == 15){ challengeValues = new int[]{2, 1, 12, 10, 5, 0, 0};}
        if(tier == 16){ challengeValues = new int[]{2, 1, 12, 10, 7, 0, 0};}
        if(tier == 17){ challengeValues = new int[]{2, 1, 15, 10, 7, 0, 0};}
        if(tier == 18){ challengeValues = new int[]{2, 1, 15, 10, 10, 0, 0};}
        if(tier == 19){ challengeValues = new int[]{2, 1, 15, 15, 10, 0, 0};}
        if(tier == 20){ challengeValues = new int[]{2, 1, 15, 15, 15, 0, 0};}
        //2nd Grade Tier
        if(tier == 21){ challengeValues = new int[]{2, 1, 5, 15, 10, 0, 0};}
        if(tier == 22){ challengeValues = new int[]{2, 1, 7, 15, 10, 0, 0};}
        if(tier == 23){ challengeValues = new int[]{2, 1, 10, 15, 10, 0, 0};}
        if(tier == 24){ challengeValues = new int[]{2, 1, 10, 20, 10, 0, 0};}
        if(tier == 25){ challengeValues = new int[]{2, 1, 12, 20, 10, 0, 0};}
        if(tier == 26){ challengeValues = new int[]{2, 1, 12, 20, 15, 0, 0};}
        if(tier == 27){ challengeValues = new int[]{2, 1, 15, 20, 15, 0, 0};}
        if(tier == 28){ challengeValues = new int[]{2, 1, 15, 20, 20, 0, 0};}
        if(tier == 29){ challengeValues = new int[]{2, 1, 15, 25, 20, 0, 0};}
        if(tier == 30){ challengeValues = new int[]{2, 1, 15, 25, 25, 0, 0};}
        //3nd Grade Tier
        if(tier == 31){ challengeValues = new int[]{2, 1, 5, 25, 20, 0, 0};}
        if(tier == 32){ challengeValues = new int[]{2, 1, 7, 25, 20, 0, 0};}
        if(tier == 33){ challengeValues = new int[]{2, 1, 10, 25, 20, 0, 0};}
        if(tier == 34){ challengeValues = new int[]{2, 1, 10, 30, 20, 0, 0};}
        if(tier == 35){ challengeValues = new int[]{2, 1, 12, 30, 20, 0, 0};}
        if(tier == 36){ challengeValues = new int[]{2, 1, 12, 30, 25, 0, 0};}
        if(tier == 37){ challengeValues = new int[]{2, 1, 15, 30, 25, 0, 0};}
        if(tier == 38){ challengeValues = new int[]{3, 1, 15, 30, 30, 5, 0};}
        if(tier == 39){ challengeValues = new int[]{3, 1, 15, 40, 30, 5, 0};}
        if(tier == 40){ challengeValues = new int[]{3, 1, 15, 40, 40, 10, 0};}
        //4th Grade Tier
        if(tier == 31){ challengeValues = new int[]{2, 1, 5, 25, 25, 0, 0};}
        if(tier == 32){ challengeValues = new int[]{2, 1, 7, 30, 25, 0, 0};}
        if(tier == 33){ challengeValues = new int[]{2, 1, 10, 30, 30, 0, 0};}
        if(tier == 34){ challengeValues = new int[]{3, 1, 10, 35, 30, 3, 0};}
        if(tier == 35){ challengeValues = new int[]{3, 1, 12, 35, 35, 5, 0};}
        if(tier == 36){ challengeValues = new int[]{3, 1, 12, 40, 35, 5, 0};}
        if(tier == 37){ challengeValues = new int[]{3, 1, 15, 40, 40, 7, 0};}
        if(tier == 38){ challengeValues = new int[]{3, 1, 15, 45, 40, 7, 0};}
        if(tier == 39){ challengeValues = new int[]{4, 1, 15, 45, 45, 7, 3};}
        if(tier == 40){ challengeValues = new int[]{4, 1, 15, 50, 50, 10, 5};}
        //All The challenge tiers will be in this area
        //challengeValues [symbolBound,nextTier,addBoundValue, subBoundValue]
        if(challengeTier.equals("Q20")){ challengeValues = new int[]{4,1,20,1000,1000,100,100};}
        //Setting the game stats/data to allow the game logic to build and solve formulas
        symbolBound = challengeValues[0];
        operationsBound = challengeValues[1];
        nextTier = challengeValues[2];
        addBoundValue = challengeValues[3];
        subBoundValue = challengeValues[4];
        multiBoundValue = challengeValues[5];
        divBoundValue = challengeValues[6];
    }
}