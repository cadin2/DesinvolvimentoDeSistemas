package com.mycompany.relacionamento;
public class Professor  {
    String nome;
    Escola escola;

    public Professor(String nome, Escola escola) {
        this.nome = nome;
        this.escola = escola;
    }
    
    void mostrarDados(){
        System.out.println("Professor: " + nome + " Escola: " + escola.nome);
    }
}
