package dao;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import listas.ListaArea;
import modelo.Area;

/**
 *
 * @author Grace
 */
public class AreaDAO {
    
    Conexion conexion;
    Area area;

    public AreaDAO(Conexion conexion) {
        this.conexion = conexion;
    }
    
    //Creo un área
    public void crearAreaDAO (Area area1){
        try {
            PreparedStatement insertar = conexion.getCnx().prepareStatement("INSERT INTO area VALUES(0, '"
                + area1.getNombreArea()+ "', '"
                + area1.getSigla()+ "')");
            insertar.executeUpdate();
            JOptionPane.showMessageDialog(null,"Área INGRESADA con éxito");
        } catch (SQLException ex) {
            Logger.getLogger(AreaDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Área NO Ingresada");
        }
    }
    
    
    //busco las areas por el nombre
    public Area buscarNombreAreaDAO(String nombreArea1){
        area = new Area();
        try {
            PreparedStatement consulta = conexion.getCnx().prepareStatement("SELECT * FROM area WHERE "
                        + "nombreArea = '"+ nombreArea1 + "'");
            ResultSet result = consulta.executeQuery();
            while(result.next()){
                area.setIdArea(result.getInt("idArea"));
                area.setNombreArea(result.getString("nombreArea"));
                area.setSigla(result.getString("siglaArea"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(AreaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return area;
    }
    
    //busco las areas por la sigla
    public Area buscarSiglaAreaDAO(String siglaArea1){
        area = new Area();
        try {
            PreparedStatement consulta = conexion.getCnx().prepareStatement("SELECT * FROM area WHERE "
                        + "siglaArea = '"+ siglaArea1 + "'");
            ResultSet result = consulta.executeQuery();
            while(result.next()){
                area.setIdArea(result.getInt("idArea"));
                area.setNombreArea(result.getString("nombreArea"));
                area.setSigla(result.getString("siglaArea"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(AreaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return area;
    }
    
    
    //BUsco todas las áreas registradas
    public ListaArea buscarTodasAreasDAO(){
        ListaArea listaAr = new ListaArea();
        try {
            PreparedStatement consulta = conexion.getCnx().
                    prepareStatement("SELECT idArea, nombreArea, siglaArea FROM area");
            ResultSet resultados = consulta.executeQuery();
            while(resultados.next()) {
                area = new Area();
                area.setIdArea(resultados.getInt("idArea"));
                area.setNombreArea(resultados.getString("nombreArea"));
                area.setSigla(resultados.getString("siglaArea"));
                
                listaAr.add(area);
            }    
        } catch (SQLException ex) {
            System.out.println("ERROR");
            Logger.getLogger(AreaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaAr;
    }
    
    
    //modificar el nombre del área
    public void modificarNombreAreaDAO (String nombreAnterior, String nombreNuevo){
        try {
            PreparedStatement consulta = conexion.getCnx().prepareStatement("SELECT idArea FROM area WHERE "
                        + "nombreArea = '"+ nombreAnterior + "'");
            ResultSet result = consulta.executeQuery();
            int idArea = 0;
            if (result.next()) {
                idArea = result.getInt("idArea");
            }
            
            PreparedStatement actualizar = conexion.getCnx().prepareStatement("UPDATE area SET "
                    + "nombreArea='"+nombreNuevo+ "', "
                    + "WHERE idArea = " + idArea);
            actualizar.executeUpdate();
            JOptionPane.showMessageDialog(null, "Área ACTUALIZADA");
        } catch (SQLException ex) {
            Logger.getLogger(AreaDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Cliente NO actualizado");
        }
    }

    
    //modificar las siglas del área
    public void modificarSiglaAreaDAO (String siglaAnterior, String SiglaNueva){
        try {
            PreparedStatement consulta = conexion.getCnx().prepareStatement("SELECT idArea FROM area WHERE "
                        + "siglaArea = '"+ siglaAnterior + "'");
            ResultSet result = consulta.executeQuery();
            int idArea = 0;
            if (result.next()) {
                idArea = result.getInt("idArea");
            }
            
            PreparedStatement actualizar = conexion.getCnx().prepareStatement("UPDATE area SET "
                    + "siglaArea='"+SiglaNueva+ "' "
                    + "WHERE idArea = " + idArea);
            actualizar.executeUpdate();
            JOptionPane.showMessageDialog(null, "Área ACTUALIZADA");
        } catch (SQLException ex) {
            Logger.getLogger(AreaDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Área NO actualizada");
        }
    }
    
    
    //Eliminar un área conociendo el nombre
    public void eliminarAreaDAO_Nombre (String nombre){
        try {
            PreparedStatement consulta = conexion.getCnx().prepareStatement("SELECT idArea FROM area WHERE "
                        + "nombreArea = '"+ nombre + "'");
            ResultSet result = consulta.executeQuery();
            int idArea = 0;
            if (result.next()) {
                idArea = result.getInt("idArea");
            }
            PreparedStatement elimArea = conexion.getCnx().prepareStatement("DELETE FROM area WHERE "
                    + "idArea = "+ idArea );
            elimArea.executeUpdate();
            JOptionPane.showMessageDialog(null, "Área ELIMINADA ");
        } catch (SQLException ex) {
            Logger.getLogger(AreaDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Cliente NO eliminado");
        }
    }
    
    
    //Eliminar un área conociendo la sigla
    public void eliminarAreaDAO_Sigla (String sigla){
        try {
            PreparedStatement consulta = conexion.getCnx().prepareStatement("SELECT idArea FROM area WHERE "
                        + "siglaArea = '"+ sigla + "'");
            ResultSet result = consulta.executeQuery();
            int idArea = 0;
            if (result.next()) {
                idArea = result.getInt("idArea");
            }
            PreparedStatement elimArea = conexion.getCnx().prepareStatement("DELETE FROM area WHERE "
                    + "idArea = "+ idArea );
            elimArea.executeUpdate();
            JOptionPane.showMessageDialog(null, "Área ELIMINADA ");
        } catch (SQLException ex) {
            Logger.getLogger(AreaDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Cliente NO eliminado");
        }
    }
    

    
    
    
}
