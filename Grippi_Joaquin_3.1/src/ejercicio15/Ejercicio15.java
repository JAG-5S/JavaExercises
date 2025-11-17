/*
 * Autor: Joaquin Adrian Grippi
 * Descripcion: El usuario introduce dos valores y posteriormente el segundo valor se introduce en otdas las posiciones
 * Fecha: 13/11/25
 */

package ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
	        Scanner teclado = new Scanner(System.in);

	       
	        System.out.print("Introduce el tamaño del array (N): ");
	        int N = teclado.nextInt();

	        System.out.print("Introduce el valor a insertar (M): ");
	        int M = teclado.nextInt();

	        
	        int[] array = new int[N];
	        for (int i = 0; i < N; i++) {
	            array[i] = M;
	        }

	        for (int factores : array) { 
	        	System.out.print(factores + " ");}
	}

}
