package modelo;

/**
 *
 * @author Grace
 */
public class EliminadoGeneral {
    
    int idEliminadoGeneral;
    String fechaEliminado, numeroActaGeneral, idExpedienteGeneral, idTransferencia, idExpediente;
    int idSubArea, idArea, idTipoExpediente;

    public EliminadoGeneral() {
    }

    public EliminadoGeneral(int idEliminadoGeneral, String fechaEliminado, String numeroActaGeneral, String idExpedienteGeneral, String idTransferencia, String idExpediente, int idSubArea, int idArea, int idTipoExpediente) {
        this.idEliminadoGeneral = idEliminadoGeneral;
        this.fechaEliminado = fechaEliminado;
        this.numeroActaGeneral = numeroActaGeneral;
        this.idExpedienteGeneral = idExpedienteGeneral;
        this.idTransferencia = idTransferencia;
        this.idExpediente = idExpediente;
        this.idSubArea = idSubArea;
        this.idArea = idArea;
        this.idTipoExpediente = idTipoExpediente;
    }

    public int getIdEliminadoGeneral() {
        return idEliminadoGeneral;
    }

    public void setIdEliminadoGeneral(int idEliminadoGeneral) {
        this.idEliminadoGeneral = idEliminadoGeneral;
    }

    public String getFechaEliminado() {
        return fechaEliminado;
    }

    public void setFechaEliminado(String fechaEliminado) {
        this.fechaEliminado = fechaEliminado;
    }

    public String getNumeroActaGeneral() {
        return numeroActaGeneral;
    }

    public void setNumeroActaGeneral(String numeroActaGeneral) {
        this.numeroActaGeneral = numeroActaGeneral;
    }

    public String getIdExpedienteGeneral() {
        return idExpedienteGeneral;
    }

    public void setIdExpedienteGeneral(String idExpedienteGeneral) {
        this.idExpedienteGeneral = idExpedienteGeneral;
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
