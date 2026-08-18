public class Reserva {
    private String producto;
    private double precio;
    private int cantidadDisponible;

    public Reserva(String producto, double precio, int cantidadDisponible){
        this.producto = producto;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    public void mostrarInformacion(){
        System.out.println("----- PRODUCTO -----");
        System.out.println("Nombre: " + producto);
        System.out.println("Precio:$ " + precio);
        System.out.println("Cantidad: " + cantidadDisponible);
    }

    public void reservar(int cantidad){

        if (cantidad <= 0){
            System.out.println("La cantidad a reservar debe ser mayor a 0");
        }else if (cantidad > cantidadDisponible) {
            System.out.println("El stock es insuficiente");
        }
        else{
            cantidadDisponible -= cantidad;
            System.out.println("Venta realizada: " + cantidad + " unidad(es)");
            System.out.println("Stock restante: " +  cantidadDisponible);
        }
    }

    public double calcularPrecioConIva(){
        double precioConIva = precio * 1.19;
        return precioConIva;
    }

    public double calcularTotal(int cantidad) {
        if (cantidad <= 0 || cantidad > cantidadDisponible) {
            System.out.println("Cantidad invalida.");
            return 0;
        }
        return precio * cantidad;
    }

    public double calcularTotal(int cantidad, double descuento) {
        double total = calcularTotal(cantidad);

        double montoConDescuento = total * descuento / 100;
        double totalConDescuento = total - montoConDescuento;

        return totalConDescuento;
    }

}
