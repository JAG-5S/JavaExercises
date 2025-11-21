package ejercicio12;
import java.util.Scanner;
public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double kilometros, millas;
		System.out.print("Introduce los kilometros : ");
		kilometros = teclado.nextDouble();
		millas = kilometrosAMillas(kilometros);
		System.out.println("Las Millas son: " + millas);
	
	}

	//Kilometros a Millas
	public static double kilometrosAMillas(double kilometros) {
		double millas = kilometros * 0.621371;
		return millas;
	}
}
