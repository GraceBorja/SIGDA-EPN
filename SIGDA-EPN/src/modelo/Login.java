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
public class Login {
    
    int idLogin;
    String nombreUsuario, password, numeroCedula;
    int idSubArea, idArea;

    public Login() {
    }

    public Login(int idLogin, String nombreUsuario, String password, String numeroCedula, int idSubArea, int idArea) {
        this.idLogin = idLogin;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.numeroCedula = numeroCedula;
        this.idSubArea = idSubArea;
        this.idArea = idArea;
    }

    public int getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(int idLogin) {
        this.idLogin = idLogin;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNumeroCedula() {
        return numeroCedula;
    }

    public void setNumeroCedula(String numeroCedula) {
        this.numeroCedula = numeroCedula;
    }

    public int getIdSubArea() {
        return idSubArea;
    }

    public void setIdSubArea(int idSubArea) {
        this.idSubArea = idSubArea;
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }
    
    
    
}
