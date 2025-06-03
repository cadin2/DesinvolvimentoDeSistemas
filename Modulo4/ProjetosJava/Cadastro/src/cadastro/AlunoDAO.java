package cadastro;

import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;

public class AlunoDAO {
    private Connection con;

    public AlunoDAO(Connection con) {
        this.con = new CF().ConectDB();
    }

    public AlunoDAO() {
        this.con = new CF().ConectDB();
    }
    
    
    
    
    public void criarPessoa(Aluno pessoa) throws SQLException{
        String sql = "insert into Pessoa(nome,endereco,sexo,cpf,curso,matricula)"
                + "values(?,?,?,?,?,?);";
        PreparedStatement pstm;
            pstm = null;
        
        try {
            
            pstm = con.prepareStatement(sql);
            
            pstm.setString(1, pessoa.getNome());
            pstm.setString(2, pessoa.getEndereco());
            pstm.setString(3, pessoa.getSexo());
            pstm.setString(4, pessoa.getCpf());
            pstm.setString(5, pessoa.getCurso());
            pstm.setString(6, pessoa.getMatricula());
            
            
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
    
    public List<Aluno> listarUsuarios() throws SQLException{
        
        List<Aluno> lista = new ArrayList<>();
        
        String sql = "SELECT * FROM Pessoa";
        
        PreparedStatement pstm;
            pstm = null;
        
        ResultSet rs = null;
        
        try {
            pstm = con.prepareStatement(sql);
            
            rs = pstm.executeQuery();
            
            while (rs.next()) {
                Aluno pessoa = new Aluno();
                
                pessoa.setId(rs.getInt("id"));
                pessoa.setNome(rs.getString("nome"));
                pessoa.setCpf(rs.getString("Cpf"));
                pessoa.setEndereco(rs.getString("Endereco"));
                pessoa.setSexo(rs.getString("Sexo"));
                pessoa.setCurso(rs.getString("Curso"));
                pessoa.setMatricula(rs.getString("Matricula"));
                lista.add(pessoa);
            }
        } catch (SQLException e) {
            System.out.println("ERRO: "+e.getMessage());
            
        } finally {
            if(rs != null && pstm != null){
                rs.close();
                pstm.close();
            }
        }
        return lista;
    }
    
    public List<Aluno> bucasALunoporId(String nome) throws SQLException{
        List<Aluno> listaA = new ArrayList<>();
        String sql = "SELECT * FROM Pessoa WHERE nome like ?";
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        ResultSet rs = null;
        Aluno usuario = null;
        CF cf = new CF();
        con = cf.ConectDB();
        AlunoDAO alunodao = new AlunoDAO();
        
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1,"%"+ nome+"%");
            rs = pstm.executeQuery();
            List<Aluno> alunos = new ArrayList<>();
            
            
            
            while (rs.next()) {
                Aluno aluno = new Aluno();
                aluno.setNome(rs.getString("nome"));
                aluno.setEndereco(rs.getString("endereco"));
                aluno.setSexo(rs.getString("sexo"));
                aluno.setCpf(rs.getString("cpf"));
                aluno.setCurso(rs.getString("curso"));
                aluno.setMatricula(rs.getString("matricula"));
                listaA.add(aluno);
                }
            
            
            
            
            
        } catch (SQLException e) {
            System.out.println("Error: "+e.getMessage());
        } finally {
            if(rs != null && pstm != null){
                rs.close();
                pstm.close();
            }    
        }
        return listaA;   
}

    
    
     public void atualizarUsuario(Aluno usuario) throws SQLException{
        String sql = "UPDATE Pessoa SET nome = ?, endereco = ? , "
                + "cpf = ?, curso = ? WHERE id = ? ";
        
        PreparedStatement pstmt;
            pstmt = null;
            
        try {
            
            pstmt = con.prepareStatement(sql);
           
            pstmt.setString(1,usuario.getNome());

            
            int linhaAfetadas = pstmt.executeUpdate();
            
            if (linhaAfetadas > 0) {
                System.out.println("Leitura concluida");
            } else {
                System.out.println("Usuario não foi encontrado");
            }
            
        } catch (SQLException e) {
            System.out.println("ERROR: "+e.getMessage());
        } finally {
            if(pstmt != null)pstmt.close();
            }
        }
     
     
    }
