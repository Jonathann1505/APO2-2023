package Vehicles;

public class TestVehicle {

	public static void main(String[] args) {
		Vehicle vehicle1 = new Vehicle("Vision");
		Vehicle vehicle2 = new Vehicle("Edict");
	    System.out.println("Manufacturer: " + Vehicle.MAKE);
	    System.out.println("Number of vehicles manufactured: " + Vehicle.numVehicles);
	    System.out.println("Vehicle 1:");
	    System.out.println(vehicle1.toString());

	    System.out.println("Vehicle 2:");
	    System.out.println(vehicle2.toString());
	    Vehicle.printTotalVehicles();
	    
	}
}
