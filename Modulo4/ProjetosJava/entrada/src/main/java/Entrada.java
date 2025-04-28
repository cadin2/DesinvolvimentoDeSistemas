package com.mycompany

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        Scanner maca = new Scanner(System.in);
        System.out.println("ola digite seu nome: ");
        String nome = maca.nextLine();
        System.out.printf("ola %s seja bem vindo arrombado", nome);
    }
}
