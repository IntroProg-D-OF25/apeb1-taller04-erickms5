import java.util.Scanner;
public class Algoritmo03 {
    public static void main(String[] args) {
        int multiplicando;
        Scanner teclado = new Scanner(System.in); 
        System.out.print("Ingrese un numero para mostrar su tabla de multiplicar: ");
        multiplicando = teclado.nextInt();
        System.out.println(multiplicando + " * 1 = " + (1 * multiplicando));
        System.out.println(multiplicando + " * 2 = " + (2 * multiplicando));
        System.out.println(multiplicando + " * 3 = " + (3 * multiplicando));
        System.out.println(multiplicando + " * 4 = " + (4 * multiplicando));
        System.out.println(multiplicando + " * 5 = " + (5 * multiplicando));
        System.out.println(multiplicando + " * 6 = " + (6 * multiplicando));
        System.out.println(multiplicando + " * 7 = " + (7 * multiplicando));
        System.out.println(multiplicando + " * 8 = " + (8 * multiplicando));
        System.out.println(multiplicando + " * 9 = " + (9 * multiplicando));
        System.out.println(multiplicando + " * 10 = " + (10 * multiplicando));
        System.out.println(multiplicando + " * 11 = " + (11 * multiplicando));
        System.out.println(multiplicando + " * 12 = " + (12 * multiplicando));     
    }
}
/**
 * SALIDA DE RESULTADOS
 * Debug:
 * Ingrese un numero para mostrar su tabla de multiplicar: 5
 * 5 * 1 = 5
 * 5 * 2 = 10
 * 5 * 3 = 15
 * 5 * 4 = 20
 * 5 * 5 = 25
 * 5 * 6 = 30
 * 5 * 7 = 35
 * 5 * 8 = 40
 * 5 * 9 = 45
 * 5 * 10 = 50
 * 5 * 11 = 55
 * 5 * 12 = 60
 */