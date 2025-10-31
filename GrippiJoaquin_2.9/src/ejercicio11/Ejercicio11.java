/*
 * Autor:Joaquin Grippi
 * Descripcion:Escribe un programa Java que suma independientemente los pares y los impares de los números comprendidos entre 100 y 200, y luego muestra por pantalla ambas sumas.
 * Fecha: 24/10/25
 */
package ejercicio11;

public class Ejercicio11 {

	public static void main(String[] args) {
		int sumaImpares = 0, sumaPares= 0;
		
		for (int i = 100;i < 200; i++) {
			 
			if (i % 2 == 0) {
	                sumaPares = sumaPares + i;
	            }else {
	            	sumaImpares = sumaImpares + i;
	            }
			
		}
		System.out.println("Los numeros pares suman: " + sumaPares + "\nLos numeros impares suman: " + sumaImpares);

	}

}
