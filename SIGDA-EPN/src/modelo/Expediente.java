package modelo;

/**
 *
 * @author Grace
 */
public class Expediente {
    
    String idExpediente, numeroCaja, serie, subSerie, asunto, fechaDesde, fechaHasta, medioAlmacenamiento, medioAlmacenamientoOtro;
    int numeroFolios;
    String estado, observacion, urlDigital;
    int idSubArea, idArea, idTipoExpediente;

    public Expediente() {
    }

    public Expediente(String idExpediente, String numeroCaja, String serie, String subSerie, String asunto, String fechaDesde, String fechaHasta, String medioAlmacenamiento, String medioAlmacenamientoOtro, int numeroFolios, String estado, String observacion, String urlDigital, int idSubArea, int idArea, int idTipoExpediente) {
        this.idExpediente = idExpediente;
        this.numeroCaja = numeroCaja;
        this.serie = serie;
        this.subSerie = subSerie;
        this.asunto = asunto;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.medioAlmacenamiento = medioAlmacenamiento;
        this.medioAlmacenamientoOtro = medioAlmacenamientoOtro;
        this.numeroFolios = numeroFolios;
        this.estado = estado;
        this.observacion = observacion;
        this.urlDigital = urlDigital;
        this.idSubArea = idSubArea;
        this.idArea = idArea;
        this.idTipoExpediente = idTipoExpediente;
    }

    public String getIdExpediente() {
        return idExpediente;
    }

    public void setIdExpediente(String idExpediente) {
        this.idExpediente = idExpediente;
    }

    public String getNumeroCaja() {
        return numeroCaja;
    }

    public void setNumeroCaja(String numeroCaja) {
        this.numeroCaja = numeroCaja;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getSubSerie() {
        return subSerie;
    }

    public void setSubSerie(String subSerie) {
        this.subSerie = subSerie;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(String fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public String getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(String fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public String getMedioAlmacenamiento() {
        return medioAlmacenamiento;
    }

    public void setMedioAlmacenamiento(String medioAlmacenamiento) {
        this.medioAlmacenamiento = medioAlmacenamiento;
    }

    public String getMedioAlmacenamientoOtro() {
        return medioAlmacenamientoOtro;
    }

    public void setMedioAlmacenamientoOtro(String medioAlmacenamientoOtro) {
        this.medioAlmacenamientoOtro = medioAlmacenamientoOtro;
    }

    public int getNumeroFolios() {
        return numeroFolios;
    }

    public void setNumeroFolios(int numeroFolios) {
        this.numeroFolios = numeroFolios;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getUrlDigital() {
        return urlDigital;
    }

    public void setUrlDigital(String urlDigital) {
        this.urlDigital = urlDigital;
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
