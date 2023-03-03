package Punto_4;

import java.util.Scanner;

public class Punto_Cuatro {
public static void main(Scanner[] scanner) {
	
}
  public Punto_Cuatro(Scanner scanner) {
    double Peso, Conversion, PesoPlaneta;
    int opcion;


    System.out.print("Ingrese su peso en la Tierra (en libras): \n>> ");
    Peso = scanner.nextDouble();

 
    System.out.println("Seleccione un planeta del sistema solar:");
    System.out.println("1. Mercurio");
    System.out.println("2. Venus");
    System.out.println("3. Marte");
    System.out.println("4. Júpiter");
    System.out.println("5. Saturno");
    System.out.println("6. Urano");
    System.out.println("7. Neptuno");

   
    System.out.print("Ingrese la opción deseada: ");
    opcion = scanner.nextInt();

 
    String planeta = "";
    if (opcion == 1) {
    	Conversion = 0.38;
      planeta = "Mercurio";
    } else if (opcion == 2) {
    	Conversion = 0.91;
      planeta = "Venus";
    } else if (opcion == 3) {
    	Conversion = 0.38;
      planeta = "Marte";
    } else if (opcion == 4) {
    	Conversion = 2.36;
      planeta = "Júpiter";
    } else if (opcion == 5) {
    	Conversion = 0.92;
      planeta = "Saturno";
    } else if (opcion == 6) {
    	Conversion = 0.89;
      planeta = "Urano";
    } else if (opcion == 7) {
    	Conversion = 1.13;
      planeta = "Neptuno";
    } else {
      System.out.println("Opción inválida");
      return;
    }

    PesoPlaneta = Peso * Conversion;

 
    System.out.printf("Tu peso en el planeta %s es %.2f en libras.", planeta, PesoPlaneta);
  }
}