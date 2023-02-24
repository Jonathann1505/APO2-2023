package Punto3;

import java.util.Scanner;

public class Punt3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Ingrese el número de personas que se han apuntado: ");
        int numPersonas = sc.nextInt();

       
        int numAutobuses = numPersonas / 45;
        int numPersonasFurgonetas = numPersonas % 45;

        
        System.out.println("Número de autobuses necesarios: " + numAutobuses);
        System.out.println("Número de personas que tendrán que viajar en furgonetas: " + numPersonasFurgonetas);

}
}
