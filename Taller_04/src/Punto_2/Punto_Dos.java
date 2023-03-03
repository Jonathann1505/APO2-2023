package Punto_2;
import java.util.Scanner;

public class Punto_Dos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Introduzca el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Introduzca el operador (+, -, *, /, %): ");
        char operador = scanner.next().charAt(0);

        double resultado;

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                System.out.println("El resultado es: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("El resultado es: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("El resultado es: " + resultado);
                break;
            case '/':
                resultado = num1 / num2;
                System.out.println("El resultado es: " + resultado);
                break;
            case '%':
                resultado = num1 % num2;
                System.out.println("El resultado es: " + resultado);
                break;
            default:
                System.out.println("Operador inválido");
                break;
        }

        if (operador == '+') {
            resultado = num1 + num2;
            System.out.println("El resultado es: " + resultado);
        } else if (operador == '-') {
            resultado = num1 - num2;
            System.out.println("El resultado es: " + resultado);
        } else if (operador == '*') {
            resultado = num1 * num2;
            System.out.println("El resultado es: " + resultado);
        } else if (operador == '/') {
            resultado = num1 / num2;
            System.out.println("El resultado es: " + resultado);
        } else if (operador == '%') {
            resultado = num1 % num2;
            System.out.println("El resultado es: " + resultado);
        } else {
            System.out.println("Operador inválido");
        }
    }
}