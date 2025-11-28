/*
 * Autor: Joaquin Grippi
 * Descripcion: Programa que llena una array con numeros ramdons
 * Fecha: 24/11/25
 */
package ejercicio16;
import java.util.Scanner;
public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a;
		int matrix[];
		System.out.print("Introduce un numero que definira el tamaño de la matrix: ");
		a = teclado.nextInt();
		matrix = new int[a];
		matrixRandom(matrix);
	}

	public static void matrixRandom(int a[]) {
		for (int i = 0; i <= a.length; i++) {
			a[i] = (int)Math.random();
		}
		
	}
}
