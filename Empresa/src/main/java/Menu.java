public class Menu {
    private LectorInt lector;
    private Controlador controlador;

    public Menu(Controlador controlador) {
        this.controlador=controlador;
        int opcion;
        do {
            opcion = showMenu();
            ejecutarOpcion(opcion);
        } while (opcion != 5);
    }

    private int showMenu() {
        System.out.println("1 - Agregar y quitar productos a un embarque");
        System.out.println("2 - Cambiar estado de camion");
        System.out.println("3 - Agregar y desvincular camiones");
        System.out.println("4 - Calcular valor embarque");
        System.out.println("5 - Salir");
        return lector.input(1, 5);

    }
    private void ejecutarOpcion(int opcion){
        switch(opcion){
            case 1:
                menuEmbarque();
                break;
            case 2:
               cambiarEstado();
                break;
            case 3:
                menuCamion();
                break;
            case 4:
                calcularValor();
                break;

    }
    }
    private void menuEmbarque(){
        int opcion;
        do {
            opcion = showMenuEmbarque();
            ejecutarEmbarque(opcion);
        } while (opcion != 3);

    }
    private int showMenuEmbarque(){
        System.out.println("1 - Agregar producto");
        System.out.println("2 - Quitar producto");
        System.out.println("3 - Volver");
        return lector.input(1,3);
    }
    private void ejecutarEmbarque(int opcion){
        switch(opcion){
            case 1:
                agregarProducto();
                break;
            case 2:
                quitarProducto();
                break;

        }
    }
    private void cambiarEstado(){
        controlador.mostrarCamiones();

    }

    private void menuCamion(){
        int opcion;
        do {
            opcion = showMenuCamion();
            ejecutarCamion(opcion);
        } while (opcion != 3);

    }
    private int showMenuCamion(){
        System.out.println("1 - Agregar camion");
        System.out.println("2 - Quitar camion");
        System.out.println("3 - Volver");
        return lector.input(1,3);
    }
    private void ejecutarCamion(int opcion){
        switch(opcion){
            case 1:
                agregarCamion();
                break;
            case 2:
                quitarCamion();
                break;

        }
    }
}
