/*
 * autor: Joaquin Grippi
 * Descripcion: Un programa que pide una serie de datos pra calcular la media de 4 compras y si supera los 300 euros entregar un cupon de 50 euros
 * Fecha:03/10/25
 * 
 */

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nombre ;
		String apellidos ;
		double importeGastado1;
		double importeGastado2;
		double importeGastado3;
		double importeGastado4;
		
		System.out.print("Escribe tu Nombre: ");
		nombre = teclado.nextLine();
		System.out.print("Escribe tu Apellidos: ");
		apellidos = teclado.nextLine();
		System.out.print("Importe Gastado 1: ");
		importeGastado1 = teclado.nextDouble();
		System.out.print("Importe Gastado 2: " );
		importeGastado2 = teclado.nextDouble();
		System.out.print("Importe Gastado 3: ");
		importeGastado3 = teclado.nextDouble();
		System.out.print("Importe Gastado 4: ");
		importeGastado4 = teclado.nextDouble();
		
		double mediaGastada = ((importeGastado1 + importeGastado2 + importeGastado3 + importeGastado4)/4);
		
		System.out.println("Nombre: " + nombre + "\nApellidos: " + apellidos + "\nImporte Gastado1: " + importeGastado1 +  "\nImporte Gastado2: " + importeGastado2 +
				"\nImporte Gastado3: " + importeGastado3 + "\nImporte Gastado4: " + importeGastado4 + "\n\nSu importe medio es: " + mediaGastada);
		
		
		if (mediaGastada >= 300) {
			System.out.println("Felicidades has ganado un cupon de 50 euros");
		}
		else {
			System.out.println("Lo sentimos pero sus compras no han alcanzado los 300 euros este mes, no dispone del descuento ");
		}
		
		
	}
}
