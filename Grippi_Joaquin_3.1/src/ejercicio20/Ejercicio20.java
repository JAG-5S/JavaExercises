/*
 * Autor: Joaquin Adrian Grippi
 * Descripcion: array de tamalos mil con valores aleatorios netre 0 y 99, posteriormente se pedira un valor y se confirmara si existe en el array
 * Fecha: 13/11/25
 */
package ejercicio20;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
			int[] array = new int[1000];

	        // Rellenar el array con valores aleatorios entre 0 y 99
	        for (int i = 0; i < array.length; i++) {
	            array[i] = (int)(Math.random() * 100);
	        }

	        // Pedir al usuario un valor N
	        Scanner teclado = new Scanner(System.in);
	        System.out.print("Introduce un valor N entre 0 y 99: ");
	        int N = teclado.nextInt();

	        // Buscar cuántas veces aparece N en el array
	        int contador = 0;
	        for (int valor : array) {
	            if (valor == N) {
	                contador++;
	            }
	        }

	        // Mostrar el resultado
	        if (contador > 0) {
	            System.out.println("El valor " + N + " existe en el array y aparece " + contador + " veces.");
	        } else {
	            System.out.println("El valor " + N + " no existe en el array.");
	        }

	}

}
