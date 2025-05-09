package com.mycompany.heranca;
public class Funcionario extends Pessoa {
    private String setor;
    private Boolean trabalhando;

    public Funcionario(String setor, Boolean trabalhando, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.setor = setor;
        this.trabalhando = trabalhando;
    }


    
    
    
    public void mudarTrabalho(){
        System.out.println("trabalho mudado com sucessos");
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
    
    
}
