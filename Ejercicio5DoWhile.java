// Ejercicio 5 - do-while

public class Ejercicio5DoWhile {

    public static void main(String[] args) {
        double[] intentos = {-500, 0, 250000};
        int i = 0;
        double monto;

        do {
            monto = intentos[i];
            i++;
            System.out.println("Intento: " + monto);
        } while (monto <= 0);

        System.out.println("Monto valido: " + monto);
    }
}
