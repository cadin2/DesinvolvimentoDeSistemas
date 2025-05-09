package com.mycompany.heranca2;
public class Heranca2 {

    public static void main(String[] args) {
        Pessoa[] aluno = new Pessoa[3];
        
        aluno[0] = new Aluno(2659,"TI","Klisman","M",23);
        System.out.println(aluno[0].toString());
        
        aluno[1] = new Aluno(1658,"ADS","Prodmelo","M",43);
        System.out.println(aluno[1].toString());
        
        aluno[2] = new Aluno(4679,"culinaria","LH","M",13);
        System.out.println(aluno[2].toString());
        
        
        Pessoa[] professor = new Pessoa[3];
        
        professor[0] = new Professor("fisica",2900009000000.00,"kesley","M",20);
        System.out.println(professor[0].toString());
        
        Pessoa[] funcionario = new Pessoa[3];
        funcionario[0] = new Funcionario("cozinha",true,"Yan","M",20);
        System.out.println(funcionario[0].toString());

    }
}
