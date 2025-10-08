/*
 * Autor:Joaquin Grippi
 * Descripcion:Escribir un programa en Java que pregunte tu nombre, dirección y teléfono y escriba en pantalla una ficha.
 * Fecha:03/10/25
 */


package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nombre ;
		String direccion ;
		int telefono;
		
		System.out.print("Tu nombre es: ");
		nombre = teclado.nextLine();
		System.out.print("Tu direccion es: ");
		direccion = teclado.nextLine();
		System.out.print("Tu Telefono es: ");
		telefono = teclado.nextInt();
		
		System.out.print("Tu nombre es: " + nombre + "\nTu Direccion es: " + direccion + "\nTu Telefono es: " + telefono);
		
		

	}

}
