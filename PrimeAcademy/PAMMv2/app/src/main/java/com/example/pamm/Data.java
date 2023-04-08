package com.example.pamm;

public class Data {
    public static Integer tier = 1;
    public static String grade = "K";

    public void checkGrade(){
        if(tier == 2){ grade = "1st";}
        if(tier == 3){ grade = "2nd";}
        if(tier >= 40){ grade = "3rd";}
        if(tier >= 50){ grade = "4th";}
    }
}