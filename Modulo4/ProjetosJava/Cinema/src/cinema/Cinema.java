package cinema;
import java.sql.SQLException;

public class Cinema {
    public static void main(String[] args) {
        FDAO fd = new FDAO();
        Filme f = new Filme(0, "alanueiki 2","medo",2222);
        
        try{
            fd.inserirF(f);
        } catch(SQLException e){
            System.out.println("BOMBETA");
        }
    }
    
}
