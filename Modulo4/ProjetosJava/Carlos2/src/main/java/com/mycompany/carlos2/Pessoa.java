package com.mycompany.carlos2;

import java.time.LocalDate;
import java.time.Period;
import java.io.IOException;

public class Pessoa {
    private String nome,cpf;
    private LocalDate dataNascimento;
    private Double altura, peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    
    public Pessoa(String nome, String cpf, LocalDate dataNascimento, double altura, double peso){
        this.nome= nome;
        this.cpf=cpf;
        this.dataNascimento=dataNascimento;
        this.altura= altura;
        this.peso= peso;
    }
    
    public double calcularIMC(){
        if(altura<=0){
            throw new IllegalArgumentException("Altura deve ser maior que zero:");
        }
        return this.getPeso()/(Math.pow(getAltura(), 2));
    }
    
    public Boolean MaiorIdade(){
        LocalDate hoje = LocalDate.now();
        Period idade = Period.between(this.getDataNascimento(), hoje);
        return idade.getYears() >= 18;
    }
        
}
