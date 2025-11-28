/*
 * Autor: Joaquin Grippi
 * Descripcion:Crea un programa que pida dos cadenas de texto por teclado y luego indique si son iguales, además de si son iguales sin diferenciar entre mayúsculas y minúsculas.
 * Fecha: 24/11/25
 */
package ejercicio2;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la primera cadena: ");
        String cadena1 = teclado.nextLine();

        System.out.print("Introduce la segunda cadena: ");
        String cadena2 = teclado.nextLine();

        if (cadena1.equals(cadena2)) {
            System.out.println("Las cadenas son exactamente iguales.");
        } else {
            System.out.println("Las cadenas son diferentes.");
        }

        if (cadena1.equalsIgnoreCase(cadena2)) {
            System.out.println("Las cadenas son iguales (ignorando mayúsculas/minúsculas).");
        } else {
            System.out.println("Las cadenas son diferentes incluso ignorando mayúsculas/minúsculas.");
        }

	}

}
