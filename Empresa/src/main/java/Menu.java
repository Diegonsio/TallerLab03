public class Menu {
    private LectorInt lector;

    public Menu() {


        int opcion;
        do {

            opcion = showMenu();


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
                break;
            case 3:
                break;
            case 4:
                break;

    } }
    private void menuEmbarque(){
    }
}
