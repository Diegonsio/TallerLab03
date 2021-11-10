import java.util.ArrayList;

public class Controlador {
    private Empresa empresa;

    public Controlador(){
        ArrayList<Camion> camiones = new ArrayList<>();
        ArrayList<Sucursal> sucursales = new ArrayList<>();
        sucursales.add(new Sucursal(0001, "Araucania", camiones ))
        this.empresa = new Empresa("Empresa 1", "Avenida Republica 912", sucursales);

    }
}
