package modelo;

/**
 *
 * @author Grace
 */
public class Usuario {
    
    String numeroCedula, nombres, apellidos, correo, numeroTelefonoCelular, tipoUsuario, estadoUsuario;
    int idSubArea, idArea;

    public Usuario() {
    }

    public Usuario(String numeroCedula, String nombres, String apellidos, String correo, String numeroTelefonoCelular, String tipoUsuario, String estadoUsuario, int idSubArea, int idArea) {
        this.numeroCedula = numeroCedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.numeroTelefonoCelular = numeroTelefonoCelular;
        this.tipoUsuario = tipoUsuario;
        this.estadoUsuario = estadoUsuario;
        this.idSubArea = idSubArea;
        this.idArea = idArea;
    }

    public String getNumeroCedula() {
        return numeroCedula;
    }

    public void setNumeroCedula(String numeroCedula) {
        this.numeroCedula = numeroCedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumeroTelefonoCelular() {
        return numeroTelefonoCelular;
    }

    public void setNumeroTelefonoCelular(String numeroTelefonoCelular) {
        this.numeroTelefonoCelular = numeroTelefonoCelular;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(String estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
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
