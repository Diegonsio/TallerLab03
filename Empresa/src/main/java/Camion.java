public class Camion {
    private long codigoCamion;
    private String patente;
    private String descripcion;
    private boolean estado;

    public Camion(long codigoCamion, String patente, String descripcion,boolean estado) {
        this.codigoCamion = codigoCamion;
        this.patente = patente;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public long getCodigoCamion() {
        return codigoCamion;
    }

    public void setCodigoCamion(long codigoCamion) {
        this.codigoCamion = codigoCamion;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
