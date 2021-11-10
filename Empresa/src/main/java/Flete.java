public class Flete {
    private long codigoFlete;
    private String descripcion;

    public Flete(long codigoFlete, String descripcion) {
        this.codigoFlete = codigoFlete;
        this.descripcion = descripcion;
    }

    public long getCodigoFlete() {
        return codigoFlete;
    }

    public void setCodigoFlete(long codigoFlete) {
        this.codigoFlete = codigoFlete;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
