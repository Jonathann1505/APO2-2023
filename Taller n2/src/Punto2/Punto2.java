package Punto2;

public class Punto2 {
	
	
	public Punto2() {
		int x = 2, y= 3, z = 6;
		
		punto2A (x);
		punto2B (x, y);
		punto2C (x, y, z);
		punto2D (x, y, z);
		punto2E (x, y, z);
		punto2F (x, y, z);
		}
	public void punto2A(int x) {
		double ecuacionUno = (Math.sqrt(Math.pow(x, 5)-6)/ 4);
		System.out.println("El resultado del A es " + ecuacionUno);
	}
	public void punto2B(int x, int y) {
		
		double ecuacionDos = (Math.pow(x, y)- Math.pow(6, x));
		System.out.println("El resultado del B es " +ecuacionDos);
	}
	public void punto2C (int x,int y, int z) {
		double ecuaciontres = 4* Math.cos(z/5)-Math.sin(Math.pow(x, 2));
		System.out.println("El resultado del C es " +ecuaciontres);
	}
	public void punto2D (int x,int y, int z) {
		double ecuacioncuatro = Math.pow(x, 4)- Math.sqrt(6*x-Math.pow(y, 3));
		System.out.println("El resultado del D es " +ecuacioncuatro);
	}
	public void punto2E (int x,int y, int z) {
		double ecuacioncinco = 1/ y - (1/x-Math.pow(2, y));
		System.out.println("El resultado del E es " +ecuacioncinco);
	}
	public void punto2F (int x,int y, int z) {
		double ecuacionseis = 7*(Math.cos(Math.sqrt(5-Math.sin(Math.sqrt(3*x -4)))));
		System.out.println("El resultado del F es " +ecuacionseis);
		
	}
}
