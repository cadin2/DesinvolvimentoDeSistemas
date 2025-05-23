package cadastro;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;

//import java.util.*;
//import javax.swing.*;

public class AlunoDAO {
    private Connection con;

    public AlunoDAO() {
        this.con = new CF().ConectDB();
    }
    
    public void criarPessoa(Pessoa pessoa) throws SQLException{
        String sql = "insert into Pessoa(nome,endereco,sexo,cpf)"
                + "values(?,?,?,?);";
        PreparedStatement pstm;
            pstm = null;
        
        try {
            
            pstm = con.prepareStatement(sql);
            
            pstm.setString(1, pessoa.getNome());
            pstm.setString(2, pessoa.getEndereco());
            pstm.setString(3, pessoa.getSexo());
            pstm.setString(4, pessoa.getCpf());
            
            pstm.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Erro: "+e.getMessage());
        } finally {
            if(pstm != null)pstm.close();
        }
    }
    public void deletarAluno(int id) throws SQLException{
        String sql = "delete from Pessoa where id=?";
        
        PreparedStatement pptt;
        pptt = null;
        
        try {
            pptt = con.prepareStatement(sql);
            pptt.setInt(1, id);
            pptt.executeUpdate();
            System.out.println("Aluno foi deletado com sucesso!!");
        } catch (SQLException e) {
            System.out.println("erro: "+e.getMessage());
        } finally{
            if (pptt != null)pptt.close();
        }
        
    }
}