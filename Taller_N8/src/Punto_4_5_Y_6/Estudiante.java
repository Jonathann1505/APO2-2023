package Punto_4_5_Y_6;

public class Estudiante {
    String nombre;
    int creditos;
    double gpa;
    double puntosCalidad;

    public Estudiante(String nombre, int creditos, double gpa, double puntosCalidad) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.gpa = gpa;
        this.puntosCalidad = puntosCalidad;
    }

    public double getPromedioPonderado() {
        return puntosCalidad / creditos;
    }

    public void agregarClase(int creditos, double puntosCalidad) {
        this.creditos += creditos;
        this.puntosCalidad += puntosCalidad;
        this.gpa = puntosCalidad / this.creditos;
    }



	
}
