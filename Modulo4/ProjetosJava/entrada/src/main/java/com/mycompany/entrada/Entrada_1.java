package com.mycompany.entrada;

import java.util.Scanner;

/**
 *
 * @author ead
 */
public class Entrada_1 {

    public static void main(String[] args) {
        Scanner maca = new Scanner(System.in);
        System.out.println("ola digite seu nome: ");
        String nome = maca.nextLine();
        System.out.printf("ola %s seja bem vindo arrombado", nome);
    }
}
