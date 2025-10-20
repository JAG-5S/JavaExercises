/*
 * Autor:Joaquin Grippi
 * Descripcion: Bucle en el que se ingresa una serie de numeros el cual se detiene cuando el numero es 0, posteriormente muestra el total de numeros introducidos y la suma total.
 * Fecha:20/10/25
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num = 1;
		int contador = 0; 
		int numM = 0;
		
		while (num != 0) {
			System.out.println("Introduce un numero: ");
			num = teclado.nextInt();
			if (num !=0) {
				numM = numM + num;
				contador++;
			}
			
			
		}
		
		System.out.print("Se introdujeron un total de: " + contador + " numeros" + "\nLa suma de estos es: " + numM); 
		

	}

}
