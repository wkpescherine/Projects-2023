package com.example.pamm;

public class Data {
    public static Integer tier = 0;
    public static String grade = "k";

    public void checkTier(){
        if(tier >= 10){ grade = "1st";}
        if(tier >= 20){ grade = "2nd";}
        if(tier >= 30){ grade = "3rd";}
        if(tier >= 40){ grade = "4th";}
    }
}