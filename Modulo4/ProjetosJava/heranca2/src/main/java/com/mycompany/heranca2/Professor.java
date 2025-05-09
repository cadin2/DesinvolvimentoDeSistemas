package com.mycompany.heranca2;
public class Professor extends Pessoa {
    private String especialidade;
    private double salario;

    public Professor(String especialidade, double salario, String nome, String sexo, int idade) {
        super(nome, sexo, idade);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public void receberAum(){
        System.out.println("5000,00");
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + "especialidade=" + especialidade + ", salario=" + salario + '}';
    }
    
    
    
    
}
