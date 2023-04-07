package Punto_2_Y_3;

public class P3 {
    public static void main(String[] args) {
       
        Animal animal1 = new Animal();
        Animal animal2 = new Animal(60, 5, 3);

        
        System.out.println("El animal 1 tiene una velocidad de " + animal1.getSpeed() + " millas por hora.");
        System.out.println("El animal 2 tiene una velocidad de " + animal2.getSpeed() + " millas por hora.");
    }
}
