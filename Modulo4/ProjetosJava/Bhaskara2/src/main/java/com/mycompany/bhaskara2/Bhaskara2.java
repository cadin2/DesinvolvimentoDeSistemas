package com.mycompany.bhaskara2;
public class Bhaskara2 {
static void bhas(double a,double b, double c){
    double delta = Math.pow(b,2) - 4*a*c;
    double x1 = -b + Math.sqrt(delta)/2*a;
    double x2 = -b - Math.sqrt(delta)/2*a;
    if (delta < 0){
        System.out.println("o delta nao pode ser calculado a raiz");
    } 
    else{
    System.out.format("delta: %f\nx1: %f\nx2: %f\n",delta,x1,x2);

    }
}
    public static void main(String[] args) {
        bhas(4,3,4);
    }
}
