package com.mycompany.banco;

import java.util.Scanner;

public class contabanco {
    private String dono;
    private double saldo;
    private Boolean status;
    public int numConta;
    protected int tipo;
    
    Scanner teclado = new Scanner(System.in);
    
    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public contabanco(String dono, double saldo, Boolean status, int numConta, int tipo) {
        this.dono = dono;
        this.saldo = saldo;
        this.status = status;
        this.numConta = numConta;
        this.tipo = tipo;
    }
    
    
    
    public abrirConta(){
        System.out.println("'CC'= Conta Corrente\n'CP'= Conta Poupanca\ninsira o tipo de conta: ");
        String tipoC = teclado.nextLine();
        if( tipoC == "CP"){
            this.getSaldo = saldo += 150;
        }
    }
    
    
    
    public void depositarC(){
        
        int valor = teclado.nextInt();
        
        
        
        }
        
        
    
    }
    
}
