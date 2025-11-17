/*
 * Autor: Joaquin Adrian Grippi
 * Descripcion: Crea un programa que pida veinte números reales por teclado, los almacene en un array y luego lo recorra para calcular y mostrar la media: (suma de valores) / nº de valores. 
 * Fecha: 13/11/25
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
		
		int numeros[] = new int[20];
		int num, numSuma = 0;
		
		 for (int i = 0; i <= 19; i++) {
			 System.out.println(i + "_Escribe un numero");
			 num = teclado.nextInt();
			 numeros[i] = num;
			
		 }
		 
		 for (int i = 0; i < numeros.length; i++) {
			numSuma += numeros[i];
		 }
		 int mediaNum = numSuma / 20;
		 
		 System.out.println("La media de la suma de todos los numeros es: " + mediaNum);

	}

}
