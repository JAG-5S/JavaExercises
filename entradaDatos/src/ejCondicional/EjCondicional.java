package ejCondicional;

import java.util.Scanner;

public class EjCondicional {

	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);	
		
		String nombre;
		System.out.println("Dime tu Nombre: ");
		nombre = teclado.nextLine();
		int longitud = nombre.length();
		
		
		System.out.println("Numero de Caracteres: " + longitud);
		
		
		String nombreEnMayuscula ;
		nombreEnMayuscula = nombre.toUpperCase();
		System.out.println(nombreEnMayuscula);
		System.out.println(nombre.toLowerCase());

		
		
		
		int edad;
		System.out.println("Dime Tu edad: ");
		edad = teclado.nextInt();
		
		String mayorEdad;
		mayorEdad = (edad > 18) ? "Eres Mayor de Edad" : "No eres mayor de edad" ;
		System.out.println(mayorEdad);
		

	}

}
