
package bancocliente;
import java.sql.*;
import java.util.*;


public class ClienteDao {
    private Connection connection;

    public ClienteDao(){
        this.connection = new CF().ConectDB();
    }
    
    public void criarAlunoro(Cliente cliente) throws SQLException{
        String sql= "INSERT INTO BancoCliente(nome, saldo,email,senha,numConta)"
                + "values(?,?,?,?,?)";
        
        PreparedStatement pstm;
            pstm = null;
        
        try {
            
            pstm = connection.prepareStatement(sql);
            
            pstm.setString(1,cliente.getNome());
            pstm.setString(2,cliente.getEmail());
            pstm.setString(3,cliente.getSenha());
            pstm.setString(4,cliente.getNumConta());            
            pstm.execute();
            
        } catch (SQLException e) {
            System.out.println("Erro: "+e.getMessage());
        } finally {
            if(pstm != null)pstm.close();
        }
    }
    
    public Cliente buscaAlunoPorId(int id) throws SQLException{
        String sql = "SELECT * FROM BancoCliente WHERE id=?";
        
        PreparedStatement pstm;
                pstm = null;
        
        ResultSet rs = null;
        
        Cliente cliente = null;
        
        try {
            
            pstm = connection.prepareStatement(sql);
            
            pstm.setInt(1, id);
            
            rs = pstm.executeQuery();
            
            if (rs.next()) {
                
                cliente = new Cliente();
                
                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setEmail(rs.getString("Email"));
                cliente.setSenha(rs.getString("Senha"));
            }
            
        } catch (SQLException e) {
            System.out.println("Error: "+e.getMessage());
            
        } finally {
            if(rs != null && pstm != null){
                rs.close();
                pstm.close();
            }
        }
        
        return cliente;
    }
   
    
    public void deletarAluno(int id) throws SQLException{
        String sql = "DELETE FROM tb_Aluno WHERE id = ?";
        
        PreparedStatement pstm;
            pstm = null;
            
        try {
            pstm = connection.prepareStatement(sql);
            
            pstm.setInt(1,id);
            
            pstm.executeUpdate();
            
            System.out.println("Aluno deletado com sucesso");
        } catch (SQLException e) {
            System.out.println("Error: "+e.getMessage());
        } finally {
            if(pstm != null)pstm.close();
        }
    
    }
    
    public void sacarDin () throws SQLException{
        if()
        
    }
}
