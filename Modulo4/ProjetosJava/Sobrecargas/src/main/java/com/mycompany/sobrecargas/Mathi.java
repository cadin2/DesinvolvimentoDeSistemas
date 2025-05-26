package com.mycompany.sobrecargas;

import java.io.PrintStream;

public class Mathi {
    
    String calculo(int a){
        return (a%2 == 0)?"PAR":"IMPAR";
    }
    
    int calculo(int a, int b){
        return a+b;
    }
    
    void calculo(int a, int b, int c){
        double delta = Math.pow(b,2) -4*a*c;
        double x1 = (-b + Math.sqrt(delta));
        double x2 = (-b - Math.sqrt(delta));
        String result = Integer.toString((int) x1);
        String result2 = Integer.toString((int) x2);
        System.out.format("Delta: %1.f\nx1: %1.f\nx2: %1.f",delta,x1,x2);
    }
    
}
