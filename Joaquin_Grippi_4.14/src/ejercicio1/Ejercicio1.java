/*
 * Autor: Joaquin Grippi
 * Descripcion: Programa que mediante una funcion multiplica dos numeros.
 * Fecha: 17/11/25
 */
package ejercicio1;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double valorA, valorB, valorMultiplicacion;
		System.out.print("asigna un valor para el valor A: ");
		valorA = teclado.nextDouble();
		System.out.print("asigna un valor para el valor B: ");
		valorB = teclado.nextDouble();
		
		valorMultiplicacion = multiplica(valorA, valorB);
		
		System.out.print("La multiplicacion de A y B es: " + valorMultiplicacion);
		

	}
	
	public static double multiplica(double a, double b) {
		
		double multiplicacion = a * b;
		
		return multiplicacion;
		
		
	}

}
