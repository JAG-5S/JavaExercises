/*
 * Autor: JoaquinGrippi
 * Descripcion: Utilizar diferentes variables de Math para diferentes casos.
 * Fecha: 01/10/25
 * 
 */


package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double num1 ;
		double num2 ;
		
		System.out.print("Introduce el valor de la variable num1: ");
		num1 = teclado.nextDouble();
		System.out.print("Introduce el valor de la variable num2: ");
		num2 = teclado.nextDouble();
		
		double numMasPequeño = Math.min(num1, num2);
		System.out.println("El numero mas pequeño es: " + numMasPequeño);
		
		double exponente = Math.pow(num1, num2);
		System.out.println("El num1 elevado al num2 es: " + exponente);
		
		double raizCuadrada = Math.sqrt(num1);
		System.out.println("El raiz cuadrada del num1 es: " + raizCuadrada);
		
		num2 = Math.random();
		System.out.println("El nuevo valor aleatorio del num2 es: " + num2);
		
		
		
		
		

	}

}
