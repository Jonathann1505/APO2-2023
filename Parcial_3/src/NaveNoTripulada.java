import java.util.List;

public abstract class NaveNoTripulada {

	public String nombre;
	public List<String> combustible;
	public Double empuje = 45.39;
	public Double velocidad;
	public Boolean activa;

	
	
	//Metodos de saturno y sus lunas
	
	public void SondaEspacial(String nombre, List<String> combustible, Double empuje, Double velocidad, Boolean activa) {
	    this.nombre = nombre;
	    this.combustible = combustible;
	    this.empuje = empuje;
	    this.velocidad = velocidad;
	    this.activa = activa;
	}

	
	public String getNombre() {
	    return nombre;
	}

	public void setNombre(String nombre) {
	    this.nombre = nombre;
	}


	public List<String> getCombustible() {
	    return combustible;
	}

	public void setCombustible(List<String> combustible) {
	    this.combustible = combustible;
	}

	public Double getEmpuje() {
	    return empuje;
	}

	public void setEmpuje(Double empuje) {
	    this.empuje = empuje;
	}

	public Double getVelocidad() {
	    return velocidad;
	}

	public void setVelocidad(Double velocidad) {
	    this.velocidad = velocidad;
	}


	public Boolean getActiva() {
	    return activa;
	}

	public void setActiva(Boolean activa) {
	    this.activa = activa;
	}
	
	   public abstract void desplazarse();
	   
	   interface ProyectoSonda {
		    String AGENCIA_NASA = "NASA";
		    String AGENCIA_ESA = "ESA";
		    String AGENCIA_ASI = "ASI";

		    void ejecutarProyecto();
		    boolean estaActivo();
		}
	
	
	//Metodos de Jupiter
	
	public void PioneroX(String nombre, List<String> combustible, Double empuje, Double velocidad, Boolean activa) {
		this.nombre = nombre;
	    this.combustible = combustible;
	    this.empuje = empuje;
	    this.velocidad = velocidad;
	    this.activa = activa;
	}

	
	public String getNombre1() {
	    return nombre;
	}

	public void setNombre1(String nombre) {
	    this.nombre = nombre;
	}


	public List<String> getCombustible1() {
	    return combustible;
	}

	public void setCombustible1(List<String> combustible) {
	    this.combustible = combustible;
	}

	public Double getEmpuje1() {
	    return empuje;
	}

	public void setEmpuje1(Double empuje) {
	    this.empuje = empuje;
	}

	public Double getVelocidad1() {
	    return velocidad;
	}

	public void setVelocidad1(Double velocidad) {
	    this.velocidad = velocidad;
	}


	public Boolean getActiva1() {
	    return activa;
	}

	public void setActiva1(Boolean activa) {
	    this.activa = activa;
	}
	
	
	public void PioneroXI(String nombre, List<String> combustible, Double empuje, Double velocidad, Boolean activa) {
		this.nombre = nombre;
	    this.combustible = combustible;
	    this.empuje = empuje;
	    this.velocidad = velocidad;
	    this.activa = activa;
	}
		
		public String getNombre2() {
		    return nombre;
		}

		public void setNombre2(String nombre) {
		    this.nombre = nombre;
		}


		public List<String> getCombustible2() {
		    return combustible;
		}

		public void setCombustible2(List<String> combustible) {
		    this.combustible = combustible;
		}

		public Double getEmpuje2() {
		    return empuje;
		}

		public void setEmpuje2(Double empuje) {
		    this.empuje = empuje;
		}

		public Double getVelocidad2() {
		    return velocidad;
		}

		public void setVelocidad2(Double velocidad) {
		    this.velocidad = velocidad;
		}


		public Boolean getActiva2() {
		    return activa;
		}

		public void setActiva2(Boolean activa) {
		    this.activa = activa;
		}
		
		// Metodo para pluton
		
		public void NewHorizon(String nombre, List<String> combustible, Double empuje, Double velocidad, Boolean activa) {
			this.nombre = nombre;
		    this.combustible = combustible;
		    this.empuje = empuje;
		    this.velocidad = velocidad;
		    this.activa = activa;
		}
			
			public String getNombre3() {
			    return nombre;
			}

			public void setNombre3(String nombre) {
			    this.nombre = nombre;
			}


			public List<String> getCombustible3() {
			    return combustible;
			}

			public void setCombustible3(List<String> combustible) {
			    this.combustible = combustible;
			}

			public Double getEmpuje3() {
			    return empuje;
			}

			public void setEmpuje3(Double empuje) {
			    this.empuje = empuje;
			}

			public Double getVelocidad3() {
			    return velocidad;
			}

			public void setVelocidad3(Double velocidad) {
			    this.velocidad = velocidad;
			}


			public Boolean getActiva3() {
			    return activa;
			}

			public void setActiva3(Boolean activa) {
			    this.activa = activa;
			}
			
			public interface Motor {
				   public double getEmpuje();
				}
			public abstract class SondaPluton extends NaveNoTripulada {
				   private String objetivo;

				   public void setObjetivo(String objetivo) {
				      this.objetivo = objetivo;
				   }

				   public String getObjetivo() {
				      return objetivo;
				   }

				   public abstract void analizarObjetivo();
				}


			protected abstract String getProposito();
}

	

	

