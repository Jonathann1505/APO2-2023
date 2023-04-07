package Punto_4_5_Y_6;

public class main {
    public static void main(String[] args) {
        
        Estudiante estudiante = new Estudiante("Juan", 12, 3.5, 42.0);

        
        System.out.println("El promedio ponderado actual de " + estudiante.nombre + " es " + estudiante.getPromedioPonderado());
   
        estudiante.agregarClase(3, 12.0);

        System.out.println(estudiante.nombre + " ahora tiene " + estudiante.creditos + " créditos, " + estudiante.puntosCalidad + " puntos de calidad y un GPA de " + estudiante.gpa);
    }
}
