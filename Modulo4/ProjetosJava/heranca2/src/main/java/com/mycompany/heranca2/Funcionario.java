package com.mycompany.heranca2;
public class Funcionario extends Pessoa {
    private String setor;
    private Boolean trabalhando;

    public Funcionario(String setor, Boolean trabalhando, String nome, String sexo, int idade) {
        super(nome, sexo, idade);
        this.setor = setor;
        this.trabalhando = trabalhando;
    }
    
    public void mudarTrabalho(){
        System.out.println("trabalho mudado com sucesso");
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(Boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    @Override
    public String toString() {
        return super.toString() + "setor=" + setor + ", trabalhando=" + trabalhando + '}';
    }
    
    
    
}
