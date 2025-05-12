package com.mycompany.polimorfismo;
public abstract class Animal {
    private double peso;
    private int idade, menbros;

    public Animal(double peso, int idade, int membros) {
        this.peso = peso;
        this.idade = idade;
        this.menbros = membros;
    }
    
    public abstract void locomover();
    
    public abstract void alimentar();
    
    public abstract void emititirSom();

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMenbros() {
        return menbros;
    }

    public void setMenbros(int menbros) {
        this.menbros = menbros;
    }

    @Override
    public String toString() {
        return super.toString() + "peso=" + peso + ", idade=" + idade + ", menbros=" + menbros + '}';
    }
    

    
}
