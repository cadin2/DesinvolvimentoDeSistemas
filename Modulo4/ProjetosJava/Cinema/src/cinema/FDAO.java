package cinema;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class FDAO {
    private Connection connection;
    
    public FDAO(){
        this.connection = new connectionDB().conectaDB();        
    }
    
    public void inserirF(Filme filme) throws SQLException {
        String sql = "insert into Filme(titulo,genero,ano)value(?,?,?)";
        
        try(PreparedStatement pstmt = connection.prepareCall(sql)){
            pstmt.setString(1, filme.getTitulo());
            pstmt.setString(2, filme.getGenero());
            pstmt.setInt(3, filme.getAno());
            
            pstmt.executeUpdate();
            System.out.println("UUUUUUp");
        }catch(SQLException e){
            System.out.println("NUM FOI: "+e.getMessage());
        }
    }
    
    public List<Filme> listarFilme() throws SQLException{
        List<Filme> lista = new ArrayList<>();
        
        String sql = "select * from tb_Filme";
        
        PreparedStatement pstmt;
        pstmt = null;
        ResultSet rs = null;
        
        try{
            pstmt = connection.prepareStatement(sql);
            
            rs = pstmt.executeQuery();
            
            while(rs.next()){
                Filme filme = new Filme();
                filme.getId();
                filme.setAno(0);
                filme.setGenero("Genero");
                filme.setTitulo("Titulo");
                
                lista.add(filme);
            }
        }catch(SQLException e){
            System.out.println("Erro: "+e.getMessage());
        } finally{
            if(rs != null && pstmt != null){
                rs.close();
                pstmt.close();
            }
        }
        return lista;
    }
}
