package Ejercicio_Tres;


public class Punto_3 {
	/*Crear una clase Libro que contenga los siguientes atributos:
	– ISBN
	– Titulo
	– Autor
	– Número de páginas
	Crear sus respectivos métodos get y sets correspondientes 
	para cada atributo. Crear el método toString() para mostrar la información 
	relativa al libro con el siguiente formato:
	«El libro con ISBN creado por el autor tiene páginas»
	En el fichero main, crear 2 objetos Libro (los valores que se quieran) y mostrarlos por pantalla.
	Por último, indicar cuál de los 2 tiene más páginas.*/
	
	private String titulo;
	private int isbn;
	private String autor;
	private int pag;

	
	public Punto_3(String titulo) {
		setTitulo(titulo);
	
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getISBN() {
		return isbn;
	}

	public void setISBN(int isbn) {
		this.isbn = isbn;
	}
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
				
	}
	public int getPag() {
		return pag;
	}

	public void setPag(int pag) {
		this.pag = pag;
	}


	
	
}