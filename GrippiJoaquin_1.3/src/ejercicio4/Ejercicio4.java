/*
 * Autor: JoaquinGrippi
 * Descripcion: Explicar variables Ceil, floor y round de la clase Math
 * Fecha: 01/10/25
 * 
 */


package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double variable ;
		
		System.out.print("Introduce el valor de la variable decimal: ");
		variable = teclado.nextDouble();
		
		double redondeaHaciaArriba = Math.ceil(variable) ; 
		System.out.println("La variable Ceil redonde hacia arriba: " + redondeaHaciaArriba);
		
		double redondeHaciaAbajo = Math.floor(variable);
		System.out.println("La variable floor redonde hacia abajo: " + redondeHaciaAbajo);
		
		double redondear = Math.round(variable);
		System.out.println("La variable round redonde hacia el entero mas cercano: " + redondear);
		
		
		

	}

}
