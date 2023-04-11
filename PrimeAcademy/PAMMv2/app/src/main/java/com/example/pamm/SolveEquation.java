package com.example.pamm;

public class SolveEquation {
    public Integer basicFormulas(String s, int n1, int n2){
        int value = 0;
        if(s.equals("+")){ value = n1+n2; }
        if(s.equals("-")){ value = n1-n2; }
        if(s.equals("*")){ value = n1*n2; }
        return value;
    }

    public Double basicDivide( int n1 , int n2){
        double value2;
        value2 = (double) n1 / (double) n2;
        return value2;
    }
}
