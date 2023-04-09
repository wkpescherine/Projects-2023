package com.example.pamm;

public class Data {
    public static Integer tier = 1;
    public static String grade = "K";

    public void checkGrade(){
        if(tier == 1){ grade = "K";}
        else if(tier == 2){ grade = "1st";}
        else if(tier == 3){ grade = "2nd";}
        else if(tier >= 40){ grade = "3rd";}
        else if(tier >= 50){ grade = "4th";}
        else{ grade = "";}
    }
}