import java.util.ArrayList;

public class Controlador {
    private Empresa empresa;
    ArrayList<Camion> camiones = new ArrayList<>();
    ArrayList<Sucursal> sucursales = new ArrayList<>();

    public Controlador() {

        sucursales.add(new Sucursal(0001, "Araucania", camiones))
        this.empresa = new Empresa("Empresa 1", "Avenida Republica 912", sucursales);

    }

    public void mostrarCamiones() {
        sucursales.get(0).showCamiones();
    }
    public void cambiarEstadoCamion(int camion){
        sucursales.get(0).getCamiones().get(camion);
    }
}
