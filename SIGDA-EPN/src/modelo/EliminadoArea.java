package modelo;

/**
 *
 * @author Grace
 */
public class EliminadoArea {
    
    int idEliminadoArea;
    String fechaEliminacion, actaArea, idExpediente;
    int idSubArea, idArea, idTipoExpediente;

    public EliminadoArea() {
    }

    public EliminadoArea(int idEliminadoArea, String fechaEliminacion, String actaArea, String idExpediente, int idSubArea, int idArea, int idTipoExpediente) {
        this.idEliminadoArea = idEliminadoArea;
        this.fechaEliminacion = fechaEliminacion;
        this.actaArea = actaArea;
        this.idExpediente = idExpediente;
        this.idSubArea = idSubArea;
        this.idArea = idArea;
        this.idTipoExpediente = idTipoExpediente;
    }

    public int getIdEliminadoArea() {
        return idEliminadoArea;
    }

    public void setIdEliminadoArea(int idEliminadoArea) {
        this.idEliminadoArea = idEliminadoArea;
    }

    public String getFechaEliminacion() {
        return fechaEliminacion;
    }

    public void setFechaEliminacion(String fechaEliminacion) {
        this.fechaEliminacion = fechaEliminacion;
    }

    public String getActaArea() {
        return actaArea;
    }

    public void setActaArea(String actaArea) {
        this.actaArea = actaArea;
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
