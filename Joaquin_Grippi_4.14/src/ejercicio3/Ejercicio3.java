package ejercicio3;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valorA,valorB;
		System.out.print("asigna un valor para el valor A: ");
		valorA = teclado.nextInt();
		System.out.print("asigna un valor para el valor B: ");
		valorB = teclado.nextInt();
		
		int elMenorEs = cualEsMenor(valorA, valorB);
		
		System.out.println("El menor es: " + elMenorEs);
		
	}
	
	public static int cualEsMenor(int a, int b) {
		int elMenor;
		if (a < b) {
			elMenor = a;
		} else {
			elMenor = b;
		}
		
		return elMenor;
	}

}
