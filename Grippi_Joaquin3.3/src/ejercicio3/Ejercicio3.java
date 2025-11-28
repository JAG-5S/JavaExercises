/*
 * Autor: Joaquin Grippi
 * Descripcion:Programa que formara un codigo usuario que las primeras tres letras de nombre, priemr apellido y segundo apellido
 * Fecha: 24/11/25
 */
package ejercicio3;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = teclado.nextLine();
        System.out.print("Introduce tu primer apellido: ");
        String apellido1 = teclado.nextLine();
        System.out.print("Introduce tu segundo apellido: ");
        String apellido2 = teclado.nextLine();

        // Tomar las 3 primeras letras y concatenar
        String codigo = nombre.substring(0, 3) +
                        apellido1.substring(0, 3) +
                        apellido2.substring(0, 3);

        System.out.println("Código de usuario: " + codigo.toUpperCase());

	}

}
