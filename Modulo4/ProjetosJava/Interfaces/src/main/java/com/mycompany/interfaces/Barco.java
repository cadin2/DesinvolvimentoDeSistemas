package com.mycompany.interfaces;
public class Barco implements Transporte{
    @Override
    public void mover(){
        System.out.println("o barco esta a nadar");
    }
}
