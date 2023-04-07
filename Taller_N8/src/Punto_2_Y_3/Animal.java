package Punto_2_Y_3;

public class Animal {
	int weight, height; double speed; Animal () {
		weight = 50;
		height = 4;
		speed = 2; 
}
		Animal (int w, int h, int s) {
			weight = w; h = height; speed = s;
		}
		public double getTime(double miles) {
			return miles; 
		}
		
		public int getWeight() {
			return weight;
		}	
		public int getHeight() {
			return height;
		}
		public double getSpeed() {
			return speed;
		}
}
