/*
 * Descripcion: Realziar Programa donde se solicite una serie de Datos y se muestre por pantalla.
 * Autor: Joaquin Grippi
 * Fecha: 25/09/25
 */


package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nombre;
		String apellidos;
		int edad;
		String direccion;
		double altura;
		double peso;
		
		System.out.print("Introduce Tu nombre: ");
		nombre = teclado.nextLine();
		System.out.print("Introduce Tu apellido: ");
		apellidos = teclado.nextLine();
		System.out.print("Introduce Tu direccion: ");
		direccion = teclado.nextLine();
		System.out.print("Introduce Tu edad: ");
		edad = teclado.nextInt();
		System.out.print("Introduce Tu altura: ");
		altura = teclado.nextDouble();	
		System.out.print("Introduce Tu peso: ");
		peso  = teclado.nextDouble();	
		
		System.out.print("Tu nombre es " + nombre + "\nTu apellido es " + apellidos + "\nTu edad es " + edad + "\nTu direccion es " + direccion + "\nTu altura es " + altura + "\nTu peso es " + peso);
		
	}

}
