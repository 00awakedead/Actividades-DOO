import java.sql.SQLOutput;

public class Main {


    //el inicio de mi aplicación
    public static void main(String[] args) {

        System.out.println("BIENVENIDO A TECH STORE");

        //Crear objetos o instancias
        //1.- NombreClase, 2.- nombre objeto, 3.- = new NombreClase, 4.- (poblar argumentos = datos del producto);
        Producto cargador = new Producto("Cargador Iphone carga rápida", 100000,100);

        Producto teclado = new Producto("Teclado", 35000.0,20);

        //Ejecutar el método sin argumentos

        cargador.mostrarInformacion();
        teclado.mostrarInformacion();

        //Venta //con argumento

        System.out.println("VENTAS");
        cargador.vender(10);
        teclado.vender(15);

        //Mostrar info una vez vendidos
        cargador.mostrarInformacion();
        teclado.mostrarInformacion();

        //IVA
        System.out.println("PRECIO CON IVA");
        double precioConIva = teclado.calcularPrecioConIva();
        System.out.println("PRECIO CON IVA del teclado: " + precioConIva);

        //Mostrar precio de la compra
        System.out.println("Compra normal");
        int cantidad = 3;
        //Calcular el total utilizando un metodo con arg y retorno
        double totalCompra = teclado.calcularPrecioFinal(cantidad, 20);

        //mostramos resultado retornado
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Total: " + totalCompra);

        //Mostrar la sobrecarga
        System.out.println("COmpra con descuento");
        double totalDescuento = teclado.calcularPrecioFinal(2, 30);

        //Mostramos el total después del descuento
        System.out.println("Total von 30% de descuento: " + totalDescuento);

        //
        System.out.println("Fin del programa TECH STORE");
    }
}
