public class Main {

    public static void main(String[] args) {

        System.out.println("--- BIENVENIDO AL SISTEMA DE RESERVAS TECH STORE ---");

        Reserva ipad = new Reserva("Apple Ipad Air 13", 1000000, 23);

        Reserva mousePad = new Reserva("MousePad Gamer Speed Primal GX", 6990, 14);

        ipad.mostrarInformacion();
        mousePad.mostrarInformacion();

        System.out.println("-- VENTAS --");

        ipad.reservar(20);
        mousePad.reservar(6);

        ipad.mostrarInformacion();
        mousePad.mostrarInformacion();

        System.out.println("-- Compra aplicando IVA --");
        double precioConIva = ipad.calcularPrecioConIva();
        System.out.println("Precio con iva del Ipad: " + precioConIva);

        System.out.println("-- Compra normal --");
        int cantidad = 5;
        double totalCompra = ipad.calcularTotal(cantidad, 15);

        System.out.println("Cantidad: " + cantidad);
        System.out.println("Total: " + totalCompra);

        System.out.println("-- Compra con descuento --");
        double totalDescuento = ipad.calcularTotal(3, 20);

        System.out.println("Total von 20% de descuento: " + totalDescuento);

        System.out.println("Fin del programa TECH STORE");

    }
}
