package com.mycompany.interfaces;
public class Interfaces {

    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------");
        Transporte uno = new Carro();
        uno.mover();
        System.out.println("-------------------------------------------------------");
        
        Transporte camarao = new Barco();
        camarao.mover();
        System.out.println("-------------------------------------------------------");
        
        Transporte pompom = new Aviao();
        pompom.mover();
        System.out.println("-------------------------------------------------------");
    }
}
