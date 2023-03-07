

public class Main {
	public static void main(String[] args) {
		Poo myCar = new Poo();
		
		myCar.setColor("blue");

		System.out.println(myCar.getColor());
		System.out.println("This car has " + myCar.getNumWheels() + " wheels");
	}
}