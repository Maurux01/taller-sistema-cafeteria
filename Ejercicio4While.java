// Ejercicio 4 - while

import java.util.Random;

public class Ejercicio4While {

    public static void main(String[] args) {
         Random random = new Random();
        int numeroAleatorio = random.nextInt(3) + 1;
        int inventario = 50;
        int consumo =  numeroAleatorio;
        int limite = 10;
        int pedidos = 0;

        while (inventario >= limite) {
            pedidos++;
            inventario -= consumo;
            System.out.println("Pedido #" + pedidos + " -> inventario: " + inventario);
        }
        System.out.println("====================================");
        System.out.println("Pedidos atendidos: " + pedidos);
        System.out.println("Inventario final: " + inventario);
    }
}
