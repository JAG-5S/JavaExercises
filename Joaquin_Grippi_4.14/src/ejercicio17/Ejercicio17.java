/*
 * Autor: Joaquin Grippi
 * Descripcion: Programa que nos dice si un numero es primo 
 * Fecha: 24/11/25
 */
package ejercicio17;
import java.util.Scanner;
public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int contador = 0, numero;
		boolean primo = true;
		while(contador != 1) {
			System.out.print("Introduce un numero: ");
			numero = teclado.nextInt();
			if (numero == 0) {
				System.out.println("Fin");
				contador++;
			}else {
				primo = esPrimo(numero);
			}
			System.out.println("este numero es primo: " + primo);
		}

	}
	
	public static boolean esPrimo (int numero) {
		  if (numero <= 1) {
	            return false; 
	        }
	        for (int i = 2; i <= Math.sqrt(numero); i++) {
	            if (numero % i == 0) {
	                return false; 
	            }
	        }
	        return true; 
		
	}

}
