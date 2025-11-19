package ejercicio5;
import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int millas;
		System.out.println("Introduce las millas: ");
		millas = teclado.nextInt();
		double kilometros = millas_a_kilometros(millas);
		System.out.println("Los kilometros son: " + kilometros);
		
	}
	
	public static double millas_a_kilometros(int millas) {
		
		double kilometros = millas * 1.6;
		return kilometros;
		
	}

}
