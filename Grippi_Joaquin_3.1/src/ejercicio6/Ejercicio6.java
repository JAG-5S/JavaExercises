/*
 * Autor: Joaquin Grippi
 * Descripcion: Programa que pide dos valores enteros y posteriormente cree un array con el tamaño de n y m en todas sus posiciones.
 * fecha: 13/11/25
 */
package ejercicio6;
import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numeroA, numeroB;
		
		System.out.print("Introduce un numero: ");
		numeroA = teclado.nextInt();
		System.out.print("Introduce un numero: ");
		numeroB = teclado.nextInt();
		
		int numeros[] = new int[numeroA];
		
			for (int i = 0; i < numeroA; i++) {
				numeros[i] = numeroB;
				System.out.println("En la posicion " + i + " del array, el valor es: " + numeros[i]);
				
			}
		
		
	}
	
}
