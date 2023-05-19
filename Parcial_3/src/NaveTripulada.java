import java.util.List;

public class NaveTripulada {
	// Variables 
	private String proposito;
    private List<String> misiones;
    private List<String> centros_investigacion;
    private double peso;
    private double distancia_orbita;
    private int capacidad_personas;
    
    
    
    


	public NaveTripulada(String modelo, int capacidadPasajeros) {
		
	}


	public void MisionEspacial(String proposito, List<String> misiones, List<String> centros_investigacion, double peso, double distancia_orbita, int capacidad_personas) {
        this.proposito = proposito;
        this.misiones = misiones;
        this.centros_investigacion = centros_investigacion;
        this.peso = peso;
        this.distancia_orbita = distancia_orbita;
        this.capacidad_personas = capacidad_personas;
    }
    
    
    	// gett y set de cada uno de los parametros anteriormente puestos
    
    public String getProposito() {
        return proposito;
    }

    public void setProposito(String proposito) {
        this.proposito = proposito;
    }

    public List<String> getMisiones() {
        return misiones;
    }

    public void setMisiones(List<String> misiones) {
        this.misiones = misiones;
    }

    public List<String> getCentros_investigacion() {
        return centros_investigacion;
    }

    public void setCentros_investigacion(List<String> centros_investigacion) {
        this.centros_investigacion = centros_investigacion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getDistancia_orbita() {
        return distancia_orbita;
    }

    public void setDistancia_orbita(double distancia_orbita) {
        this.distancia_orbita = distancia_orbita;
    }

    public int getCapacidad_personas() {
        return capacidad_personas;
    }

    public void setCapacidad_personas(int capacidad_personas) {
        this.capacidad_personas = capacidad_personas;
    }
 // clase abstracta para las naves espaciales tripuladas
    
    abstract class NaveEspacialTripulada {
    private int capacidadTripulacion;
    private int peso;

    public NaveEspacialTripulada(int capacidadTripulacion, int peso) {
    this.capacidadTripulacion = capacidadTripulacion;
    this.peso = peso;
    }

    public int getCapacidadTripulacion() {
    return capacidadTripulacion;
    }

    public int getPeso() {
    return peso;
    }

    // metodo abstracto para realizar una tarea en el espacio
    
    public abstract void realizarTareaEspacial();
    }

    // interfaz para naves espaciales
    
    interface NaveEspacialInvestigacion {
    public void estudiarComportamientoHumano();
    public void realizarExperimentos();
    }

    // interfaz para naves espaciales de mantenimiento
    
    interface NaveEspacialMantenimiento {
    public void repararSatelites();
    public void acoplarseConOtrasNaves();
    public void probarEquiposElectronicos();
    }

	public void realizarTareaEspacial() {
		// TODO Auto-generated method stub
		
	}
}


