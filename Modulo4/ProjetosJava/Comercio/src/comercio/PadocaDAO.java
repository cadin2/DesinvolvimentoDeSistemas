package comercio;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;

public class PadocaDAO {
     private Connection connection;

    public PadocaDAO(Connection connection) {
        this.connection = connection;
    }
    public void criarUsuario(Usuario usuario)throws SQLException{
        String sql = "INSERT INTO  Usuarios(nome,email,telefone)"
                + "values(?,?,?)";
        
        PreparedStatement pstmt;
            pstmt = null;
        
        try {
            
            pstmt = connection.prepareStatement(sql);
            
            pstmt.setString(0,usuario.getId());
            pstmt.setString(1,usuario.getNome());
            pstmt.setString(2,usuario.getEmail());
            pstmt.setString(3,usuario.getTelefone());
            
            pstmt.executeUpdate();
            
            
        } catch (SQLException e) {
            System.out.println("Error: "+ e.getMessage());
        }
        finally{
            
            if(pstmt != null){
                pstmt.close();
            }
        }
    }
    public List<Usuario> listarUsuarios() throws SQLException{
        
        List<Usuario> lista = new ArrayList<>();
        
        String sql = "SELECT * FROM Usuarios";
        
        PreparedStatement pstm;
            pstm = null;
        
        ResultSet rs = null;
        
        try {
            pstm = connection.prepareStatement(sql);
            
            rs = pstm.executeQuery();
            
            while (rs.next()) {
                Usuario usuario = new Usuario();
                
                usuario.setId(sql);
                usuario.setNome(rs.getString("nome"));
                usuario.setEmail(rs.getString("email"));
                usuario.setTelefone(rs.getString("telefone"));
                
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
    public Usuario bucasUsuarioPorId(int id) throws SQLException{
        String sql = "SELECT * FROM Usuarios WHERE id=?";
        
        PreparedStatement pstm;
            pstm = null;
          
        ResultSet rs = null;
        Usuario usuario = null;
        
        try {
            pstm = connection.prepareStatement(sql);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();
            
            if (rs.next()){
                usuario = new Usuario();
                
                usuario.setId(sql);
                usuario.setNome(rs.getString("nome"));
                usuario.setEmail(rs.getString("email"));
                usuario.setTelefone(rs.getString("telefone"));
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
        public void atualizarUsuario(Usuario usuario) throws SQLException{
        String sql = "UPDATE usuarios SET nome = ?, telefone = ? , "
                + "tipo_usuario = ? WHERE id = ? ";
        
        PreparedStatement pstmt;
            pstmt = null;
            
        try {
            
            pstmt = connection.prepareStatement(sql);
           
            pstmt.setString(1,usuario.getNome());
            pstmt.setString(2,usuario.getEmail());
            pstmt.setString(3,usuario.getTelefone());
            
            int linhaAfetadas = pstmt.executeUpdate();
            
            if (linhaAfetadas > 0) {
                System.out.println("Leitura concluida");
            } else {
                System.out.println("Usuario não foi encontrado");
            }
            
        } catch (SQLException e) {
            System.out.println("ERROR: "+e.getMessage());
        } finally {
        }
    }
}
    
