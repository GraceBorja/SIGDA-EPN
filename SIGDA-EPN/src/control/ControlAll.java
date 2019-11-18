/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import conexion.Conexion;
import dao.AreaDAO;
import modelo.Area;

/**
 *
 * @author Grace
 */
public class ControlAll {
    
    Conexion conexion;
    AreaDAO areaDAO;

    public ControlAll() {
        conexion = new Conexion();
                
    }
    
    
    /*********************************************** ÁREA *************************************/
    
    // CREAR ÁREA
    public void crearArea(String nombre, String sigla){
        Area a = new Area(0, nombre, sigla);
        conexion.obtener();
        areaDAO = new AreaDAO(conexion);
        areaDAO.crearAreaDAO(a);
        
    }
    
    
    
}
