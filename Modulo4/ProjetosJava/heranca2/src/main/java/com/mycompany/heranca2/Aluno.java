/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heranca2;

/**
 *
 * @author ead
 */
public class Aluno extends Pessoa{
    private int matr;
    private String curso;

    public Aluno(int matr, String curso, String nome, String sexo, int idade) {
        super(nome, sexo, idade);
        this.matr = matr;
        this.curso = curso;
    }


    
    public void cancelMatric(){
        System.out.println("Matricula cancelada...");
    }

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() + "matr=" + matr + ", curso=" + curso + '}';
    }
    
    
    
    
    
    
}
