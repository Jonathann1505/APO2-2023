
import java.util.Scanner;
public class Punto_7 {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int[] resultados = new int[5];
		        double suma = 0;

		        
		        for (int i = 0; i < resultados.length; i++) {
		            System.out.print("Ingrese la nota de sus pruebas " + (i+1) + ": ");
		            resultados[i] = scanner.nextInt();
		            suma += resultados[i];
		        }

		        double promedio = suma / resultados.length;

		        
		        System.out.println("Su promedio es: " + promedio);
		    }
		}

