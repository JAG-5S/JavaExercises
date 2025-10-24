package ejercicio12;
import java.util.Scanner;
public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		long resultado, valorA, valorB, contador = 0;
		
			System.out.print("Introduce un numero: ");
			valorA = teclado.nextInt();
			System.out.print("Introduce su potencia: ");
			valorB = teclado.nextInt();
		
			resultado = valorA;
		if (valorB < 0) {	
			long contadorPositivo = valorB * -1, valorC = valorA * -1;
			
			for (int i = 1; i < contadorPositivo; i++ ) {
				resultado = resultado * valorC;
			}
			System.out.println("El resultado es: " + resultado);
		} else {
			for (int i = 1; i < valorB; i++ ) {
				resultado = resultado * valorA;
			}
			System.out.println("El resultado es: " + resultado);
		}
		
		
	}

}
