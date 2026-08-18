//Molde de producto
public class Producto {
    //Atributos = caracteristicas
    private String nombre;//""
    private double precio;//100.0
    private int stock;// 90


    //Constructor = construye objetos = instancias => de una clase
    //debe ser publico, con el mismo nombre de la clase
    //(los argumentos de la clase = > atributos)

    //("Cargador Iphone carga rápida", 100000, 100)
    public Producto(String nombre, double precio, int stock){
        //Guardamos los datos recibidos y lo almacenamos en el atributo
        //para llamar al atributo this.nombreAtributo
        //primer dato es el atributo y el segundo dato es el argumento que estoy recibiendo
        //atributo = argumento = computador, 100000,
        //guardando los atributos recibidos dentro del objeto

        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    //Método sin argumento () y sin retorno = void
    //tipoMetodo = public o private
    //retornar = void
    //nombreMetodo(...)
    //{contenido}
    //metodo sin argumento ni retorno

    public void mostrarInformacion(){
        //Mostrar un titulo
        System.out.println("----- Producto -----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio:$ " + precio);
        System.out.println("cantidad: " + stock);

    }

    //Kétodo con argumento pero sin retorno
    public void vender(int cantidad){

        //verificar si existe el stock suficiente
        if(cantidad <= stock) {
            //restamos las unidades vendidas
            stock -= cantidad;

            //Informar que la venta fue realizada
            System.out.println("Venta realizada: " + cantidad + " unidad(es)");
        }else {
            //Informamos el problema
            System.out.println("El stock es insuficiente");
        }

    }


    //Método sin argumento pero con retorno
    public double calcularPrecioConIva(){
        //Calculamos el IVA
        double precioConIva = precio * 1.19; //19%
        return precioConIva;
    }

    //Método con argumento y retorno
    public double calcularPrecioFinal(int cantidad, double descuento){
        //calcular el precio normal de la compra
        double total = precio * cantidad;
        //calculamos el monto del descuento
        double montoDescuento = total * descuento/ 100;
        //calculamos el precio final
        double totalConDescuento = total - montoDescuento;

        return totalConDescuento;
    }
}
