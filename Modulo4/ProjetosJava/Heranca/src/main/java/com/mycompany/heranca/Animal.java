package com.mycompany.heranca;
public class Animal {
    protected String nome;
    
    public void emitirsom(){
        System.out.println("o animal faz um som...");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
