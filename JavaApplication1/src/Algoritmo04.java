import java.util.Scanner;
public class Algoritmo04 {
    public static void main(String[] args) {
        float costo_minutos, costo_planilla;
        int  minutos_consumidosmes;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el costo por minutos consumidos: ");
        costo_minutos = teclado.nextFloat();
        System.out.print("Ingrese los minutos consumidos en el mes: ");
        minutos_consumidosmes = teclado.nextInt();
        costo_planilla = costo_minutos * minutos_consumidosmes;
        System.out.print("El costo total de la planilla es : " + costo_planilla);
    }
}
/**
 *SALIDA DE RESULTADOS
 * Debug:
 * Ingrese el costo por minutos consumidos: 5
 * Ingrese los minutos consumidos en el mes: 100
 * El costo total de la planilla es : 500.0
 */