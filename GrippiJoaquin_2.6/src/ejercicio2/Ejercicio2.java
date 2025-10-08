/*
 * autor: Joaquin Grippi
 * Descripcion: Se debe crear un programa donde las condiciones de edad y nota sean positivas para entrar en un curso.
 * Fecha: 03/10/25
 * 
 */

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nombre;
		int edad ;
		double notaAcademica;
		
		System.out.print("Escribe tu nombre: ");
		nombre = teclado.nextLine();
		System.out.print("Escribe tu edad: ");
		edad = teclado.nextInt();
		System.out.print("Escribe tu Nota academica: ");
		notaAcademica = teclado.nextDouble();
		
		if (edad >= 18) {
			if( notaAcademica > 7 ) { System.out.print("Cumples los requisitos");  } 
			else { System.out.print("No Cumples los Requisitos"); }
		}
		else {System.out.print("No cumples los requisitos");}
	}
		
		

}


