/*
 * Descrion: Se deberá realizar un programa que realice los siguientes pasos:
 Crea dos variables de tipo int, num1 y num2, inicializa ambas variables a 0.
 Crea dos variables de tipo double, val1 y val2, no las inicialices.
 Crea dos variables de tipo String nombre y apellidos, inicialízalas con tu nombre
y apellido respectivamente.
 Muestra por pantalla el valor de las variables num1 y num2 con un texto que lo
acompañe.
 Asigna un valor cualquiera acorde a su tipo a val1 y val2.
 Muestra por pantalla el valor de las variables val1 y val2 con un texto que lo
acompañe.
 Muestra por pantalla el siguiente mensaje, haciendo uso de las variables nombre
y apellidos
 * Autor: Joaquin Grippi
 * Fecha: 24/09/25
 */


package ejercicio3;

public class Ejercicio3 {

	public static void main(String[] args) {
		int num1 = 0 ;
		int	num2 = 0 ;
		double val1, val2 ;
		String nombre = "Joaquin";
		String apellidos = "Grippi Garro";
		System.out.println("En mi cuenta bancaria hay " + num1 + " euros y " + num2 + " Ingresos");
		val1 = 1.80 ;
		val2 = 1.90 ;
		System.out.println("Mi madre me dio " + " euros " + val1 + " y mi padre me dio " + val2 + " euros");
		System.out.println("Mi Nombres es " + nombre + " y mis apellidos " + apellidos);
		
	}

}
