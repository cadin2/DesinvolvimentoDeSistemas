package com.mycompany.heranca;
public class Professor extends Pessoa{
    private double salario;
    private String especialidade;

    public Professor(double salario, String especialidade, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.salario = salario;
        this.especialidade = especialidade;
    }


    
    
    
    
    public void Aumento(){
        System.out.println("5000,00");
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    
}
