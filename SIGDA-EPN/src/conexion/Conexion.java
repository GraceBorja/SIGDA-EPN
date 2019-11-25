/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Grace
 */
public class Conexion {
    Connection cnx;
    
    private static final String user = "root";
    private static final String pass = "22021996";
    private static final String nombreBDD = "dms_bdd";

    public Conexion() {
    }

    public Connection getCnx() {
        return cnx;
    }
    
    public void setCnx(Connection cxn) {
        this.cnx = cnx;
    }
    
    public Connection obtener() {
        if(cnx==null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                cnx = DriverManager.getConnection("jdbc:mysql://localhost/"+ nombreBDD, user, pass);
                JOptionPane.showMessageDialog(null, "CONECTADO");
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Sin Conexión");
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Sin Conexión");
            }
        }
        return cnx;
    }
    
    public void cerrar() {
        if(cnx!=null) {
            try {
                cnx.close();
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
