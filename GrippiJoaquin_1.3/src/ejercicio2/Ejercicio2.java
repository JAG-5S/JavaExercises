/*
 * Autor: JoaquinGrippi
 * Descripcion: Pasar Euros a pesetas y pesetas a euros
 * Fecha: 01/10/25
 * 
 */

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double euros;
		double pesetas;
		
		System.out.println("Estos es un conversor de euros a pesetas y de pesetas a Euros");
		

		
		System.out.print("Ingresa los euros: " );
		euros = teclado.nextDouble();
		double eurosAPesetas = euros * 166.386 ;
		System.out.println("Las Pesetas son: " + eurosAPesetas );
		
		System.out.print("Ingresa las Pesetas: " );
		pesetas = teclado.nextDouble();
		double pesetasAEuros = pesetas / 166.386 ;
		System.out.print("Los Euros son: " + pesetasAEuros );
		
		
		
		
		
		
		
		
	


	}

}
