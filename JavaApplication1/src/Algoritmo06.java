import java.util.Scanner;
public class Algoritmo06 {
    public static void main(String[] args) {
        float monto_prestamo, interes, pago_mensual;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el monto del prestamo: ");
        monto_prestamo = teclado.nextFloat();
        System.out.print("Ingrese el interes mensual: ");
        interes = teclado.nextFloat();
        pago_mensual = (((monto_prestamo/12)*interes)/100) + (monto_prestamo / 12);
        System.out.print("El pago mensual sera: " + pago_mensual + " $");
    }
}
/**
 * SALIDA DE RESULTADOS
 * Debug:
 * Ingrese el monto del prestamo: 12000
 * Ingrese el interes mensual: 8
 * El pago mensual sera: 1080.0 $
 */