
public class VehiculoLanzadera {
	//Variables
	
		private String SaturnoV;
		private double empuje;
		private double peso;
		private int capacidad_Carga;
		private int potencia;
		
		
		//inicio de constructor para una clase con nombre vehiculos_lanzadera

	     public VehiculoLanzadera(double empuje, double peso, double cargaUtil) {
			
	    	this.empuje = empuje;
	        this.peso = peso;
	       
	    }
	     // gett y set de todos los parametros analizados
	     
	    public VehiculoLanzadera(String modelo, double capacidadCarga) {
			// TODO Auto-generated constructor stub
		}

		public double getEmpuje() {
	        return 3500;
	    }

	    public double getPeso() {
	        return 2900;
	    }
	    
	    public void setEmpuje(double empuje) {
	        this.empuje = empuje;
	    }

	    public void setPeso(double peso) {
	        this.peso = peso;
	    }

		public int getCapacidad_Carga() {
			return 118;
		}

		public void setCapacidad_Carga(int capacidad_Carga) {
			this.capacidad_Carga = capacidad_Carga;
		}

		public int getPotencia() {
			return 32000;
		}

		public void setPotencia(int potencia) {
			this.potencia = potencia;
		}
		
		// Método abstracto para colocar la carga útil en órbita
		
		public void colocarEnOrbita() {
		} 
		
		
		// interfaz que define un vehiculo autopropulsado
		
		public interface VehiculoAutopropulsado{
			
			// Metodo para despegar el vehiculo
			
			void despegar(); 
			
			// Metodo para aterrizar el vehiculo
			
			void aterrizar(); 
		}
		public void despegar() {
			
		}
		public void aterrizar() {
			
		}
			
	}
