/*
 * Autor: Joaquin Grippi
 * Descripcion: Programa que identifique palindromos.
 * Fecha: 24/11/25
 */
package ejercicio5;
import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase = teclado.nextLine();

        // Eliminar espacios y pasar a minusculas
        String limpia = frase.replace(" ", "").toLowerCase();

        // Invertir la cadena
        String invertida = new StringBuilder(limpia).reverse().toString();

        if (limpia.equals(invertida)) {
            System.out.println("La frase es un palindromo.");
        } else {
            System.out.println("La frase NO es un palindromo.");
        }

	}

}
