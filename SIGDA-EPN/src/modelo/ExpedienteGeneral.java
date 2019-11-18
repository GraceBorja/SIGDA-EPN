package modelo;

/**
 *
 * @author Grace
 */
public class ExpedienteGeneral {
    
    String idExpedienteGeneral, codigoUbicacionFisica;
    boolean digital;
    String observacion, idTransferencia, idExpediente;
    int idSubArea, idArea, idTipoExpediente;

    public ExpedienteGeneral() {
    }

    public ExpedienteGeneral(String idExpedienteGeneral, String codigoUbicacionFisica, boolean digital, String observacion, String idTransferencia, String idExpediente, int idSubArea, int idArea, int idTipoExpediente) {
        this.idExpedienteGeneral = idExpedienteGeneral;
        this.codigoUbicacionFisica = codigoUbicacionFisica;
        this.digital = digital;
        this.observacion = observacion;
        this.idTransferencia = idTransferencia;
        this.idExpediente = idExpediente;
        this.idSubArea = idSubArea;
        this.idArea = idArea;
        this.idTipoExpediente = idTipoExpediente;
    }

    public String getIdExpedienteGeneral() {
        return idExpedienteGeneral;
    }

    public void setIdExpedienteGeneral(String idExpedienteGeneral) {
        this.idExpedienteGeneral = idExpedienteGeneral;
    }

    public String getCodigoUbicacionFisica() {
        return codigoUbicacionFisica;
    }

    public void setCodigoUbicacionFisica(String codigoUbicacionFisica) {
        this.codigoUbicacionFisica = codigoUbicacionFisica;
    }

    public boolean isDigital() {
        return digital;
    }

    public void setDigital(boolean digital) {
        this.digital = digital;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getIdTransferencia() {
        return idTransferencia;
    }

    public void setIdTransferencia(String idTransferencia) {
        this.idTransferencia = idTransferencia;
    }

    public String getIdExpediente() {
        return idExpediente;
    }

    public void setIdExpediente(String idExpediente) {
        this.idExpediente = idExpediente;
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

    public int getIdTipoExpediente() {
        return idTipoExpediente;
    }

    public void setIdTipoExpediente(int idTipoExpediente) {
        this.idTipoExpediente = idTipoExpediente;
    }
    
    
    
    
}
