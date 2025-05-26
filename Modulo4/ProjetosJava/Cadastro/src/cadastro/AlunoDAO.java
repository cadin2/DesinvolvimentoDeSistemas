package cadastro;

import java.sql.*;
import java.util.*;
import javax.swing.*;

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
    
    public List<Pessoa> listarUsuarios() throws SQLException{
        
        List<Pessoa> lista = new ArrayList<>();
        
        String sql = "SELECT * FROM Pessoa";
        
        PreparedStatement pstm;
            pstm = null;
        
        ResultSet rs = null;
        
        try {
            pstm = con.prepareStatement(sql);
            
            rs = pstm.executeQuery();
            
            while (rs.next()) {
                Pessoa Aluno = new Pessoa();
                
                Aluno.setId(rs.getInt("id"));
                Aluno.setNome(rs.getString("nome"));
                Aluno.setCpf(rs.getString("Cpf"));
                Aluno.setEndereco(rs.getString("Endereco"));
                Aluno.setSexo(rs.getString("Sexo"));
                lista.add(Aluno);
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
    
    public Pessoa bucasALunoporId(int id) throws SQLException{
        String sql = "SELECT * FROM Pessoa WHERE id=?";
        
        PreparedStatement pstm;
            pstm = null;
          
        ResultSet rs = null;
        Pessoa usuario = null;
        
        try {
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();
            
            if (rs.next()){
                usuario = new Pessoa();
                
                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setCpf(rs.getString("Cpf"));
                usuario.setEndereco(rs.getString("Endereco"));
                usuario.setSexo(rs.getString("Sexo"));
            }
            
        } catch (SQLException e) {
            System.out.println("Error: "+e.getMessage());
        } finally {
            if(rs != null && pstm != null){
                rs.close();
                pstm.close();
            }    
        }
        return usuario;
        
    }
    
     public void atualizarUsuario(Pessoa usuario) throws SQLException{
        String sql = "UPDATE Pessoa SET nome = ?, telefone = ? , "
                + "tipo_usuario = ? WHERE id = ? ";
        
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
