package Punto_6;

import java.util.Scanner;

public class Punto_Seis {

    public static void main(String[] args) {
        double Promedio;
        int Faltas;

        Scanner reader = new Scanner(System.in);
        System.out.println("Este programa determinará si eres exento del examen final.");
        System.out.println("Por favor, conteste a las siguientes preguntas.");

        System.out.println("Cuál es tu promedio en la clase?");
        Promedio = reader.nextDouble();

        System.out.println("Cuántas clases te has perdido?");
        Faltas = reader.nextInt();

        if ((Promedio >= 90 && Faltas <= 3) || (Promedio >= 80 && Faltas == 0))
            System.out.println("Felicidades, Estás exento del examen final.");
        else
            System.out.println("No estás exento del examen final.");
    }
}
