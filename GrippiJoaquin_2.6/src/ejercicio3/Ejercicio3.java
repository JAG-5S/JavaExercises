/*
 * autor: Joaquin Grippi
 * Descripcion: Un programa donde se deba cumplir un requisito de edad, y despues pedir una serie de datos para mostrar por pantalla
 * Fecha:03/10/25
 * 
 */


package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int edad ;
		String nombre;
		String apellido;
		
		System.out.print("Introduce tu Edad: ");
		edad = teclado.nextInt();
		teclado.nextLine();
		if (edad >= 18) {
			System.out.print("Introduce Tu Nombre: ");
			nombre = teclado.nextLine();
			System.out.print("Introduce Tu Apellido: ");
			apellido = teclado.nextLine();
			
			System.out.print("Nombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad + "\nFelicidades ha sido admitido");
		}
		else {System.out.print("No cuenta con la edad requerida");}

	}

}
