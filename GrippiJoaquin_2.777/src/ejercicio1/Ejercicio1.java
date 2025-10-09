/*
 * autor: Joaquin Grippi
 * Descripcion: Un programa que pide una serie de datos, y que segun edad o salario deseado descarte candidatos y posteriormente descarte por experiencia y proyectos.
 * Fecha:08/10/2025
 * 
 */


package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nombre ;
		String apellidos ; 
		int edad ;
		double salarioDeseado;
		int anyoDeExperiencia ;
		int proyectosAnteriores ;
		
		
		
		System.out.print("Escribe Tu Nombre: ");
		nombre = teclado.nextLine();
		System.out.print("Escribe tus apellidos: ");
		apellidos = teclado.nextLine();
		System.out.print("Escribe tu edad: ");
		edad = teclado.nextInt();
		System.out.print("Escribe tu salario deseado: ");
		salarioDeseado = teclado.nextDouble();
		
		if (salarioDeseado > 0 && salarioDeseado < 30000 || edad > 18 && edad < 45) {
			
			System.out.print("Escribe tus años de experiencia: ");
			anyoDeExperiencia = teclado.nextInt();
			System.out.print("Escribe en cuatos proyectos has trabajado: ");
			proyectosAnteriores = teclado.nextInt();
				 if (anyoDeExperiencia > 2 && proyectosAnteriores > 3) {
					System.out.print("Enhorabuena. Ha sido contratado");
			} else { System.out.print("Lo sentimos pero no cumple nuestro perfil"); } 
			} else {
			System.out.print(" Lo sentimos pero no cumple nuestro perfil");
			}	
	}

}
