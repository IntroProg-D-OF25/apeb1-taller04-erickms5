import java.util.Scanner;
public class Algoritmo08 {
    public static void main(String[] args) {
        float cost_netflix, cost_youtube_premium, cost_dropbox, cost_spotify, pagar_mensual;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el valor mensual del servicio Netflix:  ");
        cost_netflix = teclado.nextFloat();
        System.out.print("Ingrese el valor mensual del servicio Youtube Premium:  ");
        cost_youtube_premium = teclado.nextFloat();
        System.out.print("Ingrese el valor mensual del servicio DopBox:  ");
        cost_dropbox = teclado.nextFloat();
        System.out.print("Ingrese el valor mensual del servicio Spotitfy:  ");
        cost_spotify = teclado.nextFloat();
        pagar_mensual = (cost_dropbox + cost_netflix + cost_spotify + cost_youtube_premium);
        System.out.println("El valor a pagar mensual es: " + pagar_mensual + (" $"));
        System.out.println("Si eres menor a 30 años se descuenta el 20% del total mensual, su valor a pagar es: " + (pagar_mensual-(pagar_mensual*0.20)) + (" $"));
    }
}
/**
 * SALIDA DE RESULTADOS
 * Debug:
 * Ingrese el valor mensual del servicio Netflix:  25
 * Ingrese el valor mensual del servicio Youtube Premium:  20
 * Ingrese el valor mensual del servicio DopBox:  30
 * Ingrese el valor mensual del servicio Spotitfy:  25
 * El valor a pagar mensual es: 100.0 $
 * Si eres menor a 30 a�os se descuenta el 20% del total mensual, su valor a pagar es: 80.0 $
 */