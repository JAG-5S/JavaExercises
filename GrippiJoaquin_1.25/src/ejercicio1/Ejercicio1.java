/*
 * Autor:Joaquin Grippi
 * Descripcion:
 * Fecha:03/10/25
 */


package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nombre ;
		
		System.out.print("Como te llamas? ");
		
		nombre = teclado.nextLine();
		
		System.out.println("Tu Nombre es: " + nombre);

	}

}
