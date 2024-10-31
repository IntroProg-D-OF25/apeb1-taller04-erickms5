import java.util.Scanner;
public class Algoritmo01 {
    public static void main(String[] args) {
        //BLOQUE DE DECLARACIÓN DE VARIABLES -> DATOS DE ENTRADA Y SALIDA
        double base_triangulo, altura_triangulo, area_triangulo;
        Scanner teclado = new Scanner(System.in); //PARA LEER VALORES DESDE CONSOLA
        //BLOQUE DE LECTURA DE DATOS DE ENTRADA   
        System.out.print("Ingrese la base del triángulo: ");
        base_triangulo = teclado.nextDouble();
        System.out.print("Ingrese la altura del triángulo: ");
        altura_triangulo = teclado.nextDouble();
        //BLOQUE DE PROCESAMIENTO DE DATOS DE ENTRADA LEIDOS
        area_triangulo = (base_triangulo * altura_triangulo)/2 ;
        //BLOQUE DE SALIDA DE RESULTADOS
        System.out.print("El área del triángulo de base " + base_triangulo + " y altura " + altura_triangulo + " es : " + area_triangulo);       
    }
}
/**
 * SALIDA DE RESULTADIS
 * Debug:
 * Ingrese la base del tri�ngulo: 5
 * Ingrese la altura del tri�ngulo: 6
 * El �rea del tri�ngulo de base 5.0 y altura 6.0 es : 15.0
 */