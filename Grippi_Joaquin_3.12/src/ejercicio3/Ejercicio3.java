/*
 * Autor: Joaquin Grippi
 * descripcion: Programa de tamaño NxM donde se introduce una serie de valores y posteriormente se dice cuales son negativos, positivos o iguales a cero
 * Fecha: 
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int [][] matrix;
		
		int tamanyoN, tamanyoM;
		
		System.out.print("Introduce el numero N: ");
		tamanyoN = teclado.nextInt();
		System.out.print("Introduce el numero M: ");
		tamanyoM = teclado.nextInt();
		int numPositivos=0,numNegativos=0,igualZero=0;
		
		matrix = new int [tamanyoN][tamanyoM];
		
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < tamanyoM; j++) {
				System.out.print("Introduce un valor: ");
				matrix[i][j] = teclado.nextInt();
			}

		}
		
		for(int i = 0; i< matrix.length; i++) {
			for (int j = 0; j< matrix.length; j++) {
				if (matrix[i][j] > 0) {
					numPositivos++;
				}else if(matrix[i][j] == 0) {
					igualZero++;
				}else {
					numNegativos++;
				}
			}
		}
		
		System.out.print("Los valores mayores que sero son: " + numPositivos
				+"\nLos Menores que zero son: " + numNegativos
				+"\nLos iguales a zero son: "+ igualZero);
		
	
	
	}

}
