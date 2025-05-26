package com.mycompany.sobrecargas;
public class Sobrecargas {

    public static void main(String[] args) {
        Mathi cal = new Mathi();
        
        cal.calculo(5);
        cal.calculo(4,6);
        cal.calculo(2,-7,3);
    }
}
