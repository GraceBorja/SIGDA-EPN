/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Grace
 */
public class Area {
    
    int idArea;
    String nombreArea, sigla;

    public Area() {
    }

    public Area(int idArea, String nombreArea, String sigla) {
        this.idArea = idArea;
        this.nombreArea = nombreArea;
        this.sigla = sigla;
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public String getNombreArea() {
        return nombreArea;
    }

    public void setNombreArea(String nombreArea) {
        this.nombreArea = nombreArea;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    
    @Override 
    public String toString(){
        return "Id: "+ idArea + " Nombre: " + nombreArea + " Sigla: " +sigla;
    }
            
    
}
