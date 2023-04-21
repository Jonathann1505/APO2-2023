package Ejercicio_Tres;


public class Main {
	public static void main(String[] args) {
		
		Punto_3 ISBN = new Punto_3(null);
		
		ISBN.setISBN(125478);
		
		Punto_3 titulo = new Punto_3(null);
		
		titulo.setTitulo("Mil leguas bajo el mar");
		Punto_3 pag = new Punto_3(null);
		
		pag.setPag(500);
		
		Punto_3 autor = new Punto_3(null);
		
		autor.setAutor("Julian Calamaro");
		
		System.out.printf("El libro " +titulo.getTitulo() + " con el codigo "+ ISBN.getISBN() + " Su autor es " + autor.getAutor() + " contiene una cantidad de paginas de "+pag.getPag());
		
		
	
	}

}
