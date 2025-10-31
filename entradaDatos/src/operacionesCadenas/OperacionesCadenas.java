package operacionesCadenas;

import java.util.Scanner;

public class OperacionesCadenas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String cadena;
		System.out.println("Dame una cadena de caracteres");
		cadena = teclado.nextLine();
		
		//Mostrar amplitud de la cadena

        System.out.println("Longitud de la cadena: " + cadena.length());
		//Mostrar Primer caracter de la cadena
        System.out.println("Primer caracter: " + cadena.charAt(0));
		//Mostar el ultimo caracter de la cadena
        System.out.println("Último caracter: " + cadena.charAt(cadena.length() - 1));
        //Mostrar la segunda palabra de la cadena 
        String[] palabras = cadena.split(" ");
        System.out.println("Segunda palabra: " + palabras[1]);
        //Mostrar la cadena con la primera y la ultima palabra en mayuscula
        

	}

}
