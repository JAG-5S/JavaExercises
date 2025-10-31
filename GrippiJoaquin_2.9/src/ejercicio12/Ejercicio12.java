/*
 * Autor:Joaquin Grippi
 * Descripcion:Escribe un programa Java que calcule el valor A elevado a B (A^B) sin hacer uso del operador depotencia (^), siendo A y B valores introducidos por teclado, y luego muestre el resultado porpantalla.
 * Fecha: 24/10/25
 */
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
