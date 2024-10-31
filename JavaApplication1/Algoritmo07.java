import java.util.Scanner;
public class Algoritmo07 {
    public static void main(String[] args) {
        float costo_kWH, kW_consumidos, costo_planilla;
        Scanner teclado = new Scanner (System.in);
        System.out.print("Ingrese el costo de kilovatio/hora:  ");
        costo_kWH = teclado.nextFloat();
        System.out.print("Ingrese el número de kilovatios consumidos:  ");
        kW_consumidos = teclado.nextFloat();
        costo_planilla = costo_kWH * kW_consumidos;
        System.out.println("El costo de la planilla de luz es:  " + costo_planilla + " $");
        System.out.println("Si eres mayor de 65 años se descuenta el 10% del costo de la planilla, su valor a pagar es:  " + (costo_planilla - (costo_planilla*0.10))+(" $"));
    }
}
/**
 * SALIDA DE RESULTADOS
 * Debug:
 * Ingrese el costo de kilovatio/hora:  10
 * Ingrese el n�mero de kilovatios consumidos:  1000
 * El costo de la planilla de luz es:  10000.0 $
 * Si eres mayor de 65 a�os se descuenta el 10% del costo de la planilla, su valor a pagar es:  9000.0 $
 */