/*
 * Descrion: Crear un programa en el que definamos e inicialicemos variables de los siguientes tipos:
● byte.
● short.
● entero
● carácter
● número decimal
● número flotante
● cadena de caracteres
A continuación mostraremos por pantalla un mensaje indicando el tipo de variable que es y el
valor con el que lo hemos inicializado:
 * Autor: Joaquin Grippi
 * Fecha: 24/09/25
 */

package ejercicio4;

public class Ejercicio4 {

	public static void main(String[] args) {
		byte a = 0 ;
		short b = 12 ;
		int c = 30;
		char d = 'a';
		double e = 124.2333;
		float f = 3.2f;
		String g = "Hola";
		
		System.out.println("El valor de la variable de tipo Byte (a) es: " + a);
		System.out.println("El valor de la variable de tipo Short (b) es: " + b);
		System.out.println("El valor de la variable de tipo entero (c) es: " + c);
		System.out.println("El valor de la variable de tipo caracter (d) es: " + d);
		System.out.println("El valor de la variable de tipo double (e) es: " + e);
		System.out.println("El valor de la variable de tipo float (f) es: " + f);
		System.out.println("El valor de la variable de tipo Cadena de texto (g) es: " + g);
		
	

	}

}
