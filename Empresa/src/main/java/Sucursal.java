import java.util.ArrayList;

public class Sucursal {
    private long codigoSucursal;
    private String region;

    public ArrayList<Camion> getCamiones() {
        return camiones;
    }

    public void setCamiones(ArrayList<Camion> camiones) {
        this.camiones = camiones;
    }

    private ArrayList<Camion> camiones = new ArrayList<>();

    public Sucursal(long codigoSucursal, String region, ArrayList<Camion> camiones) {
        this.codigoSucursal = codigoSucursal;
        this.region = region;
        this.camiones = camiones;
    }

    public long getCodigoSucursal() {
        return codigoSucursal;
    }

    public void setCodigoSucursal(long codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
