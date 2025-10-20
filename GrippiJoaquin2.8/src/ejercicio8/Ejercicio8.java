/*
 * Autor:Joaquin Grippi
 * Descripcion:Mediante el uso de bucles y condicionales crear un programa que entregue una serie de datos sobre media recorrida en rutas de senderismo, ruta mas larga y la ciudad de la ruta mas larga.
 * Fecha:20/10/25
 */
package ejercicio8;

import java.util.Scanner;


public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nombre, apellidos, ciudad, ciudadMax = "Nothing";
		int edad, numParticipantes;
		double numeroDeRutasRealizadas, distanciaDeLaUltimaRuta, ciudadnum, distancia = 0, distanciaMax = 0; 
		
		System.out.print("Escribe tu nombre: ");
		nombre = teclado.nextLine();
		System.out.print("Escribe tu apellido: ");
		apellidos = teclado.nextLine();
		
		do {
			System.out.print("Escribe tu edad: ");
			edad = teclado.nextInt();
			if (edad >=17 && edad <=45) {
					
				}else {
					System.out.println("Esa edad no es correcta");
				}
		}while (edad < 17 | edad > 45);
		
		System.out.print("Escribe tu numero de Rutas Realizadas: ");
		numeroDeRutasRealizadas = teclado.nextDouble();
		System.out.print("Escribe la Distancia de tu ultima Ruta: ");
		distanciaDeLaUltimaRuta = teclado.nextDouble();
	
		for (int i = 1; i <= 5; i++) {
			double distanciaB = 0;
			System.out.println("Esta es la Caminata numero: " + i);
			System.out.println("Escribe la distancia Recorrida: ");
			distanciaB = teclado.nextDouble();
			distancia = distancia + distanciaB;
			System.out.println("Escribe el numero de participantes: ");
			numParticipantes = teclado.nextInt();
			teclado.nextLine();
			System.out.println("Escribe el Nombre de la Ciudad: ");
			ciudad = teclado.nextLine();
			
			if (distanciaB > distanciaMax ) {
				distanciaMax = distanciaB;
				ciudadMax = ciudad;
			
			
			}else {}
		}
		
		double distanciaM = distancia / 5;
		
		System.out.println("---------------------");
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("edad: " + edad);
		System.out.println("\nLa distancia media es: " + distanciaM);
		System.out.println("La distancia mas larga de las ultimas 5 rutas: " + distanciaMax);
		System.out.println("Ciudad de la ruta mas larga: " + ciudadMax);
		System.out.println("---------------------");
		
		

	}

}
