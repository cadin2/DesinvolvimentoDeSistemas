/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carlosdaniel;

/**
 *
 * @author ead
 */
public class Triangulo {
    private int a,b,c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    
    public void triangulo(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    
    void verificar(int a, int b, int c){
        if(a == b && b == c && c == a){
            System.out.println("equilatero");
        }
        else if(a == b || b == c || c == a){
            System.out.println("isocelis");
        }
        else{
            System.out.println("escaleno");
        }
    }
}
