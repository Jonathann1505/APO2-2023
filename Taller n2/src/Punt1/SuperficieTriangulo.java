package Punt1;

	import java.util.Scanner;

	public class SuperficieTriangulo {
		
	    public SuperficieTriangulo() {
	    	
	        try (Scanner sc = new Scanner(System.in)) {
	        	
				System.out.print("Ingrese la base del triángulo: ");
				double base = sc.nextDouble();
				
				System.out.print("Ingrese la altura del triángulo: ");
				double altura = sc.nextDouble();

				double superficie = 1.0/2 * base * altura;

				System.out.println("La superficie del triángulo es: " + superficie);
			}
	    }
	}
	
	


