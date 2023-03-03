package Punto_7;
import java.util.Scanner;

public class Punto_Siete {

    public static void main(String[] args) {

        final int PIES_CUADRADOS_POR_BOTE_GRANDE = 1500;
        final int PIES_CUADRADOS_POR_BOTE_PEQUENO = 300;
        final int PRECIO_BOTE_GRANDE = 15;
        final int PRECIO_BOTE_PEQUENO = 4;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la altura de la habitación en pies: ");
        double altura = scanner.nextDouble();

        System.out.println("Ingrese la longitud de la habitación en pies: ");
        double longitud = scanner.nextDouble();

        System.out.println("Ingrese el ancho de la habitación en pies: ");
        double ancho = scanner.nextDouble();

        double areaDeParedes = 2 * altura * (longitud + ancho);
        double areaDeTecho = longitud * ancho;
        double areaTotal = areaDeParedes + areaDeTecho;

        int numBotesGrandes = (int) Math.ceil(areaTotal / PIES_CUADRADOS_POR_BOTE_GRANDE);
        int numBotesPequenos = (int) Math.ceil((areaTotal - numBotesGrandes * PIES_CUADRADOS_POR_BOTE_GRANDE)
                / PIES_CUADRADOS_POR_BOTE_PEQUENO);

        double costoTotal = numBotesGrandes * PRECIO_BOTE_GRANDE + numBotesPequenos * PRECIO_BOTE_PEQUENO;

        System.out.println("Para pintar la habitación, necesitará:");
        System.out.println(numBotesGrandes + " botes grandes de pintura");
        System.out.println(numBotesPequenos + " botes pequeños de pintura");
        System.out.println("El número óptimo de botes es: " + (numBotesGrandes + numBotesPequenos));
        System.out.println("El costo total será de: $" + costoTotal);
    }
}