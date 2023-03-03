import java.util.Scanner;

public class Punto_1 {
	
	public static void main(String[] args) {
		
		
		System.out.print("Ingrese Un numero aleatorio: ");
		Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
		
		boolean resultado = (x <= 7) ? true : false;
		
		System.out.println("El numero ingresado es " + x + ", Entonces " + x + " es menor o igual a 7:");
		System.out.print(resultado);
		
		
		






	}
	
}
