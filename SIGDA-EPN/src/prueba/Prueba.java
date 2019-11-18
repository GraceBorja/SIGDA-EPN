/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import conexion.Conexion;
import dao.AreaDAO;
import modelo.Area;

/**
 *
 * @author Grace
 */
public class Prueba {

    Conexion conexion;
    AreaDAO areaDAO;

    public Prueba( ) {
        conexion = new Conexion();
    }
    
    public void conectemos(){
        conexion.obtener();
    }
    
    public void buscarAreaNombre(String nombre){
        Area a = new Area();
        conexion.obtener();
        areaDAO = new AreaDAO(conexion);
        a=areaDAO.buscarNombreAreaDAO(nombre);
        System.out.println(a);
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Conexion cnx = new Conexion();
        String nombre = "bibliotecas";
        
        Prueba p = new Prueba();
        p.conectemos();
        p.buscarAreaNombre(nombre);
        
        
        
    }
    
}


