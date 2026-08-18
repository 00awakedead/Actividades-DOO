public class Reserva {
    private String nombre;
    private double precio;
    private int cantidadDisponible;

    public Reserva(String nombre, double precio, int cantidadDisponible){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    public void mostrarInformacion(){
        System.out.println("----- PRODUCTO -----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio:$ " + precio);
        System.out.println("Cantidad: " + cantidadDisponible);
    }

    public void reservar(int cantidad){

        if (cantidad <= cantidadDisponible) {
            cantidadDisponible -= cantidad;

            System.out.println("Venta realizada: " + cantidad +  " unidad(es)");

        }else {
            System.out.println("El stock es insuficiente");

        }
    }

    public double calcularPrecioConIva(){
        double precioConIva = precio * 1.19;
        return precioConIva;
    }

    public double calcularTotal(int cantidad, double descuento){
        double total = precio * cantidad;
        double montoConDescuento = total * descuento/100;
        double totalConDescuento = total - montoConDescuento;

        return totalConDescuento;

    }

}
