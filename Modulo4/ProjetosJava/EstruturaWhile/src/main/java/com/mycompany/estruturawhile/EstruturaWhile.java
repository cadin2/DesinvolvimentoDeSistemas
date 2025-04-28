package com.mycompany.estruturawhile;
public class EstruturaWhile {
    public static void main(String[] args) {
        int cont = 0;
        while (cont <= 10){
        cont = cont+1;
        if (cont == 6 && cont == 8){
            continue;
        }
        System.out.printf("x:%d\n", cont);
        }
    }
}
