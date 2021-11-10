public class Empresa {
    private String nombreComercial;
    private String direccion;

    public Empresa(String nombreComercial, String direccion) {
        this.nombreComercial = nombreComercial;
        this.direccion = direccion;
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
