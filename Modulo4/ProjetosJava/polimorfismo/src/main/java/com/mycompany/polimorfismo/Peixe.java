package com.mycompany.polimorfismo;
public class Peixe extends Animal{
    private  String corEscama;

    public Peixe(String corEscama, double peso, int idade, int membros) {
        super(peso, idade, membros);
        this.corEscama = corEscama;
    }


    public void soltarBolha(){
        System.out.println("blo blo blo blo blo ");
    }

    @Override
    public void locomover() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void alimentar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void emititirSom() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return super.toString() + "corEscama=" + corEscama + '}';
    }
    
}
