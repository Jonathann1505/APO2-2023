import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Nave> inventarioNaves = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {
            System.out.println("¿Deseas crear una nave?");
            System.out.print("Ingresa 's' para sí o 'n' para no: ");
            String opcion = scanner.nextLine();

            if (opcion.equalsIgnoreCase("s")) {
                System.out.println("Selecciona el tipo de nave que deseas crear:");
                System.out.println("1. Nave no tripulada");
                System.out.println("2. Nave tripulada");
                System.out.println("3. Vehículo lanzadera");
                System.out.println("4. Buscar una nave");
                System.out.print("Ingresa el número de opción: ");
                int tipoNave = scanner.nextInt();
                scanner.nextLine();

                switch (tipoNave) {
                    case 1:
                        crearNaveNoTripulada(scanner);
                        break;
                    case 2:
                        crearNaveTripulada(scanner);
                        break;
                    case 3:
                        crearVehiculoLanzadera(scanner);
                        break;
                    case 4:
                        buscarNave(scanner);
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        break;
                }
            } else if (opcion.equalsIgnoreCase("n")) {
                continuar = false;
                System.out.println("Programa terminado.");
            } else {
                System.out.println("Opción no válida.");
            }
        }
    }

    private static void buscarNave(Scanner scanner) {
    	 System.out.print("Ingresa el modelo de la nave que deseas buscar: ");
         String modeloBusqueda = scanner.nextLine();

         boolean encontrada = false;

         Nave[] inventarioNaves = null;
 		for (Nave nave : inventarioNaves) {
             if (nave.getModelo().equalsIgnoreCase(modeloBusqueda)) {
                 encontrada = true;
                 System.out.println("Nave encontrada:");
                 System.out.println("Modelo: " + nave.getModelo());

                 if (nave instanceof NaveNoTripulada) {
                     NaveNoTripulada naveNoTripulada = (NaveNoTripulada) nave;
                     System.out.println("Tipo: Nave no tripulada");
                     System.out.println("Capacidad de carga: " + naveNoTripulada.getCapacidadCarga());
                 } else if (nave instanceof NaveTripulada) {
                     NaveTripulada naveTripulada = (NaveTripulada) nave;
                     System.out.println("Tipo: Nave tripulada");
                     System.out.println("Capacidad de pasajeros: " + naveTripulada.getCapacidadPasajeros());
                 } else if (nave instanceof VehiculoLanzadera) {
                     VehiculoLanzadera vehiculoLanzadera = (VehiculoLanzadera) nave;
                     System.out.println("Tipo: Vehículo lanzadera");
                     System.out.println("Capacidad de carga: " + vehiculoLanzadera.getCapacidadCarga());
                 }

                 break;
             }
         }

         if (!encontrada) {
             System.out.println("Nave no encontrada en el inventario.");
         }

         System.out.println();
		
	}

	private static void crearNaveNoTripulada(Scanner scanner) {
        System.out.println("Creando una nave no tripulada.");

        System.out.print("Ingresa el modelo de la nave: ");
        String modelo = scanner.nextLine();

        System.out.print("Ingresa la capacidad de carga de la nave: ");
        double capacidadCarga = scanner.nextDouble();
        scanner.nextLine();

        NaveNoTripulada naveNoTripulada = new NaveNoTripulada(modelo, capacidadCarga);
        inventarioNaves.add(naveNoTripulada);

        System.out.println("Nave no tripulada creada y agregada al inventario.");
        System.out.println();
    }

    private static void crearNaveTripulada(Scanner scanner) {
        System.out.println("Creando una nave tripulada.");
        System.out.print("Ingresa el modelo de la nave: ");
        String modelo = scanner.nextLine();

        System.out.print("Ingresa la capacidad de pasajeros de la nave: ");
        int capacidadPasajeros = scanner.nextInt();
        scanner.nextLine();

        NaveTripulada naveTripulada = new NaveTripulada(modelo, capacidadPasajeros);
        inventarioNaves.add(naveTripulada);

        System.out.println("Nave tripulada creada y agregada al inventario.");
        System.out.println();
    }

    private static void crearVehiculoLanzadera(Scanner scanner) {
        System.out.println("Creando un vehículo lanzadera.");

        System.out.print("Ingresa el modelo del vehículo lanzadera: ");
        String modelo = scanner.nextLine();

        System.out.print("Ingresa la capacidad de carga del vehículo lanzadera: ");
        double capacidadCarga = scanner.nextDouble();
        scanner.nextLine();

        VehiculoLanzadera vehiculoLanzadera = new VehiculoLanzadera(modelo, capacidadCarga);
        inventarioNaves.add(vehiculoLanzadera);

        System.out.println("Vehículo lanzadera creado y agregado al inventario.");
        System.out.println();
    }
}

class Nave {
    protected String modelo;

    public Nave(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }
}

class NaveNoTripulada extends Nave {
    private double capacidadCarga;

    public NaveNoTripulada(String modelo, double capacidadCarga) {
        super(modelo);
        this.capacidadCarga = capacidadCarga;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }
}

class NaveTripulada extends Nave {
    private int capacidadPasajeros;

    public NaveTripulada(String modelo, int capacidadPasajeros) {
        super(modelo);
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }
}

class VehiculoLanzadera extends Nave {
    private double capacidadCarga;

    public VehiculoLanzadera(String modelo, double capacidadCarga) {
        super(modelo);
        this.capacidadCarga = capacidadCarga;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }
    
}