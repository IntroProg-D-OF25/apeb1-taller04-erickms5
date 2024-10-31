import java.util.Scanner;
public class Algoritmo02 {
    public static void main(String[] args) {
        //BLOQUE DE DECLARACIÓN DE VARIABLES -> DATOS DE ENTRADA Y SALIDA
        double gastos_hijo1, gastos_hijo2, gastos_hijo3, gastos_totales;
        Scanner teclado = new Scanner(System.in); //PARA LEER VALORES DESDE CONSOLA
        //BLOQUE DE LECTURA DE DATOS DE ENTRADA   
        System.out.print("Ingrese los gastos del primer hijo: ");
        gastos_hijo1 = teclado.nextDouble();
        System.out.print("Ingrese los gastos del segundo hijo: ");
        gastos_hijo2 = teclado.nextDouble();
        System.out.print("Ingrese los gastos del tercer hijo: ");
        gastos_hijo3 = teclado.nextDouble();
        //BLOQUE DE PROCESAMIENTO DE DATOS DE ENTRADA LEIDOS
        gastos_totales = gastos_hijo1 + gastos_hijo2 + gastos_hijo3;
        //BLOQUE DE SALIDA DE RESULTADOS
        System.out.print("Los gastos totales de los 3 hijos son: " + gastos_totales);
    }
}
/**
 * SALIDA DE RESULTADOS
 * Debug:
 * Ingrese los gastos del primer hijo: 15,50
 * Ingrese los gastos del segundo hijo: 9,50
 * Ingrese los gastos del tercer hijo: 10
 * Los gastos totales de los 3 hijos son: 35.0
 * 
 */