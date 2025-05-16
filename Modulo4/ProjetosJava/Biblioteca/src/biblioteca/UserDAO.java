package biblioteca;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private Connection connection;

    public UserDAO() {
        this.connection = new ConnectionFactory().conectaDB();
    }  
    
    public void criarUsuario(Usuario usuario)throws SQLException {
        String sql = "insert into usuarios(nome,telefone,tipo_usuario,email)value(?,?,?,?)";
        
        try(PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, usuario.getNome());
            pstmt.setString(2, usuario.getTelefone());
            pstmt.setString(3, usuario.getTipo_usuario());
            pstmt.setString(4, usuario.getEmail());
            
            pstmt.executeUpdate();
            System.out.println("up");
        }catch(SQLException e){
            System.out.println("desup"+e.getMessage());
        }
    }
    
    public List<Usuario> listarUsuarios() throws SQLException{
        
        List<Usuario> lista = new ArrayList<>();
        
        String sql = "SELECT * FROM tb_usuario";
        
        PreparedStatement pstm;
            pstm = null;
        
        ResultSet rs = null;
        
        try {
            pstm = connection.prepareStatement(sql);
            
            rs = pstm.executeQuery();
            
            while (rs.next()) {
                Usuario usuario = new Usuario();
                
                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setEmail(rs.getString("email"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setTipo_usuario(rs.getString("tipo_usuario"));
                
                lista.add(usuario);
                
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
} 
    


  

