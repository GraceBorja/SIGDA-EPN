package modelo;

/**
 *
 * @author Grace
 */
public class Transferencia {
    
    String idTransferencia, fechaTransferencia, fechaConservación, valoración, idExpediente;
    int idSubArea, idArea, idTipoExpediente;

    public Transferencia() {
    }

    public Transferencia(String idTransferencia, String fechaTransferencia, String fechaConservación, String valoración, String idExpediente, int idSubArea, int idArea, int idTipoExpediente) {
        this.idTransferencia = idTransferencia;
        this.fechaTransferencia = fechaTransferencia;
        this.fechaConservación = fechaConservación;
        this.valoración = valoración;
        this.idExpediente = idExpediente;
        this.idSubArea = idSubArea;
        this.idArea = idArea;
        this.idTipoExpediente = idTipoExpediente;
    }

    public String getIdTransferencia() {
        return idTransferencia;
    }

    public void setIdTransferencia(String idTransferencia) {
        this.idTransferencia = idTransferencia;
    }

    public String getFechaTransferencia() {
        return fechaTransferencia;
    }

    public void setFechaTransferencia(String fechaTransferencia) {
        this.fechaTransferencia = fechaTransferencia;
    }

    public String getFechaConservación() {
        return fechaConservación;
    }

    public void setFechaConservación(String fechaConservación) {
        this.fechaConservación = fechaConservación;
    }

    public String getValoración() {
        return valoración;
    }

    public void setValoración(String valoración) {
        this.valoración = valoración;
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
