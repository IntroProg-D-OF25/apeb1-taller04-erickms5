import java.util.Scanner;
public class Algoritmo09 {
    public static void main(String[] args) {
        float base_triangulo, altura_rectangulo, area_poligono;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la base de los triangulos: ");
        base_triangulo = teclado.nextFloat();
        System.out.print("Ingrese la altura del rectangulo: ");
        altura_rectangulo = teclado.nextFloat();
        area_poligono = (((base_triangulo*altura_rectangulo)/2)*3) + (base_triangulo*base_triangulo) + (base_triangulo*altura_rectangulo);
        System.out.print("El area del poligono es : "+ area_poligono);
    }
}
/**
 * SALIDA DE RESULTADOS
 * Debug:
 * Ingrese la base de los triangulos: 2
 * Ingrese la altura del rectangulo: 1
 * El area del poligono es : 9.0
 */