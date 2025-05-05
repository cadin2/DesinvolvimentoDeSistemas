package com.mycompany.poo1aula;
public class POO1aula {

    public static void main(String[] args) {
        Caneta can = new Caneta();
        
        can.setModel("bic");
        can.setCor("Azul");
        can.setCarga(10);
        can.setPonta(0.5f);
        System.out.println(can.getModel());
        System.out.println(can.getCarga());
        System.out.println(can.getCor());
        System.out.println(can.getPonta());
        
        System.out.println("----------------------------------------------------------------");
        
        Caneta pamonha = new Caneta();
        
        pamonha.setModel("campact");
        pamonha.setCarga(5);
        pamonha.setCor("amarela");
        pamonha.setPonta(0.2f);
        
        System.out.println(pamonha.getModel());
        System.out.println(pamonha.getCarga());
        System.out.println(pamonha.getCor());
        System.out.println(pamonha.getPonta());
    }
}
