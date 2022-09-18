
package DAO;
import java.sql.DriverManager;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.SQLException;


public class ConexaoDAO {
    public Connection conectaBD() {
        Connection conn = null;
        
        try {
            String url = "jdbc:mysql://localhost:3306/bancoteste?user=root&password=joao2002";
            conn = DriverManager.getConnection(url);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage()); 
        }
        return conn;
    }
    
}
