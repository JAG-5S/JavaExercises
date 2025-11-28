/*
 * Autor: Joaquin Grippi
 * Descripcion: Programa que nos entrega la tabla de multiplciar de un numero. 
 * Fecha: 24/11/25
 */
package ejercicio11;
import java.util.Scanner;
public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a;
		System.out.print("Introduce un numero: ");
		a = teclado.nextInt();
		tablaDeMultiplicar(a);

	}

	public static void tablaDeMultiplicar(int a) {
		int tabla;
		for (int i = 1; i <= 10; i++ ) {
			tabla = a * i;
			System.out.print(tabla + " ");
		}
		
	}
}
