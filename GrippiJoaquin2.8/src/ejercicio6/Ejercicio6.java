/*
 * Autor:Joaquin Grippi
 * Descripcion:Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo.
 * Fecha:20/10/25
 */
package ejercicio6;
import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num;
		
		do {
		
		System.out.println("Introduce un numero: ");
		
		num = teclado.nextInt();
		if (num >= 0) {
		System.out.println("El Cuadrado de " + num + " es " + num * num);
		}else {System.out.print("Fin del Bucle, haz introducido un numero negativo.");}
		
		} while (num >= 0 );

	}

}
