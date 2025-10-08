/*
 * autor: Joaquin Grippi
 * Descripcion: Un programa que pide una serie de Datos, y segun la nota que tengas te califique entre insuficiente, aprobado, notable, sobresaliente.
 * Fecha:06/10/2025
 * 
 */


package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nombre;
		String apellidos;
		String cicloFormativo;
		int notaAcademica;
		
		System.out.print("Escribe tu nombre: ");
		nombre = teclado.nextLine();
		System.out.print("Escribe tus apellidos: ");
		apellidos = teclado.nextLine();
		System.out.print("Escribe tu ciclo formativo: ");
		cicloFormativo = teclado.nextLine();
		System.out.print("Escribe tu nota academica: ");
		notaAcademica = teclado.nextInt();
		
		if (notaAcademica <= 4 ) {
			System.out.print("Nombre: " + nombre + "\nApellidos: " + apellidos + "\nCiclo Formativo: " + cicloFormativo + "\nNota Academica: " + notaAcademica + "(Insuficiente)");
			
		}
		else if (notaAcademica == 5) {
			System.out.print("Nombre: " + nombre + "\nApellidos: " + apellidos + "\nCiclo Formativo: " + cicloFormativo + "\nNota Academica: " + notaAcademica + "(Aprobado)");
		}
		else if (notaAcademica == 6) {
			System.out.print("Nombre: " + nombre + "\nApellidos: " + apellidos + "\nCiclo Formativo: " + cicloFormativo + "\nNota Academica: " + notaAcademica + "(Bien)");
		}
		else if (notaAcademica >= 7 && notaAcademica <= 8) {
			System.out.print("Nombre: " + nombre + "\nApellidos: " + apellidos + "\nCiclo Formativo: " + cicloFormativo + "\nNota Academica: " + notaAcademica + "(Notable)");
		}
		else if (notaAcademica >= 9 && notaAcademica <= 10) {
			System.out.print("Nombre: " + nombre + "\nApellidos: " + apellidos + "\nCiclo Formativo: " + cicloFormativo + "\nNota Academica: " + notaAcademica + "(Sobresaliente)");
		}
		
	
	
	}	

}
