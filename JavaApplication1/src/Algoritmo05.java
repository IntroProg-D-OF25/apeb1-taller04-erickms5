import java.util.Scanner;
public class Algoritmo05 {
    public static void main(String[] args) {
        float costo_CPU, costo_teclado, costo_pantalla, costo_raton, costo_total;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el costo del CPU: ");
        costo_CPU = teclado.nextFloat();
        System.out.print("Ingrese el costo del teclado: ");
        costo_teclado = teclado.nextFloat();
        System.out.print("Ingrese el costo del pantalla: ");
        costo_pantalla = teclado.nextFloat();
        System.out.print("Ingrese el costo del raton: ");
        costo_raton = teclado.nextFloat();
        costo_total = costo_CPU + costo_pantalla + costo_raton + costo_teclado;
        System.out.print("El costo total de la computadora de escritorio es: " + costo_total);
    }
}
/**
 * SALIDA DE RESULTADOS
 * Debug:
 * Ingrese el costo del CPU: 50
 * Ingrese el costo del teclado: 10
 * Ingrese el costo del pantalla: 60
 * Ingrese el costo del raton: 30
 * El costo total de la computadora de escritorio es: 150.0
 */