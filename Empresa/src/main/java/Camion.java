import java.util.ArrayList;

public class Camion {
    private long codigoCamion;
    private String patente;
    private String descripcion;
    private boolean estado;

    public ArrayList<Pack> getPacks() {
        return packs;
    }

    public void setPacks(ArrayList<Pack> packs) {
        this.packs = packs;
    }

    private ArrayList<Pack> packs = new ArrayList<>();

    public Camion(long codigoCamion, String patente, String descripcion,boolean estado, ArrayList<Pack> packs) {
        this.codigoCamion = codigoCamion;
        this.patente = patente;
        this.descripcion = descripcion;
        this.estado = estado;
        this.packs = packs;
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
