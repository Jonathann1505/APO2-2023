package Punto_8;

import java.util.Scanner;

public class Dos_Arreglos {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arregloA = null;
        int[] arregloB = null;

        while (true) {
        	System.out.println("Escriba su opcion en mayuscula por favor");
            System.out.println("Seleccione una opcion:");
            System.out.println("A. Ingresar Arreglo A");
            System.out.println("B. Ingresar Arreglo B");
            System.out.println("C. Mostrar A + B");
            System.out.println("D. Mostrar A - B");
            System.out.println("E. Mostrar A * B");
            System.out.println("F. Salir");
            System.out.println("Elegir letra: ");

            String opcion = scanner.nextLine();

            switch (opcion) {
                case "A":
                    arregloA = ingresarArreglo(scanner);
                    break;
                case "B":
                    arregloB = ingresarArreglo(scanner);
                    break;
                case "C":
                    mostrarResultado(arregloA, arregloB, '+');
                    break;
                case "D":
                    mostrarResultado(arregloA, arregloB, '-');
                    break;
                case "E":
                    mostrarResultado(arregloA, arregloB, '*');
                    break;
                case "F":
                    System.out.println("FIN");
                    return;
                default:
                    System.out.println("Opcion no valida.");
            }
        }
    }

    public static int[] ingresarArreglo(Scanner scanner) {
        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamano = scanner.nextInt();
        scanner.nextLine();

        int[] arreglo = new int[tamano];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingrese el valor del indice " + i + ": ");
            arreglo[i] = scanner.nextInt();
            scanner.nextLine();
        }

        return arreglo;
    }

    public static void mostrarResultado(int[] arregloA, int[] arregloB, char operacion) {
        if (arregloA == null || arregloB == null || arregloA.length != arregloB.length) {
            System.out.println("No se pueden realizar las operaciones.");
            return;
        }

        int[] resultado = new int[arregloA.length];

        for (int i = 0; i < arregloA.length; i++) {
            switch (operacion) {
                case '+':
                    resultado[i] = arregloA[i] + arregloB[i];
                    break;
                case '-':
                    resultado[i] = arregloA[i] - arregloB[i];
                    break;
                case '*':
                    resultado[i] = arregloA[i] * arregloB[i];
                    break;
                default:
                    System.out.println("Operacion no valida.");
                    return;
            }
        }

        System.out.print("El resultado de la operacion es: [");
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i]);
            if (i < resultado.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}