/*
 * Autor: Joaquin Grippi
 * descripcion: Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas de multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la matriz por pantalla.
 * Fecha: 13/ 
 */
package ejercicio2;

public class Ejercicio2 {

	public static void main(String[] args) {
		int [][] matrix = new int[10][10];

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				matrix[i][j] = (j+1)*(i+1);
			}

		}
		
		for(int i = 0; i< matrix.length; i++) {
			for (int j = 0; j< matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
				
			}
			System.out.println();
		}


	}

}
