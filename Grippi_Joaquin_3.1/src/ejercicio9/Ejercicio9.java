/*
 * Autor: Joaquin Grippi
 * Descripcion:Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá un valor N y mostrará en qué posiciones del array aparece N.
 * fecha: 13/11/25
 */
package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	int valorN;
	int numeros[] = new int[100];
	for (int i = 0; i < numeros.length; i++) {
		numeros[i] =(int) (1	 + Math.random() * 10);
		System.out.println(numeros[i]);
		}
	System.out.println("Introduce un numero: ");
	valorN = teclado.nextInt();
	
	for (int i = 0; i < numeros.length; i++ ) {
		
		if (valorN == numeros[i]) {
			System.out.println("En la posicion " + i + " el valor es " + valorN );
			} else { 
			}
		}
	}

}
