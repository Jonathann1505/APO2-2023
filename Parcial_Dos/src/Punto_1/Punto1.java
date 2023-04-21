package Punto_1;

import java.util.Scanner;


/*Crea un programa que pida al usuario por teclado 
 * una frase y que pase cada uno de sus caracteres a 
 * un array de caracteres y luego se imprima por consola 
 * los elementos de ese array.
 */
public static void main(String[] args) {
	
	public class Punto1 {
		
			
		
	public Punto1() {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Escriba una frase: ");
		

		String fra = sc.nextLine();
		
		int fraseLength = fra.length();
		
		
		char[] fraseChar = new char[fraseLength];

		for (int i = 0; i < fraseLength; i++) {
			
			fraseChar[i] = fra.charAt(i);
		}

		for (int i = 0; i < fraseChar.length; i++) {
			
			System.out.print("Los elementos son " + fraseChar[i]);
		}
	
	}
	
}

}
