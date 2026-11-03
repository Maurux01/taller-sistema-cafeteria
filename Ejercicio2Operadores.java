// Ejercicio 2 - Operadores

public class Ejercicio2Operadores {

    public static void main(String[] args) {

        double subtotal = 42500;
        double umbral = 30000;
        double porcentaje = 0.15;

        boolean aplicaDescuento = subtotal > umbral;
        double descuento = aplicaDescuento ? subtotal * porcentaje : 0;
        double total = subtotal - descuento;

        System.out.println("========== PEDIDO DE $42.500 ==========");
        System.out.printf("Subtotal              : $%.0f%n", subtotal);
        System.out.printf("Aplica descuento?     : %b%n", aplicaDescuento);
        System.out.printf("Descuento (15%%)       : $%.0f%n", descuento);
        System.out.printf("Total a pagar         : $%.0f%n", total);
    }
}
