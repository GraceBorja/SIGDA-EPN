package dao;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import listas.ListaUsuario;
import modelo.Usuario;

/**
 *
 * @author Grace
 */
public class UsuarioDAO {
    
    Conexion conexion;
    Usuario usuario;
    

    public UsuarioDAO(Conexion conexion) {
        this.conexion = conexion;
    }
    
    //Creo un usuario
    public void crearUsuarioDAO (Usuario usuario1){
        try {
            PreparedStatement insertar = conexion.getCnx().prepareStatement("INSERT INTO usuario VALUES('"
                + usuario1.getNumeroCedula()+ "', '"
                    + usuario1.getNombres()+ "', '"
                    + usuario1.getApellidos()+ "', '"
                    + usuario1.getCorreo()+ "', '"
                    + usuario1.getNumeroTelefonoCelular()+ "', '"
                    + usuario1.getTipoUsuario()+ "', '"
                    + usuario1.getEstadoUsuario()+ "', "
                    + usuario1.getIdSubArea()+ ", "
                    + usuario1.getIdArea()+ ")");
            insertar.executeUpdate();
            JOptionPane.showMessageDialog(null,"Usuario INGRESADO con éxito");
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Usuario NO Ingresado");
        }
    }
    
    
    //busco usuario por el nombre
    public Usuario buscarNombreUsuarioDAO(String nombreUsuario1){
        usuario = new Usuario();
        try {
            PreparedStatement consulta = conexion.getCnx().prepareStatement("SELECT * FROM usuario WHERE "
                        + "nombres = '"+ nombreUsuario1 + "'");
            ResultSet result = consulta.executeQuery();
            while(result.next()){
                usuario.setNumeroCedula(result.getString("numeroCedula"));
                usuario.setNombres(result.getString("nombres"));
                usuario.setApellidos(result.getString("apellidos"));
                usuario.setCorreo(result.getString("correo"));
                usuario.setNumeroTelefonoCelular(result.getString("numeroTelefonoCelular"));
                usuario.setTipoUsuario(result.getString("tipoUsuario"));
                usuario.setEstadoUsuario(result.getString("estadoUsuario"));
                usuario.setIdSubArea(result.getInt("SubArea_idSubArea"));
                usuario.setIdArea(result.getInt("SubArea_Area_idArea"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usuario;
    }
    
    
    //busco usuario por el apellido
    public Usuario buscarApellidoUsuarioDAO(String apellidoUsuario1){
        usuario = new Usuario();
        try {
            PreparedStatement consulta = conexion.getCnx().prepareStatement("SELECT * FROM usuario WHERE "
                        + "apellidos = '"+ apellidoUsuario1 + "'");
            ResultSet result = consulta.executeQuery();
            while(result.next()){
                usuario.setNumeroCedula(result.getString("numeroCedula"));
                usuario.setNombres(result.getString("nombres"));
                usuario.setApellidos(result.getString("apellidos"));
                usuario.setCorreo(result.getString("correo"));
                usuario.setNumeroTelefonoCelular(result.getString("numeroTelefonoCelular"));
                usuario.setTipoUsuario(result.getString("tipoUsuario"));
                usuario.setEstadoUsuario(result.getString("estadoUsuario"));
                usuario.setIdSubArea(result.getInt("SubArea_idSubArea"));
                usuario.setIdArea(result.getInt("SubArea_Area_idArea"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usuario;
    }
    
    
    
    //busco usuario por el número de cédula
    public Usuario buscarCedulaUsuarioDAO(String cedulaUsuario1){
        usuario = new Usuario();
        try {
            PreparedStatement consulta = conexion.getCnx().prepareStatement("SELECT * FROM usuario WHERE "
                        + "numeroCedula = '"+ cedulaUsuario1 + "'");
            ResultSet result = consulta.executeQuery();
            while(result.next()){
                usuario.setNumeroCedula(result.getString("numeroCedula"));
                usuario.setNombres(result.getString("nombres"));
                usuario.setApellidos(result.getString("apellidos"));
                usuario.setCorreo(result.getString("correo"));
                usuario.setNumeroTelefonoCelular(result.getString("numeroTelefonoCelular"));
                usuario.setTipoUsuario(result.getString("tipoUsuario"));
                usuario.setEstadoUsuario(result.getString("estadoUsuario"));
                usuario.setIdSubArea(result.getInt("SubArea_idSubArea"));
                usuario.setIdArea(result.getInt("SubArea_Area_idArea"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usuario;
    }
    
    
    //BUsco todos los usuario registrados
    public ListaUsuario buscarTodosUsuariosDAO(){
        ListaUsuario listaUsu = new ListaUsuario();
        try {
            PreparedStatement consulta = conexion.getCnx().
                    prepareStatement("SELECT numeroCedula, nombres, apellidos, correo, numeroTelefonoCelular, "
                            + "tipoUsuario, estadoUsuario, SubArea_idSubArea, SubArea_Arera_idArea FROM usuario");
            ResultSet resultados = consulta.executeQuery();
            while(resultados.next()) {
                usuario = new Usuario();
                usuario.setNumeroCedula(resultados.getString("numeroCedula"));
                usuario.setNombres(resultados.getString("nombres"));
                usuario.setApellidos(resultados.getString("apellidos"));
                usuario.setCorreo(resultados.getString("correo"));
                usuario.setNumeroTelefonoCelular(resultados.getString("numeroTelefonoCelular"));
                usuario.setTipoUsuario(resultados.getString("tipoUsuario"));
                usuario.setEstadoUsuario(resultados.getString("estadoUsuario"));
                usuario.setIdSubArea(resultados.getInt("SubArea_idSubArea"));
                usuario.setIdArea(resultados.getInt("SubArea_Area_idArea"));
                
                listaUsu.add(usuario);
            }    
        } catch (SQLException ex) {
            System.out.println("ERROR");
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaUsu;
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

    
    //modificar nombres y apellidos de Usuario conociendo nombres y apellidos
    public void modificarNombresApellidosUsuarioDAO (String nombresAnteriores, String apellidosAnteriores,String nombresNuevos, String apellidosNUevos){
        try {
            PreparedStatement consulta = conexion.getCnx().prepareStatement("SELECT numeroCedula FROM usuario WHERE "
                        + "nombres = '"+ nombresAnteriores + "' and apellidos = '" + apellidosAnteriores + "'");
            ResultSet result = consulta.executeQuery();
            int numeroCedula = 0;
            if (result.next()) {
                numeroCedula = result.getInt("numeroCedula");
            }
            
            PreparedStatement actualizar = conexion.getCnx().prepareStatement("UPDATE usuario SET "
                    + "nombres ='"+nombresNuevos+ "', apellidos = '" 
                            +apellidosNUevos + "' "
                    + "WHERE numeroCedula = " + numeroCedula);
            actualizar.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario ACTUALIZADO");
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Usuario NO actualizado");
        }
    }
    
    //modificar el número de cédula de Usuario conociendo nombres y apellidos
    public void modificarCedulaUsuarioDAO (String nombres, String apellidos,String cedulaNueva){
        try {
            PreparedStatement consulta = conexion.getCnx().prepareStatement("SELECT numeroCedula FROM usuario WHERE "
                        + "nombres = '"+ nombres + "' and apellidos = '" + apellidos + "'");
            ResultSet result = consulta.executeQuery();
            int numeroCedula = 0;
            if (result.next()) {
                numeroCedula = result.getInt("numeroCedula");
            }
            
            PreparedStatement actualizar = conexion.getCnx().prepareStatement("UPDATE usuario SET "
                    + "numeroCedula ='"+cedulaNueva+ "' "
                    + "WHERE numeroCedula = " + numeroCedula);
            actualizar.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario ACTUALIZADO");
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Usuario NO actualizado");
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
