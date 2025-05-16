/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.relacionamento;

/**
 *
 * @author ead
 */
public class Relacionamento {

    public static void main(String[] args) {
        Escola escola = new Escola("Escola de xique xique bahia");
        
        Professor prof = new Professor("pamonhudo",escola);
        prof.mostrarDados();
        
        Universidade univ = new Universidade("Abusadores demais");
        
        Aluno a1 = new Aluno("Daniel Alves");
        Aluno a2 = new Aluno("Robinho");
        univ.addAluno(a1);
        univ.addAluno(a2);
        univ.listarAlunos();
        
        Corpo corpo = new Corpo();
        corpo.viver();
    }
}
