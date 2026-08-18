public class Main {
    public static void main(String[] args){

        System.out.println("===== JUGADOR =====");

        String nombre = "Alex";
        int edad = 16;
        int nivel = 12;
        boolean tieneMembresia = true;
        int modoSeleccionado = 2;

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nivel: " + nivel);

        switch (modoSeleccionado){

            case 1:
                System.out.println("Modo: Historia\n");
                System.out.println("Acceso al modo: Autorizado\n");
                break;

            case 2:
                System.out.println("Modo: Competitivo\n");
                if(!tieneMembresia){
                    System.out.println("Acesso al modo: Rechazado");
                    System.out.println("No tiene membresia para ingresar a este modo\n");
                }else if(edad < 15){
                    System.out.println("Acceso al modo: Rechazado");
                    System.out.println("No cumple con la edad minima\n");
                }else if(nivel < 10){
                    System.out.println("Acceso al modo: Rechazado");
                    System.out.println("No tiene el nivel suficiente\n");
                }else{
                    System.out.println("Acceso al modo: Autorizado\n");
                }
                break;

            case 3:
                System.out.println("Modo: Entrenamiento\n");
                System.out.println("Acceso al modo: Autorizado\n");
                break;

            default:
                System.out.println("No se encontro el modo seleccionado\n");

        }

    }
}