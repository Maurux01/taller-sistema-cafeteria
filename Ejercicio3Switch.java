// Ejercicio 3 - switch

public class Ejercicio3Switch {

    public static void main(String[] args) {
        char categoria = 'K';
        mostrarCategoria(categoria);
    }

    static void mostrarCategoria(char categoria) {
        String descripcion;
        int iva;

        switch (categoria) {
            case 'B':
                descripcion = "Bebida caliente";
                iva = 0;
                break;
            case 'F':
                descripcion = "Bebida fria";
                iva = 5;
                break;
            case 'C':
                descripcion = "Comida";
                iva = 8;
                break;
            case 'P':
                descripcion = "Postre";
                iva = 8;
                break;
            default:
                System.out.println("Codigo no reconocido: " + categoria);
                System.out.println("Porfavor ingrese un codigo de la siguiente lista: ");
                System.out.println("B: Bebida caliente");
                System.out.println("F: Bebida fria");
                System.out.println("C: Comida");
                System.out.println("P: Postre");
                return;
        }

        System.out.println("categoria ingresada: " + categoria + " -> " + descripcion + " | IVA: " + iva + "%");
    }
}
