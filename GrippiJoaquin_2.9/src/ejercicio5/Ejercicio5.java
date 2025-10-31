/*
 * Autor:Joaquin Grippi
 * Descripcion:Escribe un programa Java que lea un número positivo N y calcule y visualice su factorial N!
 * Fecha: 24/10/25
 */
package ejercicio5;
import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

        // Solicitar al usuario un número positivo
        System.out.print("Introduce un número entero positivo: ");
        int num = teclado.nextInt();

        // Validar que el número sea positivo
        if (num < 0) {
            System.out.println("El número debe ser positivo.");
        } else {
            int factorial = 1;

            // Calcular el factorial usando un bucle
            for (int i = 1; i <= num; i++) {
                factorial *= i;
                System.out.println(i + " != " + factorial);
            }

            // Mostrar el resultado
            System.out.println("El factorial de " + num + " es: " + factorial);
		
        }
	}

}
