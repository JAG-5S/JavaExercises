/*
 * Autor: Joaquin Adrian Grippi
 * Descripcion: el usuario debe introducir 20 valor, 10 unidades para dos arrays diferentes y posteriormente comprara los arrays
 * Fecha: 13/11/25
 */
package ejercicio17;

import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio17 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int[] primerosDiez = new int[10];
	        int[] ultimosDiez = new int[10];

	        System.out.println("Introduce 20 números enteros:");

	        for (int i = 0; i < 10; i++) {
	            System.out.print("Valor " + (i + 1) + ": ");
	            primerosDiez[i] = scanner.nextInt();
	        }

	        for (int i = 0; i < 10; i++) {
	            System.out.print("Valor " + (i + 11) + ": ");
	            ultimosDiez[i] = scanner.nextInt();
	        }

	        boolean sonIguales = Arrays.equals(primerosDiez, ultimosDiez);

	        if (sonIguales) {
	            System.out.println("Los dos arrays son iguales.");
	        } else {
	            System.out.println("Los dos arrays son diferentes.");
	        }

	}

}
