import java.util.Scanner;

//nombre de la clase
public class Principal {
	
	
	
	//metodo principal
	public static void main(String[] args) {
		
		System.out.print("Ingrese la palabra: ");
		//Clase que permite capturar datos por consola
		Scanner sc = new Scanner (System.in);
		
		
		
			String prueba = sc.next();
			System.out.println("La cantidad de letras que tiene la palabra es: " + prueba.length() );
	}
}
