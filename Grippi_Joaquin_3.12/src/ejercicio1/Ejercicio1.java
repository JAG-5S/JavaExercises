/*
 * Autor: Joaquin Grippi
 * descripcion: Crea un programa que cree una matriz de tamaño 5x5 que almacene los números del 1 al 25 y luego muestre la matriz por pantalla.
 * Fecha: 13/11/25
 */
package ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		int [][] matrix = new int [5][5];
		int contador= 1;
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				matrix[i][j] = contador;
				contador++;
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
