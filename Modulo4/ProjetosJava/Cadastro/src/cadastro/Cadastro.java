package cadastro;

import java.sql.*;

public class Cadastro {
    public static void main(String[] args) {
        AlunoDAO alun = new AlunoDAO();
        Pessoa p = new Pessoa(0,"Carlin", "Taguatinga", "M", "12345678996");
            //criar usuario
//        try {
//            alun.criarPessoa(p);
//            System.out.println("adicionado");
//        } catch (SQLException e) {
//            System.out.println("erro:" + e.getMessage());
//        }
            //deletar usuario
//        try{
//            
//            alun.deletarAluno(1);
//            alun.deletarAluno(2);
//            alun.deletarAluno(3);
//            alun.deletarAluno(4);
//            alun.deletarAluno(5);
//        
//        }catch(SQLException e){
//            System.out.println("Erro: "+e.getMessage());
//        }

        try {
            alun.listarUsuarios();
        } catch (SQLException e) {
            System.out.println("erro: "+e.getMessage());
        }
        
    }
    
}
