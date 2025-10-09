/*
 * autor: Joaquin Grippi
 * Descripcion: Crear una calculadora.
 * Fecha:09/10/2025
 * 
 */


package ejercicio5;
import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double var1 ;
		double var2 ;
		
		int eleccion ;
		
		System.out.print("Introducir la variable 1: ");
		var1 = teclado.nextInt();
		System.out.print("Introducir la variable 2: ");
		var2 = teclado.nextInt();
		
		
		System.out.print("Indique la operación que quiere realizar (Inserte un número): " + "\n(1)  Suma" + "\n(2) Resta" + "\n(3) Multiplicación" + "\n(4) División" + "\n\n------------La Opcion elegida es: ");
		
		eleccion = teclado.nextInt();
		
		if (eleccion == 1 ) {
			double suma = var1 + var2 ;
			System.out.print("La suma es: " + suma);
		}else if (eleccion == 2 ) {
			double	resta = var1 - var2 ;
			System.out.print("La resta es: " + resta);
		}else if (eleccion == 3 ) {
			double multiplicacion = var1 * var2 ;
			System.out.print("La multiplicacion es: " + multiplicacion);
		}else if (eleccion == 4){
			double division = var1 / var2;
			System.out.print("La division es: " + division);
		} else {  	System.out.print("No elegiste ninguna opcion");  }

	}

}
