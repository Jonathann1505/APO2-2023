package Punto_5;

import java.util.Scanner;

	public class Punto_Cinco {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca su nota media: ");
        double notaMedia = sc.nextDouble();
        System.out.print("Introduzca su puntuación SAT: ");
        int puntuacionSAT = sc.nextInt();

        if (notaMedia >= 4.0 && puntuacionSAT >= 1100
            || notaMedia >= 3.5 && puntuacionSAT >= 1300
            || notaMedia >= 3.0 && puntuacionSAT >= 1500) {
            System.out.println("Felicidades, cumple los requisitos para entrar a nuestra Universidad.");
        } else {
            System.out.println("No tienes lo suficiente para estar con nostros.");
        }
    }
}
