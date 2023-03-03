
public class Punto_3 
{
	
	
public static void main(String[] args) {
	

		System.out.println("Punto 2");
		puntoDos();
		
		System.out.println("\nPunto 3");
		puntoTres();
		
	}
	
	public static void puntoDos() {
		
		
		String s1 = "ABC";
		String s2 = new String("DEF");
		String s3 = "AB" + "C";
		
		
		System.out.println("a. " + s1.compareTo(s2));
		System.out.println("b. " + s2.equals(s3));
		System.out.println("c. " + (s3 == s1));
		System.out.println("d. " + s2.compareTo(s3));
		System.out.println("e. " + s3.equals(s1));
	
	}
	
	public static void puntoTres() {
		String string1 = "ABC";
		String string2 = "def";
		
		String string3 = string1.concat(string2);
		System.out.println("String: " + string3);
	}
}


