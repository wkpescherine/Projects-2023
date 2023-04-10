package com.example.pamm;

public class SolveEquation {
    public Integer basicFormulas(String s, int n1, int n2){
        Integer value = 0;
        if(s.equals("+")){ value = n1+n2; }
        if(s.equals("-")){ value = n1-n2; }
        if(s.equals("*")){ value = n1*n2; }
        return value;
    }
}
