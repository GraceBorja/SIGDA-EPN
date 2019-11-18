package modelo;

/**
 *
 * @author Grace
 */
public class TipoExpediente {
    
    int idTipoExpediente;
    String nombreTipoExpediente;
    int tiempoVigencia, tiempoMaximo;

    public TipoExpediente() {
    }

    public TipoExpediente(int idTipoExpediente, String nombreTipoExpediente, int tiempoVigencia, int tiempoMaximo) {
        this.idTipoExpediente = idTipoExpediente;
        this.nombreTipoExpediente = nombreTipoExpediente;
        this.tiempoVigencia = tiempoVigencia;
        this.tiempoMaximo = tiempoMaximo;
    }

    public int getIdTipoExpediente() {
        return idTipoExpediente;
    }

    public void setIdTipoExpediente(int idTipoExpediente) {
        this.idTipoExpediente = idTipoExpediente;
    }

    public String getNombreTipoExpediente() {
        return nombreTipoExpediente;
    }

    public void setNombreTipoExpediente(String nombreTipoExpediente) {
        this.nombreTipoExpediente = nombreTipoExpediente;
    }

    public int getTiempoVigencia() {
        return tiempoVigencia;
    }

    public void setTiempoVigencia(int tiempoVigencia) {
        this.tiempoVigencia = tiempoVigencia;
    }

    public int getTiempoMaximo() {
        return tiempoMaximo;
    }

    public void setTiempoMaximo(int tiempoMaximo) {
        this.tiempoMaximo = tiempoMaximo;
    }
    
    
    
    
}
