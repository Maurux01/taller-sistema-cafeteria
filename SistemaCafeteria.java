// Parte 2 - Sistema de turno de cafeteria

public class SistemaCafeteria {

    static final double UMBRAL_DESCUENTO = 12000;
    static final double PORCENTAJE_DESCUENTO = 0.10;
    static final int INDICE_BROWNIE = 4;
    static final int INVENTARIO_BROWNIE = 10;

    public static void main(String[] args) {

        String[] nombres = {"Cafe americano", "Capuchino", "Jugo naranja", "Tostada", "Brownie"};
        double[] precios = {3500, 5000, 4000, 4500, 6000};
        char[] categorias = {'B', 'B', 'F', 'C', 'P'};
        int[] pedidoProducto = {0, 2, 1, 4, 0, 3};
        int[] pedidoCantidad = {2, 1, 3, 1, 1, 2};

        int inventarioBrownie = INVENTARIO_BROWNIE;

        // Apertura de caja
        double[] intentos = {0.0, 50000.0};
        int idx = 0;
        double montoApertura;
        do {
            montoApertura = intentos[idx];
            idx++;
            System.out.println("Monto digitado: " + montoApertura);
        } while (montoApertura <= 0);

        int procesados = 0;
        double totalRecaudado = 0;
        int pedidoMayor = 0;
        double mayorValor = -1;

        for (int i = 0; i < pedidoProducto.length; i++) {
            int numero = i + 1;
            int indProd = pedidoProducto[i];
            int cantidad = pedidoCantidad[i];

            String nombre = nombres[indProd];
            double precio = precios[indProd];
            char cat = categorias[indProd];
            double subtotal = precio * cantidad;

            System.out.println();
            System.out.println("Pedido #" + numero);

            // Validacion de inventario para Brownie
            if (indProd == INDICE_BROWNIE) {
                if (cantidad > inventarioBrownie) {
                    System.out.println("Producto agotado: " + nombre);
                    continue;
                }
                inventarioBrownie -= cantidad;
            }

            System.out.println("Producto: " + nombre);
            System.out.println("Cantidad: " + cantidad);
            System.out.println("Precio unitario: " + precio);
            System.out.println("Categoria: " + cat + " - " + describirCategoria(cat));
            System.out.println("Subtotal: " + subtotal);

            boolean aplica = subtotal > UMBRAL_DESCUENTO;
            double descuento = aplica ? subtotal * PORCENTAJE_DESCUENTO : 0;
            double totalPedido = subtotal - descuento;

            if (aplica) {
                System.out.println("Descuento 10%: " + descuento);
            } else {
                System.out.println("Sin descuento");
            }
            System.out.println("Total pedido: " + totalPedido);

            procesados++;
            totalRecaudado += totalPedido;
            if (totalPedido > mayorValor) {
                mayorValor = totalPedido;
                pedidoMayor = numero;
            }
        }

        System.out.println();
        System.out.println("========== REPORTE DE CIERRE ==========");
        System.out.println("Pedidos procesados: " + procesados + " de " + pedidoProducto.length);
        System.out.println("Total recaudado: " + totalRecaudado);
        System.out.println("Pedido de mayor valor: #" + pedidoMayor + " con " + mayorValor);
        System.out.println("Inventario final de Brownie: " + inventarioBrownie);
        System.out.println("Total en caja: " + (montoApertura + totalRecaudado));
    }

    static String describirCategoria(char categoria) {
        switch (categoria) {
            case 'B': return "Bebida caliente";
            case 'F': return "Bebida fria";
            case 'C': return "Comida";
            case 'P': return "Postre";
            default: return "No reconocida";
        }
    }
}
