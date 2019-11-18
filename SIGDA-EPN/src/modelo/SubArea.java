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
public class SubArea {
    
    int idSubArea;
    String nombreSubArea, sigla;
    int idArea;

    public SubArea() {
    }

    public SubArea(int idSubArea, String nombreSubArea, String sigla, int idArea) {
        this.idSubArea = idSubArea;
        this.nombreSubArea = nombreSubArea;
        this.sigla = sigla;
        this.idArea = idArea;
    }

    public int getIdSubArea() {
        return idSubArea;
    }

    public void setIdSubArea(int idSubArea) {
        this.idSubArea = idSubArea;
    }

    public String getNombreSubArea() {
        return nombreSubArea;
    }

    public void setNombreSubArea(String nombreSubArea) {
        this.nombreSubArea = nombreSubArea;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }
    
    
}
