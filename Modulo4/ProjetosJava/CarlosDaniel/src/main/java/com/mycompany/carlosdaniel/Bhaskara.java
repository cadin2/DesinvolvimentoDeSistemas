package com.mycompany.carlosdaniel;
public class Bhaskara {
    private double a,b,c;
    
    public Bhaskara(double a ,double b ,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void resolver(){
        double delta = Math.pow(2, getB()) - 4*getA()*getC();
        
        if (delta < 0){
            System.out.println("nao existe raiz");
        }
        else if (delta == 0){
            double x = -getB() + Math.sqrt(delta)/2*getA();
            System.out.format("as raizes sao iguais: %.2f ",x);
        }
        else{
           double x1 = -getB() + Math.sqrt(delta)/2;
           double x2 = -getB() - Math.sqrt(delta)/2;
           
            System.out.format("delta: %.2f\nx1: %.2f\nx2: %.2f",delta,x1,x2);
        }
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}



