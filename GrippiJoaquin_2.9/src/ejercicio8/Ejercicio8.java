/*
 * Autor:Joaquin Grippi
 * Descripcion:Escribe un programa Java que lea una secuencia de números no nulos hasta que se introduzca un 0, y luego muestre si ha leído algún número negativo, cuantos positivos y cuantos negativos.
 * Fecha: 24/10/25
 */
package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num, contador = 1;
		int numNegativo = 0, numPositivo = 0;
		
		do {
			System.out.print(contador + "_Introduce un numero: ");
			num = teclado.nextInt();
				if (num < 0) {
					numNegativo++;
				} else if (num > 0) {
					numPositivo++;
				} 
			contador++;
		}while(num != 0);
		if (numNegativo < 0) {
			System.out.println("Hubo un total de " + numPositivo + " Numeros Positivos pero no hubieron negativos");
		}else if (numPositivo < 0) {
			System.out.println("Hubo un total de " + numNegativo + " Numeros Negativos pero no hubieron Positivos");
		}else {
		System.out.println("Hubo un total de " + numPositivo + " Numeros Positivos" + " y un total de " + numNegativo + " Numeros Negativos");
		}

	}

}
