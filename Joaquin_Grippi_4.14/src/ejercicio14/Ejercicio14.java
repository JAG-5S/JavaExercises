/*
 * Autor: Joaquin Grippi
 * Descripcion: Programa que hace una piramide 
 * Fecha: 24/11/25
 */
package ejercicio14;

public class Ejercicio14 {

	public static void main(String[] args) {
		int lineas = 6;
		char caracter = '@';

		piramide(caracter, lineas);
	}
	
	public static void piramide(char caracter, int lineas) {
		for (int i = 1; i <= lineas; i++) {
			int espacios = lineas - i;
			int caracteres = 2 * i - 1;
			System.out.print(" ".repeat(espacios));
			System.out.print(String.valueOf(caracter).repeat(caracteres));
			System.out.println();
		}
		
	}

}
