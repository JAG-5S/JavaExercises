/*
 * Autor: JoaquinGrippi
 * Descripcion: intercambiar los valores de las variables num1 y num2
 * Fecha: 01/10/25
 * 
 */


package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double num1 ;
		double num2 ;
		
		System.out.println("Se realizara un intercambio entre el valor de la variable num1 y la num2");
		
		System.out.print("Ingrese el valor de la variable num1: ");
		num1 = teclado.nextDouble();		
		System.out.print("Ingrese el valor de la variable num2: ");
		num2 = teclado.nextDouble();
		
		double nnum1 = num2;
		num2 = num1;
		
		System.out.print("El Valor de la variable num1 es: " + nnum1 + "\nEl Valor de la variable num2 es: " + num2);
		

	}

}
