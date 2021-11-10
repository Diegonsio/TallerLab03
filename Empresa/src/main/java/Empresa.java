import java.util.ArrayList;

public class Empresa {
    private String nombreComercial;
    private String direccion;

    public ArrayList<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(ArrayList<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }

    private ArrayList<Sucursal> sucursales = new ArrayList<>();

    public Empresa(String nombreComercial, String direccion, ArrayList<Sucursal> sucursales) {
        this.nombreComercial = nombreComercial;
        this.direccion = direccion;
        this.sucursales = sucursales;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
