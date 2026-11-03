// Ejercicio 1 - Variables y tipos de dato

public class Ejercicio1Variables {

    public static void main(String[] args) {

        String nombreProducto = "Capuchino";
        double precioUnitario = 3.50;
        int cantidadInventario = 48;
        boolean disponibleHoy = true;
        char codigoProducto = 'C';

        System.out.println("========== PRODUCTO DE LA CAFETERIA ==========");
        System.out.println(String.format("Nombre del producto    : %s", nombreProducto));
        System.out.println(String.format("Precio unitario        : $%.2f", precioUnitario));
        System.out.println(String.format("Cantidad en inventario : %d unidades", cantidadInventario));
        System.out.println(String.format("Disponible hoy         : %b", disponibleHoy));
        System.out.println(String.format("Codigo del producto    : %c", codigoProducto));
    }
}
