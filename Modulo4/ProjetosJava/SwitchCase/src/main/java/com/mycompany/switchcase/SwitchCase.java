package com.mycompany.switchcase;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class SwitchCase{
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("----------Escolha um dos programas----------");
        System.out.println("      1 - par ou impar");
        System.out.println("      2 - bhaskara");
        System.out.println("      3 - maior idade");
        System.out.println("escolha uma das opcoes>>> ");
        int opcoes = tcl.nextInt();
        switch (opcoes){
            case 1:
                System.out.println("------------------------------");
                System.out.println("|       PAR OU IMPAR          |");
                System.out.println("-------------------------------");
                System.out.println("insira um numero>>> ");
                int numero = tcl.nextInt();
                
                String resposta = (numero%2==0)?"o numero e par":"o numero e impar"; 
                JOptionPane.showMessageDialog(null, resposta, "PAR OU IMPAR", JOptionPane.PLAIN_MESSAGE);
                
                
               
                break;
            case 2:
                System.out.println("------------------------------");
                System.out.println("|       BHASKARA          |");
                System.out.println("-------------------------------");
                System.out.println("insira o coeficient A:");
                int a = tcl.nextInt();
                System.out.println("insira o coeficient B:");
                int b = tcl.nextInt();
                System.out.println("insira o coeficient C:");
                int c = tcl.nextInt();
                
                double delta = Math.pow(b,2) - 4*a*c;
                double x1 = -b + Math.sqrt(delta)/2*a;
                double x2 = -b - Math.sqrt(delta)/2*a;
                
                if(delta < 0){
                    System.out.printf("o delta e menor que zero, logo nao sera possivel prosseguir com o programa");
                }
                else{
                    System.out.printf("Delta: %.2f \nx1: %.2f \nx2: %.2f",delta,x1,x2);
                }
                break;
            case 3:
                System.out.println("------------------------------");
                System.out.println("|       MAIOR IDADE          |");
                System.out.println("-------------------------------");
                System.out.println("Insira a sua idade>>>");
                int idade = tcl.nextInt();
                
                if(idade > 18){
                    System.out.println("Maior de idade fi, seloko ta ruim e velho");
                }
                if(idade > 70){
                    System.out.println("Nao precisa votar");
                }
                else {
                    System.out.println("Menor de idade ainda, calma que voce ta bom e novo");
                }
                break;
                
        }        
    }
}
