package Punto_4_5_Y_6;

public class Punto_5_6 {
	Estudiante maryJones = new Estudiante("Mary Jones", 14, 3.5, 46.0);
	Estudiante johnStiner = new Estudiante("John Stiner", 60, 2.8, 173.0);
	Estudiante ariSamala = new Estudiante("Ari Samala", 31, 3.2, 69.0);


	int credits = ariSamala.getCredits();
	int qualityPoints = ariSamala.getQualityPoints();;
	ariSamala.setCredits(credits + 3);
	ariSamala.setQualityPoints(qualityPoints + 52)

	ariSamala.inputCreditsAndQualityPoints();
	}