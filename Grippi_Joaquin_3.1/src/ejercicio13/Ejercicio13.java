/*
 * Autor: Joaquin Adrian Grippi
 * Descripcion: Secuencia aritmetica que comienza con un valor inicial y uno secuencial.
 * Fecha: 13/11/25
 */

package ejercicio13;
import java.util.Scanner;
public class Ejercicio13 {

	public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in);

	        // Solicitar datos al usuario
	        System.out.print("Introduce el valor inicial (V): ");
	        int V = teclado.nextInt();

	        System.out.print("Introduce el incremento (I): ");
	        int I = teclado.nextInt();

	        System.out.print("Introduce el número de elementos (N): ");
	        int N = teclado.nextInt();

	        // Crear el array para almacenar la secuencia
	        int[] secuencia = new int[N];

	        // Generar la secuencia aritmética
	        for (int i = 0; i < N; i++) {
	            secuencia[i] = V + i * I;
	        }

	        // Mostrar la secuencia
	        System.out.println("Secuencia aritmética generada:");
	        for (int num : secuencia) {
	            System.out.print(num + " ");
	        }

	}

}
