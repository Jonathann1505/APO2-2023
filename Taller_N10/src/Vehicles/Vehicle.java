package Vehicles;

public class Vehicle {

	public static String MAKE = "Seer";
	public static int numVehicles = 0;
	private static final int Capacity = 1600;
	private static final String Make = "Predicted";
	private static final int CHASSIS_PREFIX = 100;
    
    private static String getNextChassisNo() {
        return "ch" + (CHASSIS_PREFIX + numVehicles);
    }
	private String ChassisNo;
	private String model;
	
	
	public static int getNumVehicles() {
        return numVehicles;
    }
    
    public static String getMake() {
        return MAKE;
    }
    
    public static String getNextVehicleNo() {
        return getNextChassisNo();
    }
	public Vehicle(String model) {
	    numVehicles++;
	    this.ChassisNo = "ch" + numVehicles;
	    this.model = model;
	    System.out.println("Vehicle Manufactured");
	    }

	    public String getModel() {
	        return this.model;
	    }

	    public void setModel(String model) {
	        this.model = model;
	    }
	   

	    public String getChassisNo() {
	        return this.ChassisNo;
	    }

	    public void setChassisNo(String chassisNo) {
	        this.ChassisNo = chassisNo;
	    }
	    public String toString() {
	    	  return "Manufacturer: " + MAKE + "\nModel: " + model + "\nChassis Number: " + ChassisNo + "\nEngine: " + Engine.getMake() + " " + Engine.getCapacity() + "cc";
	    }
	    public static void printTotalVehicles() {
	        System.out.println("Number of vehicles manufactured " + numVehicles);
	    }
	    public static class Engine{

	        public static String getMake() {
	            return "Predicted";
	        }

			public static int getCapacity() {
	            return 1600;
	        }
	    }
	    	
	}

