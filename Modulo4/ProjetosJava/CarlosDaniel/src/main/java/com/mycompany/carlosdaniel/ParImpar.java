package com.mycompany.carlosdaniel;
public class ParImpar {
    private int number;
    
    public ParImpar(int number){
        this.number=number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    public void verificar(){
        String resultado = (number%2 == 0)?"par":"impar";
        System.out.println(resultado);
    }
    
}
