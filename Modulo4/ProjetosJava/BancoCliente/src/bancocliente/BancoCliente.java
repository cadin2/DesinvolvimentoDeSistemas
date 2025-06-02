/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bancocliente;

import java.sql.SQLException;

/**
 *
 * @author ead
 */
public class BancoCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        ClienteDao cliente = new ClienteDao();
        
        cliente.sacarDin();
        
        
    }
    
}
