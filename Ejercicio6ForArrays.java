// Ejercicio 6 - for y arrays

public class Ejercicio6ForArrays {

    public static void main(String[] args) {
        String[] productos = {"Cafe americano", "Capuchino", "Jugo de naranja", "Tostada", "Brownie"};
        double[] precios = {3500, 5000, 4000, 4500, 6000};

        System.out.println("========== MENU DEL DIA ==========");
        for (int i = 0; i < productos.length; i++) {
            System.out.println((i + 1) + ". " + productos[i] + " - $" + precios[i]);
        }

        double suma = 0;
        for (double p : precios) {
            suma += p;
        }
        double promedio = suma / precios.length;
        System.out.println("Precio promedio: $" + promedio);
    }
}
