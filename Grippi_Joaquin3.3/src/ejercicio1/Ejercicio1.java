package ejercicio1;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in);
	        System.out.print("Introduce una cadena de texto: ");
	        String cadena = teclado.nextLine();

	        String[] palabras = cadena.split(" ");
	        for (String palabra : palabras) {
	            System.out.println(palabra);
	        }
	}

}
