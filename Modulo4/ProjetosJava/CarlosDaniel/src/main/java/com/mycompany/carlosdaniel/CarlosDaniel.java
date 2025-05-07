package com.mycompany.carlosdaniel;
import java.util.Scanner;
public class CarlosDaniel {

    public static void main(String[] args) {
        Scanner tlc = new Scanner(System.in);
        
        System.out.println("-----escolha uma opcao-----");
        System.out.println("     1-bhaskara            ");
        System.out.println("     2-par ou impar        ");
        System.out.println("     3-triangulo           ");
        System.out.println("---------------------------");
        
        int opcao = tlc.nextInt();
        switch (opcao) {
                case 1 -> {
                    Bhaskara pum = new Bhaskara();
                    System.out.println("digite o coeficiente A>>> ");
                    double a = tlc.nextDouble();
                    System.out.println("digite o coeficiente B>>> ");
                    double b = tlc.nextDouble();
                    System.out.println("digite o coeficiente C>>> ");
                    double c = tlc.nextDouble();
                    
                    pum.resolver(a,b,c);
                }
                case 2 -> {
                    System.out.println("digite o numero>>> ");
                    int numero = tlc.nextInt(); 
                    ParImpar n1 = new ParImpar(numero);
                    
                    n1.verificar();
                    
                }
                case 3 ->{
                    Triangulo lado = new Triangulo();
                    System.out.println("digite um numero>>> ");
                    int a = tlc.nextInt();
                    System.out.println("digite um numero>>> ");
                    int b = tlc.nextInt();
                    System.out.println("digite um numero>>> ");
                    int c = tlc.nextInt();
                    lado.verificar(a,b,c);
                    
                }


        }            
    }
}

