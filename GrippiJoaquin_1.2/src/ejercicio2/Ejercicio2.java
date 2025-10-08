/*
 * Descripcion: Realizar Programa donde se solicite una serie de Datos y se muestre por pantalla.
 * Autor: Joaquin Grippi
 * Fecha: 25/09/25
 */


package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nombreEquipo;
		String nombreStadio;
		int año;
		String capitan;
		
		
		System.out.print("Introduce el Nombre del equipo: ");
		nombreEquipo = teclado.nextLine();
		System.out.print("Introduce el nombre del estadio: ");
		nombreStadio = teclado.nextLine();
		System.out.print("Introduce el nombre del capitan: ");
		capitan = teclado.nextLine();
		System.out.print("Introduce el año de fundacion: ");
		año = teclado.nextInt();
		
		System.out.print( "Nombre del Equipo: " + nombreEquipo + "\nFundado en: " + año + "\nEstadio: " + nombreStadio + "\nCapitán: " + capitan);
		

	}

}
