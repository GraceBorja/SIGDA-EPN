/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Expediente;

/**
 *
 * @author Kike
 */
public class ExpedienteDAO {

    Conexion conexion;
    Expediente expediente;

    public ExpedienteDAO(Conexion conexion) {
        this.conexion = conexion;
    }
/*insert into expediente values ('SG-DA-CAST'LIBRO',null,144,'ARCHIVO HISTÓRICO',null,null,2,1,6);*/
    public void crearExpediente(Expediente expediente1) {
        try {
            PreparedStatement insertar = conexion.getCnx().prepareStatement("insert into expediente values ('"
            + expediente1.getIdExpediente()+"', '"
            + expediente1.getNumeroCaja()+"', '" 
            + expediente1.getSerie()+"', '"
            + expediente1.getSubSerie()+"', '"
            + expediente1.getAsunto()+"', '"
            + expediente1.getFechaDesde()+"', '"
            + expediente1.getFechaHasta()+"', '"
            + expediente1.getFechaHasta()+"', '"
            + expediente1.getMedioAlmacenamiento()+"', '"
            + expediente1.getMedioAlmacenamientoOtro()+"', "
            + expediente1.getNumeroFolios()+", '"
            + expediente1.getEstado()+"', '"
            + expediente1.getObservacion()+"', '"
            + expediente1.getUrlDigital()+"', "
            + expediente1.getIdArea()+", "
            + expediente1.getIdSubArea()+", "
            + expediente1.getIdTipoExpediente()+");");
            JOptionPane.showMessageDialog(null, "Expediente registrado con exito");
                    
        } catch (SQLException ex) {
            Logger.getLogger(ExpedienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error en registro de expediente");
        }

    }

}
