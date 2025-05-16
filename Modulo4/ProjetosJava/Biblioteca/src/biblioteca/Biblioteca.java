package biblioteca;
import java.sql.SQLException;
import java.util.List;

public class Biblioteca {
    public static void main(String[] args) throws SQLException {
       
        UserDAO userDAO = new UserDAO();
        Usuario user = new Usuario(0, "kazix","kazis123@gmail.com", "12315914723", "de mentirinha");
        
//        try {
//            userDAO.criarUsuario(user);
//            
//        } catch (SQLException e) {
//            System.out.println("bombeta");
//      }
        try{
            List<Usuario> usuarios = userDAO.listarUsuarios();
            if(usuarios.isEmpty()){
                System.out.println("NAO TEM NADAAAAAAAAAAAAAAAAA");
            }
            else{
                for(Usuario usuario : usuarios){
                    System.out.println("ID: "+usuario.getId());
                    System.out.println("Nome: "+usuario.getNome());
                    System.out.println("Email: "+usuario.getEmail());
                    System.out.println("Tele1fone: "+usuario.getTelefone());
                    System.out.println("Tipo: "+usuario.getTipo_usuario());
                    System.out.println("_____________________________________");
                }
            }
        }
        catch(SQLException e){
            System.out.println("Erro: "+e.getMessage());
        }
    }
    
}
